package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculo.Classify;

public class Film extends Title implements Classify {
    //caracteristicas do film
    private String director;

    //getters film
    public String getDirector() {
        return director;
    }

    //setters film
    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassify() {
        return (int)mediaAssessment() / 2; // class classificavel que pega a media da class e divide por 2 e retorna esse valor


        toString()

    }
}
