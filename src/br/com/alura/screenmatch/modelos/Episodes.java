package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculo.Classify;

public class Episodes implements Classify {
    private int number;
    private String eposideName;
    private String ownerSerie;

    //getters
    public int getNumber() {
        return number;
    }
    public String getOwnerSerie() {
        return ownerSerie;
    }


    public String getEposideName() {
        return eposideName;
    }


//setters
    public void setEposideName(String eposideName) {
        this.eposideName = eposideName;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setOwnerSerie(String ownerSerie) {
        this.ownerSerie = ownerSerie;
    }

    @Override
    public int getClassify() {
        return 0;
    }
}
