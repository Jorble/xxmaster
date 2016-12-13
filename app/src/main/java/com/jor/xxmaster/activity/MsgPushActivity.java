package com.jor.xxmaster.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.jor.xxmaster.R;
import com.jor.xxmaster.view.PushSlideSwitchView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.jpush.android.api.JPushInterface;

public class MsgPushActivity extends Activity {


    @Bind(R.id.msgpush_back_ib)
    ImageButton msgpushBackIb;
    @Bind(R.id.banPushSv)
    PushSlideSwitchView banPushSv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_msgpush);
        ButterKnife.bind(this);

        //查询是否已禁止推送
        boolean pushStatu=JPushInterface.isPushStopped(getApplicationContext());
        //按钮设置为相应状态
        banPushSv.setChecked(pushStatu);

        banPushSv.setOnChangeListener(new PushSlideSwitchView.OnSwitchChangedListener() {
            @Override
            public void onSwitchChange(PushSlideSwitchView switchView, boolean isChecked) {
                if (isChecked) {
                    //极光推送服务会被停止掉
                    JPushInterface.stopPush(getApplicationContext());
                } else {
                    //极光推送服务会恢复正常工作
                    JPushInterface.resumePush(getApplicationContext());
                }
            }
        });
    }


    /**
     * 启动活动
     *
     * @param activity
     */
    public static void startActivity(Activity activity) {
        activity.startActivity(new Intent(activity, MsgPushActivity.class));
    }

    @OnClick({R.id.msgpush_back_ib})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.msgpush_back_ib:
                finish();
                break;
        }
    }
}
