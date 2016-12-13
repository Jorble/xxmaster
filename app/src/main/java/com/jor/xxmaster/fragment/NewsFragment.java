package com.jor.xxmaster.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.huewu.pla.lib.internal.PLA_AdapterView;
import com.jor.xxmaster.R;
import com.jor.xxmaster.app.App;
import com.jor.xxmaster.view.MultiColumnPullToRefreshListView;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * @author Jorble
 * @description 新闻
 */
public class NewsFragment extends Fragment {

    private static final NewsFragment instance = new NewsFragment();

    public static NewsFragment getInstance() {
        imageList=new ArrayList<String>();
        imageList.add("http://sc.jb51.net/uploads/allimg/150703/14-150F3102113Y7.jpg");
        imageList.add("http://h.hiphotos.baidu.com/zhidao/pic/item/e824b899a9014c0869f80ddd0d7b02087af4f482.jpg");
        imageList.add("http://sc.jb51.net/uploads/allimg/150703/14-150F3102113Y7.jpg");
        imageList.add("http://h.hiphotos.baidu.com/zhidao/pic/item/e824b899a9014c0869f80ddd0d7b02087af4f482.jpg");
        imageList.add("http://sc.jb51.net/uploads/allimg/150703/14-150F3102113Y7.jpg");
        imageList.add("http://h.hiphotos.baidu.com/zhidao/pic/item/e824b899a9014c0869f80ddd0d7b02087af4f482.jpg");
        imageList.add("http://sc.jb51.net/uploads/allimg/150703/14-150F3102113Y7.jpg");
        imageList.add("http://h.hiphotos.baidu.com/zhidao/pic/item/e824b899a9014c0869f80ddd0d7b02087af4f482.jpg");
        imageList.add("http://sc.jb51.net/uploads/allimg/150703/14-150F3102113Y7.jpg");
        imageList.add("http://h.hiphotos.baidu.com/zhidao/pic/item/e824b899a9014c0869f80ddd0d7b02087af4f482.jpg");

        return instance;
    }

    private MultiColumnPullToRefreshListView waterfallView;//可以把它当成一个listView
    private WaterfallAdapter adapter;
    static ArrayList<String> imageList;

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
        View view = inflater.inflate(R.layout.frag_news, null);

        adapter = new WaterfallAdapter( App.getContext(),imageList);

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

    public static class WaterfallAdapter extends BaseAdapter {


        ArrayList<String> list;
        Context context;

        public WaterfallAdapter(Context context,ArrayList<String> list) {
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
                   .load(list.get(position))
                   .into(holder.ivIcon);

            //标题
            holder.titleTv.setText("自然风景图");
            return view;
        }


    }

    static class Holder {
        public ImageView ivIcon;
        public ProgressBar pbLoad;
        public TextView titleTv;
    }
}
