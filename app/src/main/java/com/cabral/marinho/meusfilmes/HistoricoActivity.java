package com.cabral.marinho.meusfilmes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class HistoricoActivity extends AppCompatActivity {

    private Button buttonInicio;
    private ListView listViewHistorico;
    private ArrayAdapter<String> adapter;
    private String[] lista = {"Batman", "Capitão América", "Hulk", "Iron Man", "Spider Man", "Super Man", "Thor", "Wonder Woman"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historico);
        buttonInicio = (Button)findViewById(R.id.buttonInicio);
        listViewHistorico = (ListView)findViewById(R.id.listViewHistorico);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lista);
        listViewHistorico.setAdapter(adapter);
    }

    public void mostrarInicio(View v){
        finish();
    }
}
