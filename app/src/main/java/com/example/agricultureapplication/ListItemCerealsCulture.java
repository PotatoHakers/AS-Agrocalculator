package com.example.agricultureapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListItemCerealsCulture extends BaseAdapter {

        private Context context;
        private int[] imageIds;
        private String[] captions; // Массив подписей

        public ListItemCerealsCulture(Context context, int[] imageIds, String[] captions) {
            this.context = context;
            this.imageIds = imageIds;
            this.captions = captions;
        }

        @Override
        public int getCount() {
            return imageIds.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                convertView = inflater.inflate(R.layout.list_item_cereals_culture, null);
            }

            ImageView imageView = convertView.findViewById(R.id.imageView);
            TextView captionTextView = convertView.findViewById(R.id.textView);

            imageView.setImageResource(imageIds[position]);
            captionTextView.setText(captions[position]); // Устанавливаем подпись

            return convertView;
        }
    }