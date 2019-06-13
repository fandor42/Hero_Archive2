package com.example.hero_archive;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;

public class TabelaHabilidades extends AppCompatActivity {

    private boolean table_skills = false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabela_habilidades);
    }

    public void collapseTable(View view) {
        TableLayout tabelaHabilidades = findViewById(R.id.tabelaHabilidade);
        Button switchBtn2 = findViewById(R.id.switchBtn2);

        tabelaHabilidades.setColumnCollapsed(1, table_skills);
        tabelaHabilidades.setColumnCollapsed(2, table_skills);

        if (table_skills) {
            table_skills = false;
            switchBtn2.setText("Mostrar Detalhes");
        } else {
            table_skills = true;
            switchBtn2.setText("Esconder Detalhes");
        }
    }
}
