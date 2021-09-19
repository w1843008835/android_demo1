package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class MyGridviewAdapter extends BaseAdapter {
    private Context mcontext;
    private LayoutInflater mlayoutInflater;
    public MyGridviewAdapter(Context context){
        this.mcontext = context;
        mlayoutInflater = LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return 3;
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
        public ImageView imageView;
        public TextView textView;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder = null;
        if(view == null){
            view = mlayoutInflater.inflate(R.layout.layout_grid_item,null);
            holder = new ViewHolder();
            holder.imageView = view.findViewById(R.id.iv_grid);
            holder.textView = view.findViewById(R.id.tv_title);
            view.setTag(holder);
        }else{
            holder = (ViewHolder)view.getTag();
        }
        String text[] = {"11","22","33"};
        for(int j=0;j<text.length;j++){
            holder.textView.setText(text[i]);
        }

        Glide.with(mcontext).load("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fnimg.ws.126.net%2F%3Furl%3Dhttp%253A%252F%252Fdingyue.ws.126.net%252F2021%252F0820%252F43353e11p00qy3ixb0049c000j200d7c.png%26thumbnail%3D650x2147483647%26quality%3D80%26type%3Djpg&refer=http%3A%2F%2Fnimg.ws.126.net&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1634624990&t=c93d82731aa2fd94a41fa13dd2d3298e").into(holder.imageView);
        return view;
    }
}
