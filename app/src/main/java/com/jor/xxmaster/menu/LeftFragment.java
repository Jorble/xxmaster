package com.jor.xxmaster.menu;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jor.xxmaster.R;
import com.jor.xxmaster.app.App;
import com.jor.xxmaster.app.Cfg;
import com.jor.xxmaster.app.MainActivity;
import com.jor.xxmaster.menu.face.FaceFragment;
import com.jor.xxmaster.menu.im.ImFragment;
import com.jor.xxmaster.menu.news.NewsFragment;
import com.jor.xxmaster.menu.ofo.OfoFragment;
import com.jor.xxmaster.menu.setting.SettingFragment;
import com.jor.xxmaster.view.CircleImageView;

/**
 * @author wuwenjie
 * @date 2014/11/14
 * @description 侧边栏菜单
 */
public class LeftFragment extends Fragment implements OnClickListener {
    private View newsView;
    private View ofoView;
    private View faceView;
    private View imView;
    private View settingView;

    CircleImageView profile_image;
    TextView userName_tv;

    private static final LeftFragment instance = new LeftFragment();

    public static LeftFragment getInstance() {
        return instance;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_menu, null);
        findViews(view);

        return view;
    }


    public void findViews(View view) {
        profile_image = (CircleImageView)view.findViewById(R.id.profile_image);
        userName_tv = (TextView)view.findViewById(R.id.userName_tv);
        String appUser = App.getAcache().getAsString(Cfg.USER_EMAIL_KEY);
        //如果登录过，则初始化登录框信息
        if (appUser != null && appUser.equals("563738103@qq.com")) {
            profile_image.setImageResource(R.mipmap.head2);
            userName_tv.setText("boat");
        }

        newsView = view.findViewById(R.id.tvNews);
        newsView.setOnClickListener(this);

        imView = view.findViewById(R.id.tvIm);
        imView.setOnClickListener(this);

        faceView = view.findViewById(R.id.tvFace);
        faceView.setOnClickListener(this);

        ofoView = view.findViewById(R.id.tvOfo);
        ofoView.setOnClickListener(this);

        settingView = view.findViewById(R.id.tvSetting);
        settingView.setOnClickListener(this);

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onClick(View v) {
        Fragment newContent = null;
        String title = null;
        switch (v.getId()) {
            case R.id.tvNews: // 新闻
                newContent = NewsFragment.getInstance();
                title = getString(R.string.item_news);
                break;
            case R.id.tvIm: // 实时通信
                newContent = ImFragment.getInstance();
                title = getString(R.string.item_im);
                break;
            case R.id.tvFace: // 人脸识别
                newContent = FaceFragment.getInstance();
                title = getString(R.string.item_fece);
                break;
            case R.id.tvOfo: // ofo
                newContent = OfoFragment.getInstance();
                title = getString(R.string.item_ofo);
                break;
            case R.id.tvSetting: // 设置
                newContent = SettingFragment.getInstance();
                title = getString(R.string.item_setting);
                break;
            default:
                break;
        }
        if (newContent != null) {
            switchFragment(newContent, title);
        }
    }

    /**
     * 切换fragment
     *
     * @param fragment
     */
    private void switchFragment(Fragment fragment, String title) {
        if (getActivity() == null) {
            return;
        }
        if (getActivity() instanceof MainActivity) {
            MainActivity fca = (MainActivity) getActivity();
            fca.switchConent(fragment, title);
        }
    }

}
