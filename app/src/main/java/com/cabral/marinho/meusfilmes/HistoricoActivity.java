package com.cabral.marinho.meusfilmes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class HistoricoActivity extends AppCompatActivity {

    private ListView listViewHistorico;
    private ArrayAdapter<String> adapter;
    private String[] lista = {"Batman", "Capitão América", "Hulk", "Iron Man", "Spider Man", "Super Man", "Thor", "Wonder Woman"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historico);
        listViewHistorico = (ListView)findViewById(R.id.listViewHistorico);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lista);
        listViewHistorico.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuvoltar, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.menu_inicio:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
