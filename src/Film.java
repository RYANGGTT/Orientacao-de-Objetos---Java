public class Film {
    String name;
    int yearOfRealese;
    boolean plan;
    private double assessment;
    private int totalAssessment;
    int duration;


    void showTecnichalsheet(){ // metodo sem retorno
        System.out.println("Nome do filme :" + name);
        System.out.println("Ano de lançamento :" + yearOfRealese);
        System.out.println("Nota de avaliação :" + assessment);
        System.out.println("Duração em minutos :" + duration);
    }

    void userAssesment(double stars){ // metodo com argumento
        assessment = assessment + stars ;
        totalAssessment++;
    }
    double mediaAssessment (){ // retorna media das avaliaçoões
        return assessment / totalAssessment ;

    }

    int getTotalAssessment(){
        return totalAssessment;


    }
}
