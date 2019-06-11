package com.example.hero_archive;

class Ficha_DnD {
    private String nomePersonagem;
    private String classePersonagem;
    private String raçaPersonagem;


    public Ficha_DnD(String nomePersonagem, String classePersonagem, String raçaPersonagem) {
        this.nomePersonagem = nomePersonagem;
        this.classePersonagem = classePersonagem;
        this.raçaPersonagem = raçaPersonagem;
    }


    public String getNomePersonagem() {

        return nomePersonagem;
    }

    public void setNomePersonagem (String nomePersonagem) {
        this.nomePersonagem = nomePersonagem;
    }

    public String getClassePersonagem() {

        return classePersonagem;
    }

    public void setClassePersonagem (String classePersonagem) {
        this.classePersonagem = classePersonagem;
    }

    public String getRaçaPersonagem() {

        return raçaPersonagem;
    }

    public void setRaçaPersonagem (String raçaPersonagem) {
        this.raçaPersonagem = raçaPersonagem;
    }

}

