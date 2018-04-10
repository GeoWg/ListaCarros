package com.example.george.listacarros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class AtividadeDetalhe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atividade_detalhe);

        int carId = 4;
        Intent it = getIntent();

        String[] name = new String[]{"Honda", "Civic", "City"};

        EditText carroNome = (EditText)findViewById(R.id.etNome);

        if(it != null){
            carId = it.getIntExtra("carId", 4);
        } if (carId == 4) {
            carroNome.setText("");
            Toast.makeText(this, "Drink não encontrado", Toast.LENGTH_SHORT).show();
        } else {
            carroNome.setText(name[carId]);
        }
    }
}
