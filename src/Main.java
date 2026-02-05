import br.com.alura.screenmatch.calculo.Classify;
import br.com.alura.screenmatch.calculo.FilterOfRecomendation;
import br.com.alura.screenmatch.calculo.TimeCalculator;
import br.com.alura.screenmatch.modelos.Film;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Argumentos basefilm
        Film baseFilm = new Film();
        baseFilm.setName("Um gênio indomável");
        baseFilm.setYearOfRealese(1997);
        baseFilm.setAssessment(10);
        baseFilm.setDuration(110);
        baseFilm.setPlan (true);
        baseFilm.setDirector("Gus van Sant");

        var basefilme2 = new Film();
        basefilme2.setName("Dogville");
        basefilme2.setDuration(200);
        basefilme2.setYearOfRealese(2012);
        basefilme2.setPlan(true);

        //Array

        ArrayList<Film> listaDeFilmes = new ArrayList<>();

        listaDeFilmes.add(basefilme2);
        listaDeFilmes.add(baseFilm);

        System.out.println("tamanho da lista :" + listaDeFilmes.size());
        System.out.println("prrimeiro filme:" + listaDeFilmes.get(0).getName());



        //Metodos basefilm
        baseFilm.showTecnichalsheet();
        baseFilm.userAssesment(10);
        baseFilm.userAssesment(8);
        baseFilm.userAssesment(7);
        System.out.println("Diretor:" + baseFilm.getDirector());
        System.out.println("Media de avaliações : " + baseFilm.mediaAssessment());


        //Argumento base serie
        Serie baseSerie = new Serie();
        baseSerie.setName ("Cães de caça");
        baseSerie.setYearOfRealese(2023);
        baseSerie.setPlan(true);
        baseSerie.setSeasons(1);
        baseSerie.setTotalEpisodes(8);
        baseSerie.setDurationPerEpisodes(50);
        baseSerie.setActive(true);
        baseSerie.setAssessment(10);



        //metodos baseSerie
        baseSerie.showTecnichalsheet();
        baseSerie.userAssesment(10);
        baseSerie.userAssesment(9);
        baseSerie.userAssesment(8);
        System.out.println("Duração geral em minutos : " + baseSerie.getDuration());
        System.out.println("Media de avaliações : " + baseSerie.mediaAssessment());

        //Calculador

        TimeCalculator baseCalculator = new TimeCalculator();
        baseCalculator.increase(baseFilm);
        baseCalculator.increase(baseSerie);
        System.out.println(baseCalculator.getTotalTime());

        //classificação
        FilterOfRecomendation classification = new FilterOfRecomendation();
        classification.filter(baseFilm);
    }
}
