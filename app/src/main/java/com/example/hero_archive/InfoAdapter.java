package com.example.hero_archive;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import java.util.ArrayList;

public class InfoAdapter extends RecyclerView.Adapter<InfoAdapter.InfoViewHolder> {

    private ArrayList<Info_Character> info_characters;
    private Context context;
    public InfoAdapter(ArrayList<Info_Character> info_characters, Context context) {
        this.info_characters = info_characters;
        this.context = context;
    }

    @NonNull
    @Override
    public InfoViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(ViewGroup.getContext()).inflate(R.layout.adapter_info, viewGroup, false);
        return new InfoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull InfoViewHolder infoViewHolder, int posicao) {
        Info_Character info_character = info_characters.get(posicao);
        infoViewHolder.editTextChNome.setText(info_character.getChNome());
        infoViewHolder.editTextPjNome.setText(info_character.getPjNome());
        infoViewHolder.editTextChClasse.setText(info_character.getChClasse());
        infoViewHolder.editTextNv.setText(info_character.getNv());
        infoViewHolder.editTextChRaca.setText(info_character.getChRaca());
        infoViewHolder.editTextIdade.setText(info_character.getIdade());
        infoViewHolder.editTextExp.setText(info_character.getExp());


    }

    @Override
    public int getItemCount() {

        return info_characters.size();
    }

    public class InfoViewHolder extends RecyclerView.ViewHolder {

        EditText editTextChNome;
        EditText editTextPjNome;
        EditText editTextChClasse;
        EditText editTextNv;
        EditText editTextChRaca;
        EditText editTextIdade;
        EditText editTextExp;

        public InfoViewHolder (View itemView) {
            super(itemView);
            EditText editTextChNome = itemView.findViewById(R.id.editText_ChNome);
            EditText editTextPjNome = itemView.findViewById(R.id.editText_PjNome);
            EditText editTextChClasse = itemView.findViewById(R.id.editText_ChClasse);
            EditText editTextNv = itemView.findViewById(R.id.editText_Nv);
            EditText editTextChRaca = itemView.findViewById(R.id.editText_ChRaça);
            EditText editTextTamanho = itemView.findViewById(R.id.editText_Exp);
            EditText editTextIdade = itemView.findViewById(R.id.editText_Idade);
            EditText editTextExp = itemView.findViewById(R.id.editText_Exp);
        }
    }

}
