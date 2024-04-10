package com.example.myapplication.Week3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.example.myapplication.R;

import java.util.ArrayList;

public class DemoGridView3_2 extends AppCompatActivity {
    GridView gridView;
    ArrayList<Model> lsModel = new ArrayList<>();
    CustomAdapter3_2 adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_grid_view);

        gridView = findViewById(R.id.DemoGridview3_2);
        lsModel.add(new Model(R.drawable.blogger));
        lsModel.add(new Model(R.drawable.dell));
        lsModel.add(new Model(R.drawable.hp));
        lsModel.add(new Model(R.drawable.android));
        lsModel.add(new Model(R.drawable.microsoft));
        lsModel.add(new Model(R.drawable.apple));
        lsModel.add(new Model(R.drawable.firefox));
        lsModel.add(new Model(R.drawable.chrome));
        adapter = new CustomAdapter3_2(lsModel, this);
        gridView.setAdapter(adapter);
    }
}