package com.jor.xxmaster.app;

import android.app.Application;

import com.iflytek.cloud.SpeechUtility;
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
        // 应用程序入口处调用，避免手机内存过小，杀死后台进程后通过历史intent进入Activity造成SpeechUtility对象为null
        // 如在Application中调用初始化，需要在Mainifest中注册该Applicaiton
        // 注意：此接口在非主进程调用会返回null对象，如需在非主进程使用语音功能，请增加参数：SpeechConstant.FORCE_LOGIN+"=true"
        // 参数间使用半角“,”分隔。
        // 设置你申请的应用appid,请勿在'='与appid之间添加空格及空转义符

        // 注意： appid 必须和下载的SDK保持一致，否则会出现10407错误

        SpeechUtility.createUtility(App.this, "appid=" + Cfg.IFLY_APPID);

        // 以下语句用于设置日志开关（默认开启），设置成false时关闭语音云SDK日志打印
        // Setting.setShowLog(false);

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
