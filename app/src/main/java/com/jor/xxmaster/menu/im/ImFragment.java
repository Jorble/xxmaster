package com.jor.xxmaster.menu.im;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.hyphenate.EMCallBack;
import com.hyphenate.chat.EMClient;
import com.hyphenate.easeui.EaseConstant;
import com.hyphenate.easeui.ui.EaseChatFragment;
import com.jor.xxmaster.R;
import com.jor.xxmaster.app.App;
import com.jor.xxmaster.app.Cfg;
import com.jor.xxmaster.utils.L;
import com.jor.xxmaster.utils.T;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * @author Jorble
 * @description 新闻
 */
public class ImFragment extends Fragment {

    private static final ImFragment instance = new ImFragment();
    @Bind(R.id.container_fl)
    FrameLayout containerFl;

    //默认
    String userName = "jorble";
    String toUserName = "boat";
    String password = "123456";

    public static ImFragment getInstance() {
        return instance;
    }

    View view;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @SuppressLint("ShowToast")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag_im, null);

        ButterKnife.bind(this, view);

        String appUser = App.getAcache().getAsString(Cfg.USER_EMAIL_KEY);
        //如果登录过，则初始化登录框信息
        if (appUser != null && appUser.equals("563738103@qq.com")) {
            userName = "boat";
            toUserName = "jorble";
        }

        L.i("appUser:" + appUser);
        L.i("userName:" + userName);
        L.i("toUserName:" + toUserName);
        EMClient.getInstance().login(userName, password, new EMCallBack() {//回调
            @Override
            public void onSuccess() {
                EMClient.getInstance().groupManager().loadAllGroups();
                EMClient.getInstance().chatManager().loadAllConversations();
                L.i("登录聊天服务器成功:" + userName);
            }

            @Override
            public void onProgress(int progress, String status) {

            }

            @Override
            public void onError(int code, String message) {
                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        T.showShort(getContext(),"连接失败:"+userName);
                    }
                });

                L.i("登录聊天服务器失败+" + userName);
            }
        });


        //new出EaseChatFragment或其子类的实例
        EaseChatFragment chatFragment = new EaseChatFragment();
        //传入参数
        Bundle args = new Bundle();
        args.putInt(EaseConstant.EXTRA_CHAT_TYPE, EaseConstant.CHATTYPE_SINGLE);
        args.putString(EaseConstant.EXTRA_USER_ID, toUserName);
        chatFragment.setArguments(args);
        getFragmentManager().beginTransaction().add(R.id.container_fl, chatFragment).commit();

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
        EMClient.getInstance().logout(true);
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
    }

}
