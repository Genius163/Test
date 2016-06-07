package units;

import java.util.Random;

/**
 * Created by Геннадий on 6/7/2016.
 */
public class Orc  implements Unit{

    private String name;
    private double health;
    private double damage;

    public Orc(String name, double damage, double health) {
        this.name = name;
        this.damage = damage;
        this.health = health;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public double getDamage() {
        return damage;
    }

    public double setDamage(double damage) {
        return this.damage = damage;
    }

    @Override
    public int attack(){
        Random rm = new Random();
        return rm.nextInt(3);
    }

    @Override
    public int defence(){
        Random rm = new Random();
        return rm.nextInt(3);
    }



}
