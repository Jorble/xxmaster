package com.jor.xxmaster.app;

import android.app.Application;

import com.jor.xxmaster.utils.ACache;
import com.wilddog.client.Wilddog;

import cn.jpush.android.api.JPushInterface;

/**
 * Created by Jorble on 2016/5/9.
 */
public class App extends Application{

    public static final String TAG="xxmaster";
    /**
     * 全局上下文
     */
    private static App context;
    public static App getContext() {
        return context;
    }

    /**
     * 缓存
     */
    private static ACache mAcache;
    public static ACache getAcache() {
        return mAcache;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        /*******************************
         *          上下文              *
         *******************************/
        context = this;
        /*******************************
         *          野狗                *
         *******************************/
        Wilddog.setAndroidContext(this);
        /*******************************
         *          极光推送             *
         *******************************/
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);
        /*******************************
         *          缓存                *
         *******************************/
        mAcache=ACache.get(this);
    }

}
