public class Dancer extends Artist {
    public enum DanceStyle {
        BALLET, HIPHOP, JAZZ, CONTEMPORARY
    }

    private DanceStyle danceStyle;

    public Dancer(String name, int age, DanceStyle danceStyle) {
        super(name, age, "Dance");
        this.danceStyle = danceStyle;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + "\nDance Style: " + danceStyle;
    }
}