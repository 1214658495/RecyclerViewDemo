package com.bydauto.mycustomloyout;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

import util.LogcatHelper;

public class MainActivity extends Activity {
    private static final String TAG = "MainActivity";

    private RecyclerView.LayoutManager mLayoutManager;
    private RecyclerView.Adapter mAdapter;
    private List<RecyclerItem> itemList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        LogcatHelper.getInstance(this).start();
        super.onCreate(savedInstanceState);
//          /*set it to be no title*/
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//       /*set it to be full screen*/
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN);

//        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
//        getSupportActionBar().hide();
//        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager
                .LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        initData();
        initView();
        prepareItem();

    }

    private void initData() {
//        mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mLayoutManager = new GridLayoutManager(this, 2);
//        mLayoutManager = new StaggeredGridLayoutManager(2, OrientationHelper.VERTICAL);

        mAdapter = new MyAdapter(itemList);
    }


    private void initView() {
        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.rv_view);
        // 设置布局管理器
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.addItemDecoration(new GridSpacingItemDecoration(2,62,false));
        // 设置adapter
        mRecyclerView.setAdapter(mAdapter);

    }

//    private ArrayList<String> getData() {
//        ArrayList<String> data = new ArrayList<>();
//        String temp = " item";
//        for (int i = 0; i < 20; i++) {
//            data.add(i + temp);
//        }
//        return data;
//    }

    private void prepareItem() {
        RecyclerItem item = new RecyclerItem(R.drawable.ic_launcher,"2017-02-11 15:00:00");
        itemList.add(item);
        item = new RecyclerItem(R.drawable.ic_launcher,"2017-02-12 15:00:00");
        itemList.add(item);
        item = new RecyclerItem(R.drawable.ic_launcher,"2017-02-13 15:00:00");
        itemList.add(item);
        item= new RecyclerItem(R.drawable.ic_launcher,"2017-02-13 15:00:00");
        itemList.add(item);
        item = new RecyclerItem(R.drawable.ic_launcher,"2017-02-13 15:00:00");
        itemList.add(item);
        item= new RecyclerItem(R.drawable.ic_launcher,"2017-02-13 15:00:00");
        itemList.add(item);
        item= new RecyclerItem(R.drawable.ic_launcher,"2017-02-13 15:00:00");
        itemList.add(item);
        item = new RecyclerItem(R.drawable.ic_launcher,"2017-02-13 15:00:00");
        itemList.add(item);
        item= new RecyclerItem(R.drawable.ic_launcher,"2017-02-13 15:00:00");
        itemList.add(item);
        item= new RecyclerItem(R.drawable.ic_launcher,"2017-02-13 15:00:00");
        itemList.add(item);
        item = new RecyclerItem(R.drawable.ic_launcher,"2017-02-13 15:00:00");
        itemList.add(item);
        item= new RecyclerItem(R.drawable.ic_launcher,"2017-02-13 15:00:00");
        itemList.add(item);
        item= new RecyclerItem(R.drawable.ic_launcher,"2017-02-13 15:00:00");
        itemList.add(item);
//        mAdapter.notifyDataSetChanged();
//        recyclerview.setAdapter(mAdapter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy");
        LogcatHelper.getInstance(this).stop();
    }
}
