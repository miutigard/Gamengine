package Gamengine.Item;

public class Weapon extends Item{

    int attack;

    public Weapon() {

    }

    public Weapon(String name, int attack) {
        super(name);
        this.attack = attack;
    }

    //Methods

    //Interact with item (Equips weapon)
    public void interactItem() {

    }
}
