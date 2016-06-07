import units.Unit;

/**
 * Created by Геннадий on 6/7/2016.
 */
public class Battle {

    Unit unit1;
    Unit unit2;

    public Battle(Unit unit1,Unit unit2){
        this.unit1 = unit1;
        this.unit2 = unit2;
    }

    public Unit getUnit1() {
        return unit1;
    }

    public Unit getUnit2() {
        return unit2;
    }

    public void move(Unit unit){
        if(unit1 == unit){
            System.out.println(unit1.getName() + " is attack!");
            if(unit1.attack()!=unit2.defence()){
                System.out.println(unit1.getName() + " struck protection " + unit2.getName());
                unit2.setHealth(unit2.getHealth() - unit1.getDamage());
                System.out.println(unit2.getName() + " rest health - " + unit2.getHealth());
            }else{
                System.out.println(unit1.getName() + " don't struck protection " + unit2.getName());
            }
        }
        else{
            System.out.println(unit2.getName() + " is attack!");
            if(unit2.attack()!=unit1.defence()){
                System.out.println(unit2.getName() + " struck protection " + unit1.getName());
                unit1.setHealth(unit1.getHealth() - unit2.getDamage());
                System.out.println(unit1.getName() + " rest health - " + unit1.getHealth());
            }else{
                System.out.println(unit2.getName() + " don't struck protection " + unit1.getName());
            }
        }

    }


}
