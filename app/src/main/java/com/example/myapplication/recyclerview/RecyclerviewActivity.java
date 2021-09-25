package com.example.myapplication.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.R;

public class RecyclerviewActivity extends AppCompatActivity {
    private Button mBtnliner,mBtnHor,mBtnGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);
        mBtnliner = findViewById(R.id.btn_linear);
        mBtnHor = findViewById(R.id.btn_hor);
        mBtnGrid = findViewById(R.id.btn_grid);
        mBtnliner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RecyclerviewActivity.this,LinerRecyclerViewActivity.class);
                startActivity(intent);
            }
        });
        mBtnHor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RecyclerviewActivity.this,HorRecyclerViewActivity.class);
                startActivity(intent);
            }
        });
        mBtnGrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RecyclerviewActivity.this,GridRecyclerViewActivity.class);
                startActivity(intent);
            }
        });
    }

}