package com.example.myapplication.Week3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.myapplication.R;

public class DemoSpinner3_3 extends AppCompatActivity {
    Spinner spinner;
    @SuppressLint("MissingInfatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_spinner33);

        spinner = findViewById(R.id.demoSpinner3_3);
        String[] ls = {"Item1", "Item2", "Item3", "Item4", "Item5", "Item6"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, ls);
        spinner.setAdapter(adapter);
    }
}