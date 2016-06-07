package units;

/**
 * Created by Геннадий on 6/7/2016.
 */
public interface Unit {

    public int attack();
    public int defence();
    public double getHealth();
    public void setHealth(double health);
    public String getName();
}
