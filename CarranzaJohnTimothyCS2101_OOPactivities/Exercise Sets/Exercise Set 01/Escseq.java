public class Escseq {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int multiple = (i + 1) * 7;
            if (i % 2 == 0) {
                System.out.println(multiple);
            } else {
                System.out.println("\t" + multiple);
            }
        }
    }
}
