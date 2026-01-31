public class Main {
    public static void main(String[] args) {
        Film baseFilm = new Film();
        baseFilm.name = "Um gênio indomável";
        baseFilm.yearOfRealese = 1997;
        baseFilm.duration = 110 ;

        baseFilm.showTecnichalsheet();
        baseFilm.userAssesment(10);
        baseFilm.userAssesment(8);
        baseFilm.userAssesment(7);

        System.out.println(baseFilm.getTotalAssessment());
        System.out.println (baseFilm.mediaAssessment());

    }
}
