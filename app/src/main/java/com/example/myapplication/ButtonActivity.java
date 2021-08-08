package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {
    private Button btn3,btn5,btn6,btn_checkbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        btn3 = findViewById(R.id.btn_3);
        btn5 = findViewById(R.id.btn_5);
        btn6 = findViewById(R.id.btn_6);
        btn_checkbox = findViewById(R.id.btn_checkbox);
        setListeners();

    }
    public void showToast(View view){
        Toast.makeText(this,"btn4 is clicked",Toast.LENGTH_LONG).show();
    }
    private void setListeners(){
        onclick onclick = new onclick();
        btn3.setOnClickListener(onclick);
        btn5.setOnClickListener(onclick);
        btn6.setOnClickListener(onclick);
        btn_checkbox.setOnClickListener(onclick);
    }
    private class onclick implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            Intent intent = null;
            switch(view.getId()){
                case R.id.btn_3:
                    Toast.makeText(ButtonActivity.this,"btn3 is clicked",Toast.LENGTH_LONG).show();
                    break;
                case R.id.btn_5:
                    //跳转到登陆界面
                    intent = new Intent(ButtonActivity.this,LoginActivity.class);
                    break;
                case R.id.btn_6:
                    //跳转到RadioButton界面
                    intent = new Intent(ButtonActivity.this,RadioButtonActivity.class);
                    break;
                case R.id.btn_checkbox:
                    //跳转到RadioButton界面
                    intent = new Intent(ButtonActivity.this,CheckBoxActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}
