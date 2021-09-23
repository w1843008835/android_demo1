package com.example.myapplication.recyclerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.myapplication.R;

public class LinerRecyclerViewActivity extends AppCompatActivity {
    private RecyclerView mRvmain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liner_recycler_view);
        mRvmain = findViewById(R.id.rv_main);
        mRvmain.setLayoutManager(new LinearLayoutManager(LinerRecyclerViewActivity.this));
        mRvmain.addItemDecoration(new MyDecration());
        mRvmain.setAdapter(new LinearAdapter(LinerRecyclerViewActivity.this, new LinearAdapter.OnItemClickListener() {
            @Override
            public void onclick(int pos) {
                Toast.makeText(LinerRecyclerViewActivity.this, pos+" is clicked", Toast.LENGTH_SHORT).show();
            }
        }));

    }
    class MyDecration extends RecyclerView.ItemDecoration{
        @Override
        public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
            super.getItemOffsets(outRect, view, parent, state);
            outRect.set(0,0,0,getResources().getDimensionPixelOffset(R.dimen.dividerHeight));
        }
    }
}