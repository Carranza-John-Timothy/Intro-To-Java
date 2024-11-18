package Artist;
public class Writer extends Artist {
    public enum WritingStyle {
        FICTION, NONFICTION, POETRY, DRAMA
    }

    private WritingStyle writingStyle;

    public Writer(String name, int age, WritingStyle writingStyle) {
        super(name, age, "Literature");
        this.writingStyle = writingStyle;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + "\nWriting Style: " + writingStyle;
    }
}