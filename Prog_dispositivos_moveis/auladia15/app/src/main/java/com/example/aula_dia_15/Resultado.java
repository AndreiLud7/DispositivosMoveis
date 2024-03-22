package com.example.aula_dia_15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {
    TextView tvaltura, tvpeso, tvimc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        tvaltura = findViewById(R.id.ResultadoAltura);
        tvpeso = findViewById(R.id.Resultadopeso);
        tvimc = findViewById(R.id.ResultadoIMC);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        Float peso, altura, imc;
        peso = bundle.getFloat("peso");
        altura = bundle.getFloat("altura");
        imc = bundle.getFloat("imc");
        imc = peso / (altura * altura);

        tvaltura.setText(altura.toString());
        tvpeso.setText(peso.toString());
        tvimc.setText(imc.toString());


    }
}
