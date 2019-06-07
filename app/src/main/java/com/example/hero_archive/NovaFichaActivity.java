package com.example.hero_archive;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NovaFichaActivity extends AppCompatActivity {

    private Personagem personagem;
    private boolean novoPersonagem;
    private Ficha_DnD Ficha_DnD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nova_ficha);


        final EditText editTextNome = findViewById(R.id.editText_nome);
        final EditText editTextRaça = findViewById(R.id.editText_raça);
        final EditText editTextClasse = findViewById(R.id.editText_classe);
        Button buttonCriarFicha = findViewById(R.id.button_criar_ficha);

        buttonCriarFicha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
