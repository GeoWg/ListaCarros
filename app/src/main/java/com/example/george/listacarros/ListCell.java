package com.example.george.listacarros;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by George on 4/9/2018.
 */

public class ListCell extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] cars;

    public ListCell(Activity context, String[] cars){
        super(context, R.layout.activity_list_cell, cars);
        this.context = context;
        this.cars = cars;
    }
    @Override
    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.activity_list_cell, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.txt);
        txtTitle.setText(cars[position]);
        return rowView;
    }
}
