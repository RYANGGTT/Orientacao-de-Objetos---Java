package br.com.alura.screenmatch.calculo;
import br.com.alura.screenmatch.modelos.Film;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Title;


public class TimeCalculator {

    //caracterisiticas calculadora
    private int totalTime;

    //getters da calculadora
    public int getTotalTime() {
        return totalTime;
    }


    //errado por copiar e ter um design de classes com muita dependencia
//    public void increase(Film f)  { // metodo do tipo atributo com classes , no caso espera um filme e pega o getduration da mesma classe
//            totalTime += f.getDuration();
//
//    }
//
//    public void increase(Serie s)  { // sobrecarga de metodos
//        totalTime += s.getDuration();
//
//    }

    public  void increase (Title t){
        totalTime += t.getDuration();

    }

}
