package com.example.agricultureapplication;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

public class VegetablesCulture extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vegetables_culture);

        int[] imageIds = {
                R.drawable.black, R.drawable.black, R.drawable.black,
                R.drawable.black, R.drawable.black, R.drawable.black,
                R.drawable.black, R.drawable.black, R.drawable.black,
                R.drawable.black,
                // Здесь перечислите остальные ресурсы для изображений
        };

        String[] captions = {
                "Свекла столовая", "Морковь", "Капуста",
                "Томат", "Перец", "Огурец",
                "Кабачок", "Лук репчатый", "Картофель",
                "Тыква",

                // Здесь перечислите подписи для каждой картинки
        };

        GridView gridView = findViewById(R.id.gridViewVegetables);
        ListItemCerealsCulture adapter = new ListItemCerealsCulture(this, imageIds, captions);
        gridView.setAdapter(adapter);
    }
}
