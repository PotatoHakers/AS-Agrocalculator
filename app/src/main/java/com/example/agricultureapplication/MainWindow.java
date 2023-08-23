package com.example.agricultureapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainWindow extends AppCompatActivity {


    private TextView regionEditText;
    private Spinner regionSpinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_window);

        Spinner regionSpinner = findViewById(R.id.regionSpinner);
        regionSpinner = findViewById(R.id.regionSpinner);


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.belarus_regions,
                android.R.layout.simple_spinner_item
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        regionSpinner.setAdapter(adapter);

        regionSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private boolean initialSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (initialSelection) {
                    initialSelection = false;
                } else {
                    String selectedRegion = parent.getItemAtPosition(position).toString();
                    DataHolder.getInstance().setSelectedRegion(selectedRegion);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Do nothing
            }
        });

        /*region buttonChooseRegion

        Button button = findViewById(R.id.buttonChooseRegion);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainWindow.this, ChooseRegion.class);
                startActivity(intent);
            }
        });

        endregion buttonChooseRegion*/

        Button openButton = findViewById(R.id.buttonChooseSownCulture);

        openButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainWindow.this, CultureType.class);
                startActivity(intent);
            }
        });

        }
    }

