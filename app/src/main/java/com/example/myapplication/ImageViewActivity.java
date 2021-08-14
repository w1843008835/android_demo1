package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ImageViewActivity extends AppCompatActivity {
    private ImageView iv_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);

        iv_2 = findViewById(R.id.iv_2);
        Glide.with(this).load("https://img1.baidu.com/it/u=3951869245,4174446040&fm=26&fmt=auto&gp=0.jpg").into(iv_2);
    }
}