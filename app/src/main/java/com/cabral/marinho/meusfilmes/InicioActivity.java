package com.cabral.marinho.meusfilmes;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import static android.widget.Toast.LENGTH_SHORT;

public class InicioActivity extends AppCompatActivity {

    private Button buttonLista;
    private Button buttonHistorico;
    private Button buttonFavotitos;
    private Button buttonCreditos;
    private JSONArray dados;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        buttonLista = (Button) findViewById(R.id.buttonLista);
        buttonHistorico = (Button) findViewById(R.id.buttonHistorico);
        buttonFavotitos = (Button) findViewById(R.id.buttonFavoritos);
        buttonCreditos = (Button) findViewById(R.id.buttonCreditos);
        DownloaderTask atualizar = new DownloaderTask();
        atualizar.execute("https://api.themoviedb.org/3/discover/movie?api_key=bad51705c7756f9ffdc7d3dc37b7aad2&sort_by=popularity.desc");
    }

    public void mostrarLista(View v) {
        Intent intent = new Intent(InicioActivity.this, ListaActivity.class);
        startActivity(intent);
    }

    public void mostrarHistorico(View v) {
        Intent intent = new Intent(InicioActivity.this, HistoricoActivity.class);
        startActivity(intent);
    }

    public void mostrarFavoritos(View v) {
        Intent intent = new Intent(InicioActivity.this, FavoritosActivity.class);
        startActivity(intent);
    }

    public void mostrarCréditos(View v) {
        Intent intent = new Intent(InicioActivity.this, CreditosActivity.class);
        startActivity(intent);
    }
}