package com.example.agricultureapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainWindow extends AppCompatActivity {


     private TextView regionEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_window);

        Button button = findViewById(R.id.buttonChooseRegion);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainWindow.this, ChooseRegion.class);
                startActivity(intent);
            }
        });

        Button openButton = findViewById(R.id.buttonChooseSownCulture);

        openButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainWindow.this, CultureType.class);
                startActivity(intent);
            }
        });

            regionEditText = findViewById(R.id.regionEditText);

            String selectedRegion = DataHolder.getInstance().getSelectedRegion();
            if (selectedRegion != null) {
                regionEditText.setText(selectedRegion);
            }
        }
    }

