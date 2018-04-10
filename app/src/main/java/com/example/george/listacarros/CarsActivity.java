package com.example.george.listacarros;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class CarsActivity extends AppCompatActivity {
    ListView list;
    String[] fiat = new String[]{"Argo", "Prisma", "Palio"};
    String[] honda = new String[]{"Civic", "HRV", "City"};
    String[] chev = new String[]{"Onix", "Celta", "Cruze"};
    String[] volks = new String[]{"Fox", "Jetta", "Bola"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cars);
         int brandId = 5;
        Intent it = getIntent();
        if(it != null){
            brandId = it.getIntExtra("brandId", 4);
        }

        if(brandId == 0) {
            ListCell adapter = new ListCell(CarsActivity.this, fiat);
            list = (ListView) findViewById(R.id.list);
            list.setAdapter(adapter);
            list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                    Intent it = new Intent(CarsActivity.this, AtividadeDetalhe.class);
                    it.putExtra("carId", arg2);
                    startActivity(it);
                    Toast.makeText(CarsActivity.this, "Clicou na " + fiat[+arg2], Toast.LENGTH_SHORT).show();
                }
            });
        }if(brandId == 1) {

            ListCell adapter = new ListCell(CarsActivity.this, chev);
            list = (ListView) findViewById(R.id.list);
            list.setAdapter(adapter);
            list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                    Intent it = new Intent(CarsActivity.this, AtividadeDetalhe.class);
                    it.putExtra("carId", arg2);
                    startActivity(it);
                    Toast.makeText(CarsActivity.this, "Clicou na " + chev[+arg2], Toast.LENGTH_SHORT).show();
                }
            });
        }if(brandId == 2) {

            ListCell adapter = new ListCell(CarsActivity.this, volks);
            list = (ListView) findViewById(R.id.list);
            list.setAdapter(adapter);
            list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                    Intent it = new Intent(CarsActivity.this, AtividadeDetalhe.class);
                    it.putExtra("carId", arg2);
                    startActivity(it);
                    Toast.makeText(CarsActivity.this, "Clicou na " + volks[+arg2], Toast.LENGTH_SHORT).show();
                }
            });
        }if(brandId == 3) {

            ListCell adapter = new ListCell(CarsActivity.this, honda);
            list = (ListView) findViewById(R.id.list);
            list.setAdapter(adapter);
            list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                    Intent it = new Intent(CarsActivity.this, AtividadeDetalhe.class);
                    it.putExtra("carId", arg2);
                    startActivity(it);
                    Toast.makeText(CarsActivity.this, "Clicou na " + honda[+arg2], Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}