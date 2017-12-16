package com.cabral.marinho.meusfilmes;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class CreditosActivity extends AppCompatActivity {

    private ImageButton imageCreditos;
    private TextView textCreditos;
    private Button buttonInicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creditos);
        imageCreditos = (ImageButton) findViewById(R.id.imageCreditos);
        textCreditos = (TextView)findViewById(R.id.textCreditos);
        buttonInicio = (Button)findViewById(R.id.buttonInicio);

    }



    public void seguirTheMovie(View v){
        Uri uri = Uri.parse("https://www.themoviedb.org/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }


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

