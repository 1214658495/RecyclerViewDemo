package com.bydauto.mycustomloyout;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

    private List<RecyclerItem> itemList;

    public MyAdapter(List<RecyclerItem> itemList) {
        this.itemList = itemList;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView icon;
        public TextView title;

//        DisplayMetrics displayMetrics = new DisplayMetrics();
//        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
//        int displayWidth = displayMetrics.widthPixels;
//        int displayHeight = displayMetrics.heightPixels;
//        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
//                (int)(displayWidth*0.5),
//                (int)(displayHeight*0.5));
//           icon.setLayoutParams(layoutParams);

        public MyViewHolder(View itemView) {
            super(itemView);

            icon = (ImageView) itemView.findViewById(R.id.iv_icon);
            title = (TextView) itemView.findViewById(R.id.tv_title);
        }
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_listitem_layout,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        RecyclerItem row = itemList.get(position);
        holder.icon.setImageResource(row.getImageId());
        holder.title.setText(row.getTitle());
    }



    @Override
    public int getItemCount() {
        return itemList.size();
    }


}














/**
 * Created by byd_tw on 2017/7/12.
 */

//public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
//
//    private ArrayList<String> mData;
//
//    public MyAdapter(ArrayList<String> data) {
//        this.mData = data;
//    }
//
//    public void updateData(ArrayList<String> data) {
//        this.mData = data;
//        notifyDataSetChanged();
//    }
//
//
//    @Override
//    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
////        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_layout,parent,false);
////        ViewHolder viewHolder;
////        viewHolder = new ViewHolder(v);
////        return viewHolder;
//        return new MyViewHolder(LayoutInflater.from(
//                parent.getContext()).inflate(R.layout.recycler_item_layout, parent,
//                false));
//    }
//
//
//    @Override
//    public void onBindViewHolder(MyViewHolder holder, int position) {
////        holder.mImg.setText(mData.get(position));
//        holder.mImg.setImageResource(mData.get(position).get);
//    }
//
//    /**
//     * Returns the total number of items in the data set held by the adapter.
//     *
//     * @return The total number of items in this adapter.
//     */
//    @Override
//    public int getItemCount() {
//        return mData == null ? 0 : mData.size();
//    }
//
//    public static class MyViewHolder extends RecyclerView.ViewHolder {
//        ImageView mImg;
//
//        public MyViewHolder(View itemView) {
//            super(itemView);
//            mImg = (ImageView) itemView.findViewById(R.id.iv_item);
//        }
//    }
//}

