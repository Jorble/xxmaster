package com.jor.xxmaster.menu.news;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.huewu.pla.lib.internal.PLA_AdapterView;
import com.jor.xxmaster.R;
import com.jor.xxmaster.app.App;
import com.jor.xxmaster.app.Cfg;
import com.jor.xxmaster.entity.News;
import com.jor.xxmaster.intenet.ApiService;
import com.jor.xxmaster.utils.L;
import com.jor.xxmaster.view.MultiColumnPullToRefreshListView;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * @author Jorble
 * @description 新闻
 */
public class NewsFragment extends Fragment {

    private static final NewsFragment instance = new NewsFragment();

    public static NewsFragment getInstance() {
        return instance;
    }

    private MultiColumnPullToRefreshListView waterfallView;//可以把它当成一个listView
    private WaterfallAdapter adapter;
    static List<News.ResultBean.DataBean> itemList=new ArrayList<>();
    Retrofit retrofit;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        retrofit = new Retrofit.Builder()
                .baseUrl(Cfg.NEWS_URL)
                //增加返回值为String的支持
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ApiService apiService = retrofit.create(ApiService.class);

        Call<News> call = apiService.getNews(Cfg.JUHE_APIKEY,"top");
        call.enqueue(new Callback<News>() {
            @Override
            public void onResponse(Call<News> call, Response<News> response) {
                News news=response.body();
                if(news==null)return;
                //装载新闻列表数据
                itemList.clear();
                itemList.addAll(news.getResult().getData());
                adapter.notifyDataSetChanged();

            }

            @Override
            public void onFailure(Call<News> call, Throwable t) {
                L.i("请求数据失败!");
            }
        });
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_news, null);

        adapter = new WaterfallAdapter( App.getContext(),itemList);

        //瀑布流
        waterfallView = (MultiColumnPullToRefreshListView) view.findViewById(R.id.waterfallList);
        waterfallView.setAdapter(adapter);
        waterfallView.setOnRefreshListener(new MultiColumnPullToRefreshListView.OnRefreshListener() {
            @Override
            public void onRefresh() {
                // TODO Auto-generated method stub
                //下拉刷新要做的事

                //刷新完成后记得调用这个
                waterfallView.onRefreshComplete();
            }
        });
        waterfallView.setOnItemClickListener(new PLA_AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(PLA_AdapterView<?> parent, View view, int position, long id) {
                //点击事件
                Log.i(App.TAG,"onItemClick="+position);
            }
        });

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    /**
     * 适配器
     */
    public static class WaterfallAdapter extends BaseAdapter {


        List<News.ResultBean.DataBean> list;
        Context context;

        public WaterfallAdapter(Context context,List<News.ResultBean.DataBean> list) {
            this.list = list;
            this.context = context;
        }


        @Override
        public int getCount() {
            return list != null ? list.size() : 0;
        }

        @Override
        public Object getItem(int arg0) {
            return list.get(arg0);
        }

        @Override
        public long getItemId(int arg0) {
            return 0;
        }

        @Override
        public View getView(final int position, View view, ViewGroup group) {
            final Holder holder;
            // 得到View
            if (view == null) {
                holder = new Holder();
                LayoutInflater inflater = LayoutInflater.from(context);
                view = inflater.inflate(R.layout.item_news, null);
                holder.ivIcon = (ImageView) view.findViewById(R.id.row_icon);
                holder.titleTv = (TextView) view.findViewById(R.id.title_tv);

                view.setTag(holder);
            } else {
                holder = (Holder) view.getTag();
            }

//            holder.ivIcon.setImageResource(R.mipmap.pic_02);

            //这里就是异步加载网络图片的地方
            Picasso.with(context)
                   .load(list.get(position).getThumbnail_pic_s())
                   .into(holder.ivIcon);

            //标题
            holder.titleTv.setText(list.get(position).getTitle());
            return view;
        }


    }

    static class Holder {
        public ImageView ivIcon;
        public TextView titleTv;
    }
}
