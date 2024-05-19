package scripts.entities.core;

public class Health {

    double health;

    public Health(double health) {
        this.health = health;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public void checkIfDie() {
        if (health <= 0) {
            System.out.println("You are dead!");
        }
    }
}
