package Gamengine.Character;

public class NPC extends Characters{

    String interactKey;

    public NPC() { }

    public NPC(String name, int hitPoints, int attack, int defence) {
        super(name, hitPoints, attack, defence);
    }

    public String getInteractKey() {
        return interactKey;
    }

    public void setInteractKey(String interactKey) {
        this.interactKey = interactKey;
    }

    //Methods

    //NPC attacks
    public void attack() {

    }

    //Interacting with non-hostile NPC when ur close to it (If NPC is a shopkeeper or smthing else idk u decide)
    public void interact() {

    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", HitPoints: " + getHitPoints() + ", Attack: " + getAttack() + ", Defence: " + getDefence();
    }
}
