import java.util.Random;

/**
 * Created by Геннадий on 6/7/2016.
 */
public class Tester {

    public static void main(String[] args) {
        Random rm = new Random(500);
        if(rm.nextBoolean())
            System.out.println("Hello booorder");
        else
            System.out.println("Goodbye motherfucker");
    }
}
