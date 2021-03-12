package Gamengine.Item;

public class Armor extends Item{

    int hitPoints, defence;

    public Armor() {

    }

    public Armor(String name, int hitPoints, int defence) {
        super(name);
        this.hitPoints = hitPoints;
        this.defence = defence;
    }

    //Methods

    //Interact with item (Equips armor)
    public void interactItem() {

    }
}
