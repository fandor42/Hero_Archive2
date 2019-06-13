package com.example.hero_archive;

class Info_Character {

    private String chNome;
    private String pjNome;
    private String chClasse;
    private String nv;
    private String chRaca;
    private String idade;
    private String exp;

    public Info_Character(String chNome, String pjNome, String chClasse, String nv, String chRaca, String idade, String exp) {
        this.chNome = chNome;
        this.pjNome = pjNome;
        this.chClasse = chClasse;
        this.nv = nv;
        this.chRaca = chRaca;
        this.idade = idade;
        this.exp = exp;
    }

    public String getChNome() {
        return chNome;
    }

    public void setChNome(String chNome) {
        this.chNome = chNome;
    }

    public String getPjNome() {
        return pjNome;
    }

    public void setPjNome(String pjNome) {
        this.pjNome = pjNome;
    }

    public String getChClasse() {
        return chClasse;
    }

    public void setChClasse(String chClasse) {
        this.chClasse = chClasse;
    }

    public String getNv() {
        return nv;
    }

    public void setNv(String nv) {
        this.nv = nv;
    }

    public String getChRaca() {
        return chRaca;
    }

    public void setChRaca(String chRaca) {
        this.chRaca = chRaca;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getExp(String exp) {
        return  exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

}
