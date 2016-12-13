package com.jor.xxmaster.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.jor.xxmaster.R;
import com.jor.xxmaster.activity.MsgPushActivity;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author Jorble
 * @description 新闻
 */
public class SettingFragment extends Fragment {

    private static final SettingFragment instance = new SettingFragment();
    @Bind(R.id.msgPushIb)
    ImageButton msgPushIb;
    @Bind(R.id.aboutIb)
    ImageButton aboutIb;

    public static SettingFragment getInstance() {
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
        View view = inflater.inflate(R.layout.frag_setting, null);

        ButterKnife.bind(this, view);
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

    @OnClick({R.id.msgPushIb, R.id.aboutIb})
    public void onClick(View view) {
        switch (view.getId()) {
            //消息推送
            case R.id.msgPushIb:
                MsgPushActivity.startActivity(getActivity());
                break;
            //关于
            case R.id.aboutIb:
                break;
        }
    }
}
