package com.example.aula_dia_15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edpeso, edaltura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edpeso = findViewById(R.id.peso);
        edaltura = findViewById(R.id.altura);
    }
    public void calcularIMC(View view){
        Intent i = new Intent(this, Resultado.class);

        Bundle ebundle = new Bundle();

        ebundle.putFloat("peso", Float.parseFloat(edpeso.getText().toString()));
        ebundle.putFloat("altura", Float.parseFloat(edaltura.getText().toString()));
       // ebundle.putFloat("valorimc", Float.parseFloat(edpeso.getText().toString())/(Float.parseFloat(edaltura.getText().toString())*2));
        i.putExtras(ebundle);

        startActivity(i);


        //double peso = Double.parseDouble(edpeso.getText().toString());
      //  double altura = Double.parseDouble(edaltura.getText().toString());
       // String IMC = String.valueOf(peso/(altura*2));

       // Toast.makeText(this, "Resultado: "+IMC, Toast.LENGTH_SHORT).show();
       // Log.d(IMC, "calcularIMC: ");

      //  Intent intent = new Intent(this, Resultado.class);
       // intent.putExtra("valorimc",IMC);
       // startActivity(intent);


    }

}