package com.example.hero_archive;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class FichaAdapter extends RecyclerView.Adapter<FichaAdapter.FichaViewHolder> {

    private ArrayList<Ficha_DnD> ficha_dnDS;
    private Context context;
    public FichaAdapter(ArrayList<Ficha_DnD> ficha_dnDS, Context context) {
        this.ficha_dnDS = ficha_dnDS;
        this.context = context;
    }

    @NonNull
    @Override
    public FichaViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.adapter_feed, viewGroup, false);
        return new FichaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FichaViewHolder fichaViewHolder, int posicao) {
        Ficha_DnD ficha_dnD = ficha_dnDS.get(posicao);
        fichaViewHolder.textViewcChacterName.setText(ficha_dnD.getNomePersonagem());
        fichaViewHolder.textViewChacterSystem.setText(ficha_dnD.getSystemPersonagem());

        fichaViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Ta funcionando", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {

        return ficha_dnDS.size();
    }

    public class FichaViewHolder extends RecyclerView.ViewHolder{

        TextView textViewcChacterName;
        TextView textViewChacterSystem;

        public FichaViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewcChacterName = itemView.findViewById(R.id.textViewCharacterName);
            textViewChacterSystem = itemView.findViewById(R.id.textViewCharacterSystem);
        }
    }
}
