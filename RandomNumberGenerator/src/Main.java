import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int x= random.nextInt(30)+1;
        double b =random.nextDouble();
        boolean t = random.nextBoolean();

        System.out.println(x);
        System.out.println(b);
        System.out.println(t);
    }
}