package com.example.myapplication.Week3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.myapplication.R;

import java.util.ArrayList;

public class DemoListView3_1 extends AppCompatActivity {
    ListView lvContact;
    CustomAdapter3_1 adapter;
    ArrayList<Contact> lsContact = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_list_view_main);

        lvContact = findViewById(R.id.demo31ListView);
        lsContact.add(new Contact(R.drawable.android,"Kim So Eun", "0966869999"));
        lsContact.add(new Contact(R.drawable.dell,"Kim Hee Sun", "0966868888"));
        lsContact.add(new Contact(R.drawable.kimtaehee,"Kim Tae Hee", "0936638668"));
        lsContact.add(new Contact(R.drawable.kimchi,"Moon Hacker:)", "0999988888"));
        lsContact.add(new Contact(R.drawable.hp,"Kim Nam Joo", "0972777999"));

        adapter = new CustomAdapter3_1(lsContact,this);
        lvContact.setAdapter(adapter);
    }
}