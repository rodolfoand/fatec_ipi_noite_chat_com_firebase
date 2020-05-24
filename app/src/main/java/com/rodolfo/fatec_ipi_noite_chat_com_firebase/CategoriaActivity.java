package com.rodolfo.fatec_ipi_noite_chat_com_firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CategoriaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoria);
    }

    public void iniciaChat(String categoria){
        Intent intent = new Intent(this, ChatActivity.class);
        intent.putExtra("categoria", categoria);
        startActivity (intent);
    }

    public void selecionaCinema(View view){
        iniciaChat("cinema");
    }
    public void selecionaNovidades(View view){
        iniciaChat("novidades");
    }
    public void selecionaTecnologia(View view){
        iniciaChat("tecnologia");
    }
    public void selecionaEconomia(View view){
        iniciaChat("economia");
    }
}
