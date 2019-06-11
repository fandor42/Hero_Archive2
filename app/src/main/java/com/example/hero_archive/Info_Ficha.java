package com.example.hero_archive;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

public class Info_Ficha extends AppCompatActivity {

    private Info_Character info_character;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adapter_info);

        final EditText editTextChNome = findViewById(R.id.editText_ChNome);
        final EditText editTextTendencia =  findViewById(R.id.editText_Tendencia);
        final EditText editTextPjNome = findViewById(R.id.editText_PjNome);
        final EditText editTextChClasse = findViewById(R.id.editText_ChClasse);
        final EditText editTextNv = findViewById(R.id.editText_Nv);
        final EditText editTextDivindade = findViewById(R.id.editText_Divindade);
        final EditText editTextTerraNatal = findViewById(R.id.editText_TerraNatal);
        final EditText editTextChRaca = findViewById(R.id.editText_ChRaça);
        final EditText editTextTamanho = findViewById(R.id.editText_Tamanho);
        final EditText editTextSexo = findViewById(R.id.editText_Sexo);
        final EditText editTextIdade = findViewById(R.id.editText_Idade);
        final EditText editTextAltura = findViewById(R.id.editText_Altura);
        final EditText editTextPeso = findViewById(R.id.editText_Peso);
        final EditText editTextCabelos = findViewById(R.id.editText_Cabelo);
        final EditText editTextOlhos = findViewById(R.id.editText_Olhos);

    }
}

