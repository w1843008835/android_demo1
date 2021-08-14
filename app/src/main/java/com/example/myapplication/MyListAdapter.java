package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MyListAdapter extends android.widget.BaseAdapter{
    private Context mcontext;
    //LayoutInflater是一个控件，类似于findviewbyid，为了找到某个view
    private LayoutInflater mlayoutInflater;
    public MyListAdapter(Context context){
        this.mcontext = context;
        mlayoutInflater = LayoutInflater.from(context);
    }
    @Override
    //列表长度
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
static class ViewHolder{
        public ImageView mImageview;
        public TextView tvTitle,tvTime,tvContent;
}
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if(view == null){
            view = mlayoutInflater.inflate(R.layout.layout_list_item,null);
            holder = new ViewHolder();
            holder.mImageview = view.findViewById(R.id.iv);
            holder.tvTitle = view.findViewById(R.id.tv_title);
            holder.tvTime = view.findViewById(R.id.tv_time);
            holder.tvContent = view.findViewById(R.id.tv_content);
            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }
        holder.tvTitle.setText("this is titile ");
        holder.tvTime.setText("2021-08-14");
        holder.tvContent.setText("this is content");
        Glide.with(mcontext).load("https://img1.baidu.com/it/u=3951869245,4174446040&fm=26&fmt=auto&gp=0.jpg").into(holder.mImageview);
        return view;
    }
}
