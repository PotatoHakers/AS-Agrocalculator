package com.example.agricultureapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class ListAdapterFieldOptions extends BaseAdapter {
    private Context context;
    private List<String> itemList;
    private ViewStub viewStub;
    private View inflatedView;
    private Button showCultureTypeLayoutButton;

    public ListAdapterFieldOptions(Context context, List<String> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    @Override
    public int getCount() {
        return itemList.size();
    }

    @Override
    public Object getItem(int position) {
        return itemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_item_field_options, parent, false);
        }
        TextView textViewFieldOption = convertView.findViewById(R.id.textViewFieldOption);
        LinearLayout linearLayoutHorizontalFieldOptions = convertView.findViewById(R.id.linearLayoutHorizontalFieldOptions);
        ImageView imageViewFieldOption = convertView.findViewById(R.id.imageViewFieldOption);
        TextView textViewRegion = convertView.findViewById(R.id.textViewRegion);
        Button buttonChooseRegion = convertView.findViewById(R.id.buttonChooseRegion);
        TextView textViewSquare = convertView.findViewById(R.id.textViewSquare);
        EditText editTextSquare = convertView.findViewById(R.id.editTextSquare);

        TextView textViewCulture = convertView.findViewById(R.id.textViewCulture);
        LinearLayout linearLayoutHorizontalCulture = convertView.findViewById(R.id.linearLayoutHorizontalCulture);
        ImageView imageViewCulture = convertView.findViewById(R.id.imageViewCulture);
        TextView textViewSownCulture = convertView.findViewById(R.id.textViewSownCulture);
        Button buttonChooseSownCulture = convertView.findViewById(R.id.buttonChooseSownCulture);
        TextView textViewPreviousCulture = convertView.findViewById(R.id.textViewPreviousCulture);
        Button buttonChoosePreviousCulture = convertView.findViewById(R.id.buttonChoosePreviousCulture);
        TextView textViewPlannedHarvest = convertView.findViewById(R.id.textViewPlannedHarvest);
        EditText editTextPlaanedHarvest = convertView.findViewById(R.id.editTextPlannedHarvest);

        TextView textViewSoil = convertView.findViewById(R.id.textViewSoil);
        LinearLayout linearLayoutHorizontalSoil = convertView.findViewById(R.id.linearLayoutHorizontalSoil);
        ImageView imageViewSoil = convertView.findViewById(R.id.imageViewSoil);
        TextView textViewSoilDensity = convertView.findViewById(R.id.textViewSoilDensity);
        EditText editTextSoilDensity = convertView.findViewById(R.id.editTextSoilDensity);
        TextView textViewMehanicalCompositionSoil = convertView.findViewById(R.id.textViewMehanicalCompositionSoil);
        Button buttonChooseMehanicalCompositionSoil = convertView.findViewById(R.id.buttonChooseMehanicalCompositionSoil);
        TextView textViewTopsoilThickness = convertView.findViewById(R.id.textViewTopsoilThickness);
        EditText editTextTopsoilThickness = convertView.findViewById(R.id.editTextTopsoilThickness);
        TextView textViewHumusContent = convertView.findViewById(R.id.textViewHumusContent);
        EditText editTextHumusContent = convertView.findViewById(R.id.editTextHumusContent);
        TextView textViewDegreeInfestation = convertView.findViewById(R.id.textViewDegreeInfestation);
        Button buttonChooseDegreeInfestation = convertView.findViewById(R.id.buttonChooseDegreeInfestation);
        TextView textViewSoilAcidity = convertView.findViewById(R.id.textViewSoilAcidity);
        EditText editTextSoilAcidity = convertView.findViewById(R.id.editTextSoilAcidity);
        String itemText = itemList.get(position);

        Button button = convertView.findViewById(R.id.buttonChooseSownCulture);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Создание намерения для запуска новой активити
                Intent intent = new Intent(context, CultureType.class);

                // Передача данных, если это необходимо
                intent.putExtra("position", position);

                // Запуск новой активити
                context.startActivity(intent);
            }
        });

        return convertView;

        }
    }
