package com.example.agricultureapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView listView1;
    private ListView listView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView1 = findViewById(R.id.listView1);
        //listView2 = findViewById(R.id.listView2);

        List<String> itemList1 = new ArrayList<>();
        itemList1.add("1");
        ListAdapterFieldOptions adapter1 = new ListAdapterFieldOptions(this, itemList1);
        listView1.setAdapter(adapter1);

    }
}
