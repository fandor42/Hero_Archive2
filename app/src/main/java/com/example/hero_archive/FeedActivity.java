package com.example.hero_archive;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class FeedActivity extends AppCompatActivity {

    private FichaAdapter adapter;
    ArrayList<Ficha_DnD> ficha_dnDS = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);


        RecyclerView recyclerView = findViewById(R.id.recyclerView_fichas);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        Ficha_DnD ficha_dnD1 = new Ficha_DnD("Testando", "Qualquer coisa", "Olaolaolaoa");

        ficha_dnDS.add(ficha_dnD1);

        adapter = new FichaAdapter(ficha_dnDS, getApplicationContext());
        recyclerView.setAdapter(adapter);

    }
}
