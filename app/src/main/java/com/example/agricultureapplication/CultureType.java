package com.example.agricultureapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CultureType extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.culture_type);

        // Получение данных из Intent
        int position = getIntent().getIntExtra("position", -1);

    //region Зерновые

        TextView textViewCereals = findViewById(R.id.textViewCereals);

        textViewCereals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Создание намерения для запуска новой активити
                Intent intent = new Intent(CultureType.this, CerealsCulture.class);
                // Запуск новой активити
                startActivity(intent );

                Toast.makeText(CultureType.this, "you clicked", Toast.LENGTH_SHORT).show();
            }
        });
    //endregion Зерновые

    //region Масличные
        TextView textViewOilseeds = findViewById(R.id.textViewOilseeds);

        textViewOilseeds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Создание намерения для запуска новой активити
                Intent intent = new Intent(CultureType.this, CerealsCulture.class);
                // Запуск новой активити
                startActivity(intent );

                Toast.makeText(CultureType.this, "you clicked", Toast.LENGTH_SHORT).show();
            }
        });

        //endregion Масличные

    //region Кормовые

        TextView textViewFodder = findViewById(R.id.textViewFodder);

        textViewFodder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Создание намерения для запуска новой активити
                Intent intent = new Intent(CultureType.this, CerealsCulture.class);
                // Запуск новой активити
                startActivity(intent );

                Toast.makeText(CultureType.this, "you clicked", Toast.LENGTH_SHORT).show();
            }
        });

        //endregion Кормовые

    //region Технические

        TextView textViewTechnical = findViewById(R.id.textViewTechnical);

        textViewTechnical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Создание намерения для запуска новой активити
                Intent intent = new Intent(CultureType.this, CerealsCulture.class);
                // Запуск новой активити
                startActivity(intent );

                Toast.makeText(CultureType.this, "you clicked", Toast.LENGTH_SHORT).show();
            }
        });

        //endregion Технические

    //region Овощи

        TextView textViewVegetables = findViewById(R.id.textViewVegetables);

        textViewVegetables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Создание намерения для запуска новой активити
                Intent intent = new Intent(CultureType.this, CerealsCulture.class);
                // Запуск новой активити
                startActivity(intent );

                Toast.makeText(CultureType.this, "you clicked", Toast.LENGTH_SHORT).show();
            }
        });

        //endregion Овощи

    //region Бахчевые

        TextView textViewGourds = findViewById(R.id.textViewGourds);

        textViewGourds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Создание намерения для запуска новой активити
                Intent intent = new Intent(CultureType.this, CerealsCulture.class);
                // Запуск новой активити
                startActivity(intent );

                Toast.makeText(CultureType.this, "you clicked", Toast.LENGTH_SHORT).show();
            }
        });

        //endregion Бахчевые

    //region Плодовые

        TextView textViewFruit = findViewById(R.id.textViewFruit);

        textViewFruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Создание намерения для запуска новой активити
                Intent intent = new Intent(CultureType.this, CerealsCulture.class);
                // Запуск новой активити
                startActivity(intent );

                Toast.makeText(CultureType.this, "you clicked", Toast.LENGTH_SHORT).show();
            }
        });

        //endregion Плодовые

    //region Ягодные

        TextView textViewBerry = findViewById(R.id.textViewBerry);

        textViewBerry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Создание намерения для запуска новой активити
                Intent intent = new Intent(CultureType.this, CerealsCulture.class);
                // Запуск новой активити
                startActivity(intent );

                Toast.makeText(CultureType.this, "you clicked", Toast.LENGTH_SHORT).show();
            }
        });

        //endregion Ягодные




    }
}