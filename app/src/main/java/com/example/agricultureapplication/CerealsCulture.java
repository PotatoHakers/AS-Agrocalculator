package com.example.agricultureapplication;

import android.os.Bundle;
import android.widget.GridView;
import androidx.appcompat.app.AppCompatActivity;

public class CerealsCulture extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cereals_culture);

        int[] imageIds = {
                R.drawable.black, R.drawable.black, R.drawable.black,

                R.drawable.black, R.drawable.black, R.drawable.black,

                R.drawable.black, R.drawable.black, R.drawable.black,

                R.drawable.black, R.drawable.black, R.drawable.black,

                R.drawable.black, R.drawable.black, R.drawable.black,

                // Здесь перечислите остальные ресурсы для изображений
        };

        GridView gridView = findViewById(R.id.gridView);
        ListItemCerealsCulture adapter = new ListItemCerealsCulture(this, imageIds);
        gridView.setAdapter(adapter);
    }
}

