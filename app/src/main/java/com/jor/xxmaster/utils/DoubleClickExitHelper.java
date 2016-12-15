package com.jor.xxmaster.utils;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.widget.Toast;

/**
 * Created by Jorble on 2016/3/15.
 */
public class DoubleClickExitHelper
{

    private final Activity mActivity;

    private boolean isOnKeyBacking;
    private Handler mHandler;
    private Toast mBackToast;

    public DoubleClickExitHelper(Activity activity)
    {
        mActivity = activity;//保存传进来的activity
        mHandler = new Handler(Looper.getMainLooper());//生成一个handler,去管理消息队列
    }

    /**
     * Activity onKeyDown事件
     * */
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        if (keyCode != KeyEvent.KEYCODE_BACK)
        {
            return false;
        }
        if (isOnKeyBacking)
        {
            mHandler.removeCallbacks(onBackTimeRunnable);//移除消息队列
            if (mBackToast != null)
            {
                mBackToast.cancel();
            }
            // 退出
            mActivity.finish();
            return true;
        }
        else
        {
            isOnKeyBacking = true;//注意,首先执行这里,因为isOnKeyBacking刚开始是false
            if (mBackToast == null)
            {
                mBackToast = Toast.makeText(mActivity, "再按一次退出", Toast.LENGTH_SHORT);
            }
            mBackToast.show();
            mHandler.postDelayed(onBackTimeRunnable, 2000);//加入消息队列, 2000ms之后执行
            return true;
        }
    }

    // 2000ms之后执行, 把isOnKeyBacking设置成false
    private Runnable onBackTimeRunnable = new Runnable()
    {

        @Override
        public void run()
        {
            isOnKeyBacking = false;
            if (mBackToast != null)
            {
                mBackToast.cancel();
            }
        }
    };
}
