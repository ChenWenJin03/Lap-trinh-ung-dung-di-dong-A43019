package com.hnq40.myapplication.tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.hnq40.myapplication.R;
public class Demo22MainActivity extends AppCompatActivity {
    TextView tvKQ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo22_main);
        tvKQ=findViewById(R.id.demo22TvKQ);
        //don o to
        Intent intent=getIntent();
        //do hang
        String chuoi1=intent.getExtras().getString("so1");
        String chuoi2=intent.getExtras().getString("so2");
        //----
        //Chuyen chuoi sang so va thuc hien phep cong
        float so1=Float.parseFloat(chuoi1);
        float so2=Float.parseFloat(chuoi2);
        float tong=so1+so2;
        //hien thi ket qua
        tvKQ.setText(String.valueOf(tong));
    }
}