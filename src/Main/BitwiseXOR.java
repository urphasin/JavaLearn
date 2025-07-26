package Main;

public class BitwiseXOR {
    public static boolean logicalXOR(boolean p, boolean q)
    {
        return p ^ q;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        int result = a ^ b;

        System.out.println(result);

        System.out.println("P\t\tQ\t\tP⊕Q");
        System.out.println("T\t\tT\t\t" + logicalXOR(true, true));
        System.out.println("T\t\tF\t\t" + logicalXOR(true, false));
        System.out.println("F\t\tT\t\t" + logicalXOR(false, true));
        System.out.println("F\t\tF\t\t" + logicalXOR(false, false));


    }
}
