package units;

import java.util.Random;

/**
 * Created by ubiso on 07.06.2016.
 */
public class Human implements Unit {

    String name;
    private double health;
    private double damage;
    private double defence;

    public double getDefence() {
        return defence;
    }

    public void setDefence(double defence) {
        this.defence = defence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public int damage(){
        Random rm = new Random();
        return rm.nextInt(3);
    }
    public int defence(){
        Random rm = new Random();
        return rm.nextInt(3);
    }

}
