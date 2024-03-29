package com.example.calculator.A43019_BT_Tuan1;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.calculator.R;

public class A43019_MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_a43019_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void Add(View view)
    {
        EditText editText1 = findViewById(R.id.editTextNumber1);
        EditText editText2 = findViewById(R.id.editTextNumber2);
        EditText editText3 = findViewById(R.id.editTextNumber3);

        int number1 = Integer.parseInt(editText1.getText().toString());
        int number2 = Integer.parseInt(editText2.getText().toString());
        int total = number1 + number2;

        editText3.setText("Total Value: " + total);
    }
}