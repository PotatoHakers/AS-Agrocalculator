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
    private Spinner mechanicalCompositionSoil;
    private EditText editTextSquare;
    private EditText editTextPlannedHarvest;
    private EditText editTextSoilDensity;
    private EditText editTextTopsoilThickness;
    private EditText editTextHumusContent;
    private EditText editTextSoilAcidity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_window);

        EditText editTextSquare = findViewById(R.id.editTextSquare);
        EditText editTextPlannedHarvest = findViewById(R.id.editTextPlannedHarvest);
        EditText editTextSoilDensity = findViewById(R.id.editTextSoilDensity);
        EditText editTextTopsoilThickness = findViewById(R.id.editTextTopsoilThickness);
        EditText editTextHumusContent = findViewById(R.id.editTextHumusContent);
        EditText editTextSoilAcidity = findViewById(R.id.editTextSoilAcidity);

        Spinner regionSpinner = findViewById(R.id.regionSpinner);

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

        Spinner mechanicalCompositionSoil = findViewById(R.id.spinnerMehanicalCompositionSoil);

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(
                this,
                R.array.mechanical_composition_soil,
                android.R.layout.simple_spinner_item
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        mechanicalCompositionSoil.setAdapter(adapter2);

        mechanicalCompositionSoil.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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

        Spinner spinnerDegreeInfestation = findViewById(R.id.spinnerDegreeInfestation);

        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(
                this,
                R.array.degree_infestation,
                android.R.layout.simple_spinner_item
        );
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerDegreeInfestation.setAdapter(adapter3);

        spinnerDegreeInfestation.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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

        Button clearButton = findViewById(R.id.buttonReset);

        clearButton.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v){

               regionSpinner.setSelection(0);
               spinnerDegreeInfestation.setSelection(0);
               mechanicalCompositionSoil.setSelection(0);

               editTextSquare.setText("");
               editTextPlannedHarvest.setText("");
               editTextSoilDensity.setText("");
               editTextTopsoilThickness.setText("");
               editTextHumusContent.setText("");
               editTextSoilAcidity.setText("");

           }
        });
        }
    }

