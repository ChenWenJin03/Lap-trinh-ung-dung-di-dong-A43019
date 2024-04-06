package com.hnq40.myapplication.tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.hnq40.myapplication.R;
public class Demo21MainActivity extends AppCompatActivity {
    EditText txt1,txt2;//khai bao bien
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo21_main);
        //anh xa
        txt1=findViewById(R.id.demo21Txt1);
        txt2=findViewById(R.id.demo21Txt2);
        btn1=findViewById(R.id.demo21Btn1);
        btn1.setOnClickListener((v)->{
            //Dinh huong di chuyen
            Intent intent=new Intent(Demo21MainActivity.this,Demo22MainActivity.class);
            //boc hang len
            intent.putExtra("so1",txt1.getText().toString());
            intent.putExtra("so2",txt2.getText().toString());
            //no may
            startActivity(intent);
        });
    }
}