package com.example.agricultureapplication;

public class DataHolder {

    //Класс для хранения данных, чтобы хранить данные, которые можно разделять между активностей

        private static DataHolder instance;
        private String selectedRegion;

        private DataHolder() {}

        public static synchronized DataHolder getInstance() {
            if (instance == null) {
                instance = new DataHolder();
            }
            return instance;
        }

        public String getSelectedRegion() {
            return selectedRegion;
        }

        public void setSelectedRegion(String region) {
            selectedRegion = region;
        }
    }
