package com.hnq40.myapplication.tuan1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.hnq40.myapplication.R;
public class T1MainActivity extends AppCompatActivity {
    Button btn1;
    TextView tv1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t1_main);
        btn1=findViewById(R.id.T1Btn1);//anh xa button tu file xml
        tv1=findViewById(R.id.T1Tv1);//anh xa textview tu file xml
        btn1.setOnClickListener((view)->{
            //hien thi cau chao len texview
            tv1.setText("Hien thi cau chao len Textview");
        });
    }
}