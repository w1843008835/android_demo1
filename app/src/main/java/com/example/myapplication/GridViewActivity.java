package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class GridViewActivity extends AppCompatActivity {
    private GridView mGv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        mGv = findViewById(R.id.gv);
        mGv.setAdapter(new MyGridviewAdapter(GridViewActivity.this));
        mGv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(GridViewActivity.this, "clicked "+i, Toast.LENGTH_SHORT).show();
            }
        });
    }
}