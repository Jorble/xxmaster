package com.jor.xxmaster.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.jor.xxmaster.R;
import com.jor.xxmaster.app.App;
import com.jor.xxmaster.app.Cfg;
import com.jor.xxmaster.utils.RegExpValidatorUtils;
import com.wilddog.client.Wilddog;
import com.wilddog.client.WilddogError;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RegisterActivity extends Activity {

    @Bind(R.id.register_email_et)
    EditText registerEmailEt;
    @Bind(R.id.register_pwd_et)
    EditText registerPwdEt;
    @Bind(R.id.register_again_pwd_et)
    EditText registerAgainPwdEt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.register_back_ib, R.id.register_bt})
    public void onClick(View view) {
        switch (view.getId()) {
            /*******************************
             *              返回            *
             *******************************/
            case R.id.register_back_ib:
                finish();
                break;
            /*******************************
             *              注册            *
             *******************************/
            case R.id.register_bt:
                //获取用户填入信息
                String email=registerEmailEt.getText().toString();
                String password=registerPwdEt.getText().toString();
                String passwordAgain=registerAgainPwdEt.getText().toString();
                //验证信息并创建用户
                if(RegExpValidatorUtils.isEmail(email) && password.equals(passwordAgain)) {
                    Wilddog ref = new Wilddog(Cfg.USER_REF);
                    ref.createUser(email, password, new RegResultHandler());
                }else {
                    Toast.makeText(App.getContext(),"注册失败，信息输入不正确！",Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

    /**
     * Created by Jorble on 2016/5/16.
     * 注册回调
     */
    public class RegResultHandler implements Wilddog.ResultHandler {
        public void onSuccess() {
            Toast.makeText(App.getContext(), "注册成功！", Toast.LENGTH_SHORT).show();
            finish();
        }

        public void onError(WilddogError error) {
            if(error != null){
                Toast.makeText(App.getContext(),"注册异常，请检查网络！",Toast.LENGTH_SHORT).show();
            }
        }

    }

    /**
     * 启动活动
     *
     * @param activity
     */
    public static void startActivity(Activity activity) {
        activity.startActivity(new Intent(activity, RegisterActivity.class));
    }

}
