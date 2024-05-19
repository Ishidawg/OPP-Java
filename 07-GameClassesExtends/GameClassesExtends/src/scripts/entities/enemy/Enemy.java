package scripts.entities.enemy;

import scripts.entities.core.Health;

public class Enemy extends Health {

    public Enemy(double health) {
        super(health);
    }

    String weapon = "";
    String armor = "";

    public Enemy(double health, String weapon, String armor) {
        super(health);
        this.weapon = weapon;
        this.armor = armor;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getArmor() {
        return armor;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }
}
