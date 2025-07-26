package Main;

public class Main {
    public static void main(String[] args) {

        System.out.printf("%s Hello and welcome!\n", "My name is Beacon.");

        for (int i = 1; i <= 15; i++) {
            if (i == 1) {
                System.out.printf("[%d, ", i);
            }
            else if (i <= 14) {
                System.out.printf("%d, ", i);
            } else System.out.printf("%d]", i);
        }
    }
}