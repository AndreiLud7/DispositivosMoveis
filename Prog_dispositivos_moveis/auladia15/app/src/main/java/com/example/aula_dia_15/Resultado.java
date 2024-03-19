package com.example.aula_dia_15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class Resultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        Intent i = getIntent();
        Bundle bundle = i.getExtras();
        bundle.getString("valorimc");
        Log.d(TAG: "Valor do IMC:", bundle.getString( "valorimc"));
    }
}