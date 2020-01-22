package cz.martykan.forecastie.models;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import cz.martykan.forecastie.R;

public class WeatherViewHolder extends RecyclerView.ViewHolder {
    public TextView itemDate;
    public TextView itemTemperature;
    public TextView itemDescription;
    public TextView itemyWind;
    public TextView itemPressure;
    public TextView itemHumidity;
    public TextView itemClouds;
    public TextView itemVisibility;
    public TextView itemIcon;
    public View lineView;

    public WeatherViewHolder(View view) {
        super(view);
        this.itemDate = (TextView) view.findViewById(R.id.itemDate);
        this.itemTemperature = (TextView) view.findViewById(R.id.itemTemperature);
        this.itemDescription = (TextView) view.findViewById(R.id.itemDescription);
        this.itemyWind = (TextView) view.findViewById(R.id.itemWind);
        this.itemPressure = (TextView) view.findViewById(R.id.itemPressure);
        this.itemHumidity = (TextView) view.findViewById(R.id.itemHumidity);
        this.itemClouds = (TextView) view.findViewById(R.id.itemClouds);
        this.itemVisibility = (TextView) view.findViewById(R.id.itemVisibility);
        this.itemIcon = (TextView) view.findViewById(R.id.itemIcon);
        this.lineView = view.findViewById(R.id.lineView);
        // TODO - done, add clouds and humidity
    }
}
