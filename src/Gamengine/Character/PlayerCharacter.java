package Gamengine.Character;

public class PlayerCharacter {

    String name;
    int hitPoints, attack, defence;

    public PlayerCharacter() { }

    public PlayerCharacter(String name, int hitPoints, int attack, int defence) {
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

    @Override
    public String toString() {
        return "Name: " + getName() + ", HitPoints: " + getHitPoints() + ", Attack: " + getAttack() + ", Defence: " + getDefence();
    }
}
