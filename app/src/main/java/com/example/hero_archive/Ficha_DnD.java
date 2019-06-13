package com.example.hero_archive;

class Ficha_DnD {
    private String nomePersonagem;
    private String systemPersonagem;


    public Ficha_DnD(String nomePersonagem, String systemPersonagem) {
        this.nomePersonagem = nomePersonagem;
        this.systemPersonagem = systemPersonagem;
    }


    public String getNomePersonagem() {

        return nomePersonagem;
    }

    public void setNomePersonagem (String nomePersonagem) {

        this.nomePersonagem = nomePersonagem;
    }


    public String getSystemPersonagem(){
        return systemPersonagem;
    }

    public  void setSystemPersonagem (String systemPersonagem) {
        this.systemPersonagem = systemPersonagem;
    }

}

