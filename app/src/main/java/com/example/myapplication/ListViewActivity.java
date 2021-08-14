package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ListViewActivity extends AppCompatActivity {
    private ListView mlv1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        mlv1 = findViewById(R.id.lv_1);
        mlv1.setAdapter(new MyListAdapter(ListViewActivity.this));
        mlv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ListViewActivity.this,"（点击）position:"+i,Toast.LENGTH_SHORT).show();
            }
        });
        mlv1.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ListViewActivity.this,"(长按)position:"+i,Toast.LENGTH_SHORT).show();
                //返回false：执行完长按后执行点击 返回true：执行完长按后不执行点击
                return false;
            }
        });
    }
}
