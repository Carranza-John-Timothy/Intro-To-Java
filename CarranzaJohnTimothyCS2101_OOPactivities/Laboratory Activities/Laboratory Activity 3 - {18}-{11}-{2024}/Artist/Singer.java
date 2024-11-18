package Artist;
public class Singer extends Artist {
    public enum Genre {
        POP, ROCK, CLASSICAL, JAZZ, HIPHOP, RNB
    }

    private Genre genre;

    public Singer(String name, int age, Genre genre) {
        super(name, age, "Music");
        this.genre = genre;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + "\nGenre: " + genre;
    }
}