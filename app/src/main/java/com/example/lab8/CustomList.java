package com.example.lab8;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomList extends ArrayAdapter<City> {

    private ArrayList<City> cities;
    private Context context;

    public CustomList(Context context, ArrayList<City> cities) {
        super(context, 0, cities);
        this.cities = cities;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = convertView;

        if(view == null){
            view = LayoutInflater.from(context).inflate(R.layout.content, parent,false);
        }

        City city = cities.get(position);

        TextView cityName = view.findViewById(R.id.city_text);
        TextView provinceName = view.findViewById(R.id.province_text);

        cityName.setText(city.getCityName());
        provinceName.setText(city.getProvinceName());

        return view;

    }

    /**
     * Checks if the specified city is in the list.
     * @param city
     *      The city to check for in the list.
     * @return
     *      true if the city is in the list, false otherwise.
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    public int getCount(){
        return cities.size();
    }

    public void addCity(City city){
        cities.add(city);
    }

    /**
     * Checks if the specified city is in the list.
     * @param city
     *      The city to check for in the list.
     * @return
     *      true if the city is in the list, false otherwise.
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * Removes the specified city from the list if it exists.
     * If the city does not exist in the list, throws an IllegalArgumentException.
     * @param city
     *      The city to remove from the list.
     * @throws IllegalArgumentException
     *      if the city is not found in the list.
     */
//    public void delete(City city) {
//        if (!cities.contains(city)) {
//            throw new IllegalArgumentException("City not found in the list");
//        }
////        cities.remove(city);
//    }

//
//    public int countCities() {
//        return cities.size();
//    }

}
