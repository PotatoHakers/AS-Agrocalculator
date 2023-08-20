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
                "Пшеница озимая", "Пшеница яровая", "Рожь озимая",
                "Овес", "Ячмень озимый", "Ячмень яровой",
                "Гречиха", "Кукуруза на зерно", "Тритикале",
                "Согро", "Просо", "Рис",
                "Горох", "Чечевица", "Фасоль",

                // Здесь перечислите подписи для каждой картинки
        };

        GridView gridView = findViewById(R.id.gridView1);
        ListItemCerealsCulture adapter = new ListItemCerealsCulture(this, imageIds, captions);
        gridView.setAdapter(adapter);
    }
}


