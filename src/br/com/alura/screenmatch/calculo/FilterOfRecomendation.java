package br.com.alura.screenmatch.calculo;

import br.com.alura.screenmatch.modelos.Title;

public class FilterOfRecomendation {

    public void filter(Classify cl){
        if (cl.getClassify() >= 4){
            System.out.println("Esta entre os preferidos !");
        }else if(cl.getClassify() >= 2){
            System.out.println("Esta entre os melhores !");
        }else {
            System.out.println("coloque para assistir depois !");
        }
    }
}
