package com.example.george.listacarros;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] brands = new String[]{"Fiat", "Chevrolet", "Volkswagen", "Honda"};
        ArrayAdapter<String> array = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, brands);
        setListAdapter(array);
    }

    @Override
    protected void onListItemClick(ListView l , View v, int position, long id){
        super.onListItemClick(l, v, position, id);
        Intent it = new Intent(this, CarsActivity.class);
        it.putExtra("brandId", position);
        startActivity(it);
        Object obj = this.getListAdapter().getItem(position);
        String item = obj.toString();

        Toast.makeText(this, "Selecionado " + item, Toast.LENGTH_SHORT).show();
    }
}
