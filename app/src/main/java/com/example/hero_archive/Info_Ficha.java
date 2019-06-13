package com.example.hero_archive;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import java.util.ArrayList;

public class Info_Ficha extends AppCompatActivity {

    private InfoAdapter adapter;
    ArrayList<Info_Character> info_characters = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adapter_info);

        final EditText editTextChNome = findViewById(R.id.editText_ChNome);
        final EditText editTextPjNome = findViewById(R.id.editText_PjNome);
        final EditText editTextChClasse = findViewById(R.id.editText_ChClasse);
        final EditText editTextNv = findViewById(R.id.editText_Nv);
        final EditText editTextChRaca = findViewById(R.id.editText_ChRaça);
        final EditText editTextExp = findViewById(R.id.editText_Exp);
        final EditText editTextIdade = findViewById(R.id.editText_Idade);


    }
}

