package com.jor.xxmaster.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.jor.xxmaster.app.MainActivity;
import com.jor.xxmaster.register.RegisterActivity;
import com.jor.xxmaster.app.App;
import com.jor.xxmaster.app.Cfg;
import com.jor.xxmaster.utils.RegExpValidatorUtils;
import com.wilddog.client.AuthData;
import com.wilddog.client.Wilddog;
import com.wilddog.client.WilddogError;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.jpush.android.api.JPushInterface;

public class LoginActivity extends Activity {

    @Bind(com.jor.xxmaster.R.id.email_et)
    EditText emailEt;
    @Bind(com.jor.xxmaster.R.id.password_et)
    EditText passwordEt;

    String email;
    String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.jor.xxmaster.R.layout.activity_login);
        ButterKnife.bind(this);

        //如果登录过，则初始化登录框信息
        if(App.getAcache().getAsString(Cfg.USER_EMAIL_KEY)!=null
                && App.getAcache().getAsString(Cfg.USER_PWD_KEY)!=null) {
            emailEt.setText(App.getAcache().getAsString(Cfg.USER_EMAIL_KEY));
            passwordEt.setText(App.getAcache().getAsString(Cfg.USER_PWD_KEY));
        }
    }

    @OnClick({com.jor.xxmaster.R.id.login_bt, com.jor.xxmaster.R.id.register_tv, com.jor.xxmaster.R.id.lostpwd_tv})
    public void onClick(View view) {
        switch (view.getId()) {
            /*******************************
             *              登录            *
             *******************************/
            case com.jor.xxmaster.R.id.login_bt:
                //获取用户填入信息
                email=emailEt.getText().toString();
                password=passwordEt.getText().toString();
                //验证信息并登录
                if(RegExpValidatorUtils.isEmail(email) && password.equals(password)) {
                    Wilddog ref = new Wilddog(Cfg.USER_REF);
                    ref.authWithPassword(email, password, new AuthResultHandler());
                }else {
                        Toast.makeText(App.getContext(),"登录失败，信息输入不正确！",Toast.LENGTH_SHORT).show();
                    }
                break;
            /*******************************
             *              注册            *
             *******************************/
            case com.jor.xxmaster.R.id.register_tv:
                RegisterActivity.startActivity(this);
                break;
            /*******************************
             *            忘记密码          *
             *******************************/
            case com.jor.xxmaster.R.id.lostpwd_tv:
                break;
        }
    }

    /**
     * Created by Jorble on 2016/5/16.
     * 登录认证回调
     */
    public class AuthResultHandler implements Wilddog.AuthResultHandler{

        @Override
        public void onAuthenticated(AuthData authData) {
            //保存到缓存
            App.getAcache().put(Cfg.USER_EMAIL_KEY,email);
            App.getAcache().put(Cfg.USER_PWD_KEY,password);
            //认证成功
            MainActivity.startActivity(LoginActivity.this);
            finish();
        }

        @Override
        public void onAuthenticationError(WilddogError wilddogError) {
            if(wilddogError.equals(WilddogError.DISCONNECTED) || wilddogError.equals(WilddogError.NETWORK_ERROR)){
                Toast.makeText(App.getContext(), "登录失败，请检查网络！", Toast.LENGTH_SHORT).show();
            }else if(wilddogError.equals(WilddogError.INVALID_PASSWORD)){
                Toast.makeText(App.getContext(), "登录失败，请检查用户名密码！", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(App.getContext(), "登录失败！", Toast.LENGTH_SHORT).show();
            }
        }
    }

    /**
     * 启动活动
     *
     * @param activity
     */
    public static void startActivity(Activity activity) {
        activity.startActivity(new Intent(activity, LoginActivity.class));
    }

    @Override
    protected void onPause() {
        super.onPause();
        JPushInterface.onPause(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        JPushInterface.onResume(this);
    }
}
