package com.jor.xxmaster.menu.ofo;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.jor.xxmaster.R;
import com.jor.xxmaster.app.App;
import com.jor.xxmaster.app.Cfg;
import com.jor.xxmaster.entity.Bike;
import com.jor.xxmaster.utils.T;
import com.wilddog.client.DataSnapshot;
import com.wilddog.client.ValueEventListener;
import com.wilddog.client.Wilddog;
import com.wilddog.client.WilddogError;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author Jorble
 * @description 新闻
 */
public class OfoFragment extends Fragment {

    private static final OfoFragment instance = new OfoFragment();

    @Bind(R.id.addId_et)
    EditText addIdEt;
    @Bind(R.id.addPwd_et)
    EditText addPwdEt;
    @Bind(R.id.addBike_bt)
    Button addBikeBt;
    @Bind(R.id.add_ll)
    LinearLayout addLl;
    @Bind(R.id.id_et)
    EditText idEt;
    @Bind(R.id.get_ib)
    ImageButton getIb;
    @Bind(R.id.pwd_tv)
    TextView pwdTv;

    public static OfoFragment getInstance() {
        return instance;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_ofo, null);
        ButterKnife.bind(this, view);

        //如果是管理员身份605829472@qq.com,则显示新增车牌功能
        String user = App.getAcache().getAsString(Cfg.USER_EMAIL_KEY);
        if (user != null && user.equals("605829472@qq.com")) {
            addLl.setVisibility(View.VISIBLE);
        }else{
            addLl.setVisibility(View.GONE);
        }

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @OnClick({R.id.addBike_bt, R.id.get_ib})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.addBike_bt:
                addBike();
                break;
            case R.id.get_ib:
                getPwd();
                break;
        }
    }

    /**
     * 新增车牌
     */
    private void addBike(){

        //车牌号
        String id=addIdEt.getText().toString();
        if(TextUtils.isEmpty(id)){
            T.showShort(getContext(),R.string.bike_id_empty);
            return;
        }
        if(id.length()<4 || id.length()>8 ){
            T.showShort(getContext(),R.string.bike_id_error);
            return;
        }

        //车牌密码
        String pwd=addPwdEt.getText().toString();
        if(TextUtils.isEmpty(pwd)){
            T.showShort(getContext(),R.string.bike_pwd_empty);
            return;
        }
        if(pwd.length()!=4 ){
            T.showShort(getContext(),R.string.bike_pwd_error);
            return;
        }

        //新增车辆
        Bike bike=new Bike(id,pwd);
        Wilddog ref = new Wilddog(Cfg.OFO_REF);
        ref.child(bike.getId()).setValue(bike.getPwd(), new Wilddog.CompletionListener() {
            public void onComplete(WilddogError error, Wilddog ref) {
                if(error != null) {
                    T.showShort(getContext(),"error:"+error.getCode());
                    return;
                }
                addIdEt.setText("");
                addPwdEt.setText("");
                addIdEt.requestFocus();
                T.showShort(getContext(),R.string.add_success);
            }
        });
    }

    /**
     * 获取密码
     */
    private void getPwd(){

        //车牌号
        String id=idEt.getText().toString();
        if(TextUtils.isEmpty(id)){
            T.showShort(getContext(),R.string.bike_id_empty);
            return;
        }
        if(id.length()<4 || id.length()>8 ){
            T.showShort(getContext(),R.string.bike_id_error);
            return;
        }

        Wilddog ref = new Wilddog(Cfg.OFO_REF).child(id);
        // 设置一个Listener，用来读取数据
        ref.addValueEventListener(new ValueEventListener(){
            public void onDataChange(DataSnapshot snapshot) {
//                T.showShort(getContext(),(String)snapshot.getValue());
                String pwd=(String)snapshot.getValue();
                if(TextUtils.isEmpty(pwd)){
                    T.showShort(getContext(),R.string.bike_id_not_exist);
                    pwdTv.setVisibility(View.GONE);
                    //启动外部应用
                    openCLD("so.ofo.labofo",getContext());
                }else{
                    pwdTv.setText(pwd);
                    pwdTv.setVisibility(View.VISIBLE);
                }
            }

            public void onCancelled(WilddogError error) {
                if(error != null){
                    T.showShort(getContext(),"error:"+error.getCode());
                }
            }
        });

    }

    /**
     * 打开外部应用
     * @param packageName
     * @param context
     */
    public static void openCLD(String packageName,Context context) {
        PackageManager packageManager = context.getPackageManager();
        PackageInfo pi = null;

        try {

            pi = packageManager.getPackageInfo(packageName, 0);
        } catch (PackageManager.NameNotFoundException e) {

        }
        Intent resolveIntent = new Intent(Intent.ACTION_MAIN, null);
        resolveIntent.addCategory(Intent.CATEGORY_LAUNCHER);
        resolveIntent.setPackage(pi.packageName);

        List<ResolveInfo> apps = packageManager.queryIntentActivities(resolveIntent, 0);

        ResolveInfo ri = apps.iterator().next();
        if (ri != null ) {
            String className = ri.activityInfo.name;

            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_LAUNCHER);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

            ComponentName cn = new ComponentName(packageName, className);

            intent.setComponent(cn);
            context.startActivity(intent);
        }
    }
}
