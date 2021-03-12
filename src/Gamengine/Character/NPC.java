package Gamengine.Character;

public class NPC {

    String name, graphics, interactKey;
    int hitPoints, attack, defence;

    public NPC() { }

    public NPC(String name, int hitPoints, int attack, int defence) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.attack = attack;
        this.defence = defence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public String getInteractKey() {
        return interactKey;
    }

    public void setInteractKey(String interactKey) {
        this.interactKey = interactKey;
    }

    //Use filelocation of picture file to set as a string to get the graphic for the player character.
    public String getGraphics() {
        return graphics;
    }

    public void setGraphics(String graphics) {
        this.graphics = graphics;
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
