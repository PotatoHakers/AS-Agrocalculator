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

        String[] captions = {
                "Caption 1", "Caption 2", "Caption 3",
                "Caption 1", "Caption 2", "Caption 3",
                "Caption 1", "Caption 2", "Caption 3",
                "Caption 1", "Caption 2", "Caption 3",
                "Caption 1", "Caption 2", "Caption 3",

                // Здесь перечислите подписи для каждой картинки
        };

        GridView gridView = findViewById(R.id.gridView1);
        ListItemCerealsCulture adapter = new ListItemCerealsCulture(this, imageIds, captions);
        gridView.setAdapter(adapter);
    }
}


