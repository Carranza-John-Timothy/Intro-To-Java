public class Painter extends Artist {
    public enum Medium {
        OIL, WATERCOLOR, ACRYLIC, PENCIL, CHARCOAL
    }

    private Medium medium;

    public Painter(String name, int age, Medium medium) {
        super(name, age, "Art");
        this.medium = medium;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + "\nMedium: " + medium;
    }
}