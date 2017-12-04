package com.cabral.marinho.meusfilmes;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import org.json.JSONArray;
import org.json.JSONException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class InicioActivity extends AppCompatActivity {

    private Button button_credito;
    private JSONArray dados;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_lista:
                    mostrarLista();
                    return true;
                case R.id.navigation_favorito:
                   mostrarFavoritos();
                    return true;
                case R.id.navigation_historico:
                    mostrarHistorico();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        button_credito = (Button) findViewById(R.id.button_credito);

        DownloaderTask atualizar = new DownloaderTask();
        atualizar.execute("https://api.themoviedb.org/3/discover/movie?api_key=bad51705c7756f9ffdc7d3dc37b7aad2&sort_by=popularity.desc");

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


    }

    public void mostrarLista() {
        Intent intent = new Intent(this, ListaActivity.class);
        startActivity(intent);
    }

    public void mostrarHistorico() {
        Intent intent = new Intent(this, HistoricoActivity.class);
        startActivity(intent);
    }

    public void mostrarFavoritos() {
        Intent intent = new Intent(this, FavoritosActivity.class);
        startActivity(intent);
    }

    public void mostrarCréditos(View v) {
        Intent intent = new Intent(this, CreditosActivity.class);
        startActivity(intent);
    }

    class DownloaderTask extends AsyncTask<String, Void, JSONArray> {

        @Override
        protected void onPreExecute(){
            //Codigo
        }

        @Override
        protected JSONArray doInBackground(String... params) {
            try {
                URL url = new URL(params[0]);
                HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
                httpURLConnection.connect();
                String json = getString(httpURLConnection.getInputStream());
                if(httpURLConnection.getResponseCode() == 200){
                    Log.i("Resultado: ", json);
                }
                else{
                    Log.i("Resultado: ", "Falha ao atualizar");
                }
                return new JSONArray(json);
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            catch (JSONException e) {
                e.printStackTrace();
                e.toString();
            }
            return null;
        }

        protected void onPostExecute(Integer numero){
            //Codigo
        }

        protected void onProgressUpdate(Integer params){
            //Codigo
        }

        private String getString(InputStream in) throws IOException {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(in));
            StringBuilder str = new StringBuilder();
            String line = null;
            while ((line = buffer.readLine()) != null) {
                str.append(line);
            }
            return str.toString();
        }
    }
}
