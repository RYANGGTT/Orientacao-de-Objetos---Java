package br.com.alura.screenmatch.modelos;

public class Serie extends Title {

    //caracteristicas da classe

    private int totalEpisodes;
    private int durationPerEpisodes;
    private int seasons;
    private boolean active;

    public Serie(int yearOfRealese, String name, boolean plan) {
        super(yearOfRealese, name, plan);
    }


    //getters serie
    public int getTotalEpisodes() {
        return totalEpisodes;
    }

    public int getDurationPerEpisodes() {
        return durationPerEpisodes;
    }

    public int getSeasons() {
        return seasons;
    }

    public boolean isActive() {
        return active;
    }

    //setters serie

    public void setTotalEpisodes(int totalEpisodes) {
        this.totalEpisodes = totalEpisodes;
    }

    public void setDurationPerEpisodes(int durationPerEpisodes) {
        this.durationPerEpisodes = durationPerEpisodes;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    //reescrevendo um metodo


    @Override
    public int getDuration() {
        return totalEpisodes * durationPerEpisodes ;
    }
}
