package Artist;
public class ArtistDemo {
    public static void main(String[] args) {
        // Instance of Artist class
        Artist artist = new Artist("Charlie Puth", 32, "Music");
        System.out.println("Instance of Artist class");
        System.out.println(artist.displayInfo());

        // Instance of Singer class
        Singer singer = new Singer("Nayeon Im", 29, Singer.Genre.POP);
        System.out.println("\nInstance of Singer class");
        System.out.println(singer.displayInfo());

        // Instance of Painter class
        Painter painter = new Painter("Vincent van Gogh", 37, Painter.Medium.OIL);
        System.out.println("\nInstance of Painter class");
        System.out.println(painter.displayInfo());

        // Instance of Writer class
        Writer writer = new Writer("George Orwell", 46, Writer.WritingStyle.FICTION);
        System.out.println("\nInstance of Writer class");
        System.out.println(writer.displayInfo());

        // Instance of Dancer class
        Dancer dancer = new Dancer("Misty Copeland", 39, Dancer.DanceStyle.BALLET);
        System.out.println("\nInstance of Dancer class");
        System.out.println(dancer.displayInfo());
    }
}