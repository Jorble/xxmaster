package com.jor.xxmaster.menu.news;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.ProgressBar;

import com.jor.xxmaster.R;
import com.jor.xxmaster.entity.News;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class NewsDetailsActivity extends Activity {

    @Bind(R.id.back_ib)
    ImageButton backIb;
    @Bind(R.id.bar)
    ProgressBar bar;
    @Bind(R.id.webView)
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_details);
        ButterKnife.bind(this);

        //获得DataDean对象
        News.ResultBean.DataBean dataBean = (News.ResultBean.DataBean) getIntent().getParcelableExtra("News");

        webView.setHorizontalScrollBarEnabled(false);//水平不显示
        webView.setVerticalScrollBarEnabled(false); //垂直不显示

        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);

        String url = dataBean.getUrl();
        webView.setWebChromeClient(new WebChromeClient() {
            public void onProgressChanged(WebView view, int progress) {
                // Activity和Webview根据加载程度决定进度条的进度大小
                // 当加载到100%的时候 进度条自动消失
                if (progress == 100) {
                    bar.setVisibility(View.INVISIBLE);
                } else {
                    if (View.INVISIBLE == bar.getVisibility()) {
                        bar.setVisibility(View.VISIBLE);
                    }
                    bar.setProgress(progress);
                }
                super.onProgressChanged(view, progress);
            }
        });
        webView.loadUrl(url);
    }

    /**
     * 启动活动
     *
     * @param activity
     * @param dataBean
     */
    public static void startActivity(Activity activity, News.ResultBean.DataBean dataBean) {
        Intent mIntent = new Intent(activity, NewsDetailsActivity.class);
        Bundle mBundle = new Bundle();
        mBundle.putParcelable("News", dataBean);
        mIntent.putExtras(mBundle);
        activity.startActivity(mIntent);
    }

    @OnClick(R.id.back_ib)
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.back_ib:
                finish();
                break;
        }
    }

    /**
     * 使点击回退按钮不会直接退出整个应用程序而是返回上一个页面
     */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK && webView.canGoBack()) {
            webView.goBack();//返回上个页面
            return true;
        }
        return super.onKeyDown(keyCode, event);//退出整个应用程序
    }
}
