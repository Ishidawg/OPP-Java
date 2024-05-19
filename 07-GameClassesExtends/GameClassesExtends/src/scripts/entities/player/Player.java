package scripts.entities.player;

import scripts.entities.core.Health;
import scripts.entities.core.Movement;
import scripts.entities.core.Stamina;

public class Player extends Health
{

    // Wtf, my player will not move and have stamina... gwad..

    public Player(double health) {
        super(health);
    }

    String name = "";
    String initalWeapon = "";
    String initialArmor = "";

    public Player(double health, String name, String initialWeapon, String initialArmor) {
        super(health);
        this.name = name;
        this.initalWeapon = initialWeapon;
        this.initialArmor = initialArmor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInitalWeapon() {
        return initalWeapon;
    }

    public void setInitalWeapon(String initalWeapon) {
        this.initalWeapon = initalWeapon;
    }

    public String getInitialArmor() {
        return initialArmor;
    }

    public void setInitialArmor(String initialArmor) {
        this.initialArmor = initialArmor;
    }
}
