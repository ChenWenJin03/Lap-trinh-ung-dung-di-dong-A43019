package com.hnq40.myapplication.tuan1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.hnq40.myapplication.R;
public class T12MainActivity extends AppCompatActivity {
    EditText txt1,txt2;
    Button btn1;
    TextView tvkq;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t12_main);
        //ANh xa giao dien vao Java
        txt1=findViewById(R.id.t1Txt1);
        txt2=findViewById(R.id.t1Txt2);
        btn1=findViewById(R.id.t1Btn2);
        tvkq=findViewById(R.id.t1TvKQ);
        //Su kien button
        btn1.setOnClickListener((view)->{
            //lay du lieu nhap vao o 1
            int so1= Integer.parseInt(txt1.getText().toString());
            //lay du lieu nhap vao o 2
            int so2=Integer.parseInt(txt2.getText().toString());
            int tong=so1+so2;//tinh tong
            //dua ket qua len man hinh
            tvkq.setText(String.valueOf(tong));
        });
    }
}