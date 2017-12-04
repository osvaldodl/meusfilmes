package com.cabral.marinho.meusfilmes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class CreditosActivity extends AppCompatActivity {

    private ImageView imageCreditos;
    private TextView textCreditos;
    private Button buttonInicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creditos);
        imageCreditos = (ImageView)findViewById(R.id.imageCreditos);
        textCreditos = (TextView)findViewById(R.id.textCreditos);
        buttonInicio = (Button)findViewById(R.id.buttonInicio);
    }

    public void mostrarInicio(View v){
        finish();
    }
}
