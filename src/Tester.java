import units.Orc;
import units.Unit;

import java.util.Random;

/**
 * Created by Геннадий on 6/7/2016.
 */
public class Tester {

    public static void main(String[] args) {
        Random rm = new Random(500);
        Unit orc = new Orc("Durothan", 3, 12);
        Unit orc2 = new Orc("Orgrim", 3, 12);
        Battle b = new Battle(orc,orc2);
        while(true){
            b.move(b.getUnit1());
            b.move(b.getUnit2());
            if(b.getUnit1().getHealth()<=0){
                System.out.println("Game ended. " + b.getUnit2().getName() + " - winner.");
                break;
            }
            if(b.getUnit2().getHealth()<=0){
                System.out.println("Game ended. " + b.getUnit1().getName() + " - winner.");
                break;
            }
        }

    }
}
