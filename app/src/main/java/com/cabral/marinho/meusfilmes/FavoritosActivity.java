package com.cabral.marinho.meusfilmes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class FavoritosActivity extends AppCompatActivity {

    private Button buttonInicio;
    private ListView listViewFavoritos;
    private ArrayAdapter<String> adapter;
    private String[] lista = {"Batman", "Capitão América", "Hulk", "Iron Man", "Spider Man", "Super Man", "Thor", "Wonder Woman"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);
        buttonInicio = (Button)findViewById(R.id.buttonInicio);
        listViewFavoritos = (ListView)findViewById(R.id.listViewFavoritos);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lista);
        listViewFavoritos.setAdapter(adapter);
    }

    public void mostrarInicio(View v){
        finish();
    }
}
