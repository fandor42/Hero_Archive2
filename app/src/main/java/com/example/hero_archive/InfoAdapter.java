package com.example.hero_archive;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import java.util.ArrayList;

public class InfoAdapter extends RecyclerView.Adapter<InfoAdapter.InfoViewHolder> {
    private ArrayList<Info_Character> info_characters;
    private context context;
    public InfoAdapter(ArrayList<Info_Character> info_characters, context context) {
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
        infoViewHolder.editTextTendencia.setText(info_character.getTendencia());
        infoViewHolder.editTextPjNome.setText(info_character.getPjNome());
        infoViewHolder.editTextChClasse.setText(info_character.getChClasse());
        infoViewHolder.editTextNv.setText(info_character.getNv());
        infoViewHolder.editTextDivindade.setText(info_character.getTendencia());
        infoViewHolder.editTextTerraNatal.setText(info_character.getTerraNatal());
        infoViewHolder.editTextChRaca.setText(info_character.getChRaca());
        infoViewHolder.editTextTamanho.setText(info_character.getTamanho());
        infoViewHolder.editTextSexo.setText(info_character.getSexo();
        infoViewHolder.editTextIdade.setText(info_character.getIdade());
        infoViewHolder.editTextAltura.setText(info_character.getAltura());
        infoViewHolder.editTextPeso.setText(info_character.getPeso());
        infoViewHolder.editTextCabelos.setText(info_character.getCabelo());
        infoViewHolder.editTextOlhos.setText(info_character.getOlhos());


    });

    @Override
    public int getItemCount() {

        return info_characters.size();
    }

    public class InfoViewHolder extends RecyclerView.ViewHolder {

        EditText editTextChNome;
        EditText editTextTendencia;
        EditText editTextPjNome;
        EditText editTextChClasse;
        EditText editTextNv;
        EditText editTextDivindade;
        EditText editTextTerraNatal;
        EditText editTextChRaca;
        EditText editTextTamanho;
        EditText editTextSexo;
        EditText editTextIdade;
        EditText editTextAltura;
        EditText editTextPeso;
        EditText editTextCabelos;
        EditText editTextOlhos;

        public InfoViewHolder (View itemView) {
            super(itemView);
            EditText editTextChNome = itemView.findViewById(R.id.editText_ChNome);
            EditText editTextTendencia = itemView.findViewById(R.id.editText_Tendencia);
            EditText editTextPjNome = itemView.findViewById(R.id.editText_PjNome);
            EditText editTextChClasse = itemView.findViewById(R.id.editText_ChClasse);
            EditText editTextNv = itemView.findViewById(R.id.editText_Nv);
            EditText editTextDivindade = itemView.findViewById(R.id.editText_Divindade);
            EditText editTextTerraNatal = itemView.findViewById(R.id.editText_TerraNatal);
            EditText editTextChRaca = itemView.findViewById(R.id.editText_ChRaça);
            EditText editTextTamanho = itemView.findViewById(R.id.editText_Tamanho);
            EditText editTextSexo = itemView.findViewById(R.id.editText_Sexo);
            EditText editTextIdade = itemView.findViewById(R.id.editText_Idade);
            EditText editTextAltura = itemView.findViewById(R.id.editText_Altura);
            EditText editTextPeso = itemView.findViewById(R.id.editText_Peso);
            EditText editTextCabelos = itemView.findViewById(R.id.editText_Cabelo);
            EditText editTextOlhos = itemView.findViewById(R.id.editText_Olhos);
        }
    }

}
