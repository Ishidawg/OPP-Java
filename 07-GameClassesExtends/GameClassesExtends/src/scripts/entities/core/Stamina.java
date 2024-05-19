package scripts.entities.core;

public class Stamina {

    double stamina;

    public Stamina(double stamina) {
        this.stamina = stamina;
    }

    public double getStamina() {
        return stamina;
    }

    public void setStamina(double stamina) {
        this.stamina = stamina;
    }

    public void checkIfOutOfStamina() {
        if (stamina <= 0) {
            System.out.println("Stamina is out of stamina!");
        }
    }
}
