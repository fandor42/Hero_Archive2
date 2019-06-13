package com.example.hero_archive;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;


public class TabelaEquipamentos extends AppCompatActivity {

    private boolean table_fgl = false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabela_equip);
    }

    public void collapseTable(View view){
        TableLayout tabelaEquip = findViewById(R.id.tabelaEquip);
        Button switchBtn = findViewById(R.id.switchBtn);

        tabelaEquip.setColumnCollapsed(1, table_fgl);
        tabelaEquip.setColumnCollapsed(2, table_fgl);

        if (table_fgl) {
            table_fgl = false;
            switchBtn.setText("Mostrar Detalhes");
        } else {
            table_fgl = true;
            switchBtn.setText("Esconder Detalhes");
        }
    }
}
