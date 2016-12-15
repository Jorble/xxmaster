package com.jor.xxmaster.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingFragmentActivity;
import com.jor.xxmaster.R;
import com.jor.xxmaster.menu.LeftFragment;
import com.jor.xxmaster.menu.news.NewsFragment;
import com.jor.xxmaster.utils.DoubleClickExitHelper;

/**
 * @author Jorble
 * @date 2016/5/18
 * @description 主界面
 */
public class MainActivity extends SlidingFragmentActivity implements
        OnClickListener {

    private ImageView topButton;
    private TextView topTextView;
    private SlidingMenu sm;
    private Fragment mContent;
    DoubleClickExitHelper mDoubleClickExitHelper;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 双击返回键退出
        mDoubleClickExitHelper = new DoubleClickExitHelper(this);
        //侧滑菜单
        initSlidingMenu(savedInstanceState);

        topButton = (ImageView) findViewById(R.id.topButton);
        topButton.setOnClickListener(this);
        topTextView = (TextView) findViewById(R.id.topTv);

        initDefaultItem();
    }

    /**
     * 默认为新闻页
     */
    private void initDefaultItem() {
//        switchConent(NewsFragment.getInstance(), getString(R.string.item_news));
        switchConent(NewsFragment.getInstance(), getString(R.string.item_news));
    }

    /**
     * 初始化侧边栏
     */
    private void initSlidingMenu(Bundle savedInstanceState) {

        // 如果保存的状态不为空则得到之前保存的Fragment，否则获取NewsFragment
        if (savedInstanceState != null) {
            mContent = getSupportFragmentManager().getFragment(
                    savedInstanceState, "mContent");
        }

        if (mContent == null) {
            mContent = NewsFragment.getInstance();
        }

        // 设置左侧滑动菜单
        setBehindContentView(R.layout.menu_frame_left);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.menu_frame, LeftFragment.getInstance()).commit();

        // 实例化滑动菜单对象
        sm = getSlidingMenu();
        // 设置可以左右滑动的菜单
        sm.setMode(SlidingMenu.LEFT);
        // 设置滑动阴影的宽度
        sm.setShadowWidthRes(R.dimen.shadow_width);
        // 设置滑动菜单阴影的图像资源
        sm.setShadowDrawable(null);
        // 设置滑动菜单视图的宽度
        sm.setBehindOffsetRes(R.dimen.slidingmenu_offset);
        // 设置渐入渐出效果的值
        sm.setFadeDegree(0.35f);
        // 设置触摸屏幕的模式,这里设置为全屏
        sm.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
        // 设置下方视图的在滚动时的缩放比例
        sm.setBehindScrollScale(0.0f);

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if (mContent.isAdded()) {
            getSupportFragmentManager().putFragment(outState, "mContent", mContent);
        }
    }


    /**
     * 切换Fragment
     *
     * @param fragment
     */
    public void switchConent(Fragment fragment, String title) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.content_frame, fragment).commit();
        getSlidingMenu().showContent();
        topTextView.setText(title);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.topButton:
                toggle();
                break;
            default:
                break;
        }
    }

    /**
     * 启动活动
     *
     * @param activity
     */
    public static void startActivity(Activity activity) {
        activity.startActivity(new Intent(activity, MainActivity.class));
    }

    /**
     * 监听返回--是否退出程序
     */
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        boolean flag = true;
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            // 是否退出应用
            return mDoubleClickExitHelper.onKeyDown(keyCode, event);
        }

        return flag;
    }
}
