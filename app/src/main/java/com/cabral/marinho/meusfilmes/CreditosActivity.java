package com.cabral.marinho.meusfilmes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class CreditosActivity extends AppCompatActivity {

    private ImageView imageCreditos;
    private TextView textCreditos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creditos);
        imageCreditos = (ImageView)findViewById(R.id.imageCreditos);
        textCreditos = (TextView)findViewById(R.id.textCreditos);
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
