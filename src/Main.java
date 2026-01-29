public class Main {
    public static void main(String[] args) {
        Film baseFilm = new Film();
        baseFilm.name = "Um gênio indomável";
        baseFilm.yearOfRealese = 1997;
        baseFilm.duration = 110 ;
        baseFilm.assessment = 8.7;

        System.out.println(baseFilm.assessment);
    }
}
