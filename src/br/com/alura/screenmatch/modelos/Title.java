package br.com.alura.screenmatch.modelos;

public class Title {

    //caracteristicas de titulos
    private String name;
    private int yearOfRealese;
    private boolean plan;
    private double assessment;
    private int totalAssessment;
    private int duration;


    public void showTecnichalsheet(){ // metodo sem retorno
        System.out.println("Nome do filme/serie:" + name);
        System.out.println("Ano de lançamento :" + yearOfRealese);
        System.out.println("Nota de avaliação IMDB :" + assessment);
        System.out.println("Duração em minutos :" + duration);
    }


    public void userAssesment(double stars){ // metodo com argumento
        assessment = assessment + stars ;
        totalAssessment++;
    }

    public double mediaAssessment (){ // retorna media das avaliaçoões
        return assessment /( totalAssessment + 1) ;

    }

    // getters das variaveis

    public int getTotalAssessment(){ // getter para buscar valor do atributo privado
        return totalAssessment;


    }

    public int getDuration() {
        return duration;
    }

    public boolean isPlan() {
        return plan;
    }

    public String getName() {
        return name;
    }

    // Setters das variaveis


    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setTotalAssessment(int totalAssessment) {
        this.totalAssessment = totalAssessment;
    }

    public void setAssessment(double assessment) {
        this.assessment = assessment;
    }

    public void setPlan(boolean plan) {
        this.plan = plan;
    }

    public void setYearOfRealese(int yearOfRealese) {
        this.yearOfRealese = yearOfRealese;
    }

    public void setName(String name) { //setter para atribuir um valor ao atributo privado
        this.name = name;
    }
}


