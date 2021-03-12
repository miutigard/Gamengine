package Gamengine.Character;

public class PlayerCharacter {

    String name, graphics, moveUpKey, moveDownKey, moveRightKey, moveLeftKey, attackKey;
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

    //Use filelocation of picture file to set as a string to get the graphic for the player character.
    public String getGraphics() {
        return graphics;
    }

    public void setGraphics(String graphics) {
        this.graphics = graphics;
    }

    public String getMoveUpKey() {
        return moveUpKey;
    }

    public void setMoveUpKey(String moveUpKey) {
        this.moveUpKey = moveUpKey;
    }

    public String getMoveDownKey() {
        return moveDownKey;
    }

    public void setMoveDownKey(String moveDownKey) {
        this.moveDownKey = moveDownKey;
    }

    public String getMoveRightKey() {
        return moveRightKey;
    }

    public void setMoveRightKey(String moveRightKey) {
        this.moveRightKey = moveRightKey;
    }

    public String getMoveLeftKey() {
        return moveLeftKey;
    }

    public void setMoveLeftKey(String moveLeftKey) {
        this.moveLeftKey = moveLeftKey;
    }

    public String getAttackKey() {
        return attackKey;
    }

    public void setAttackKey(String attackKey) {
        this.attackKey = attackKey;
    }

    //Methods

    //Move player character methods
    public void moveUp(String moveUpKey) {

    }

    public void moveDown(String moveDownKey) {

    }

    public void moveRight(String moveRightKey) {

    }

    public void moveLeft(String moveLeftKey) {

    }

    //Attack with player character

    public void attack(String attackKey) {

    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", HitPoints: " + getHitPoints() + ", Attack: " + getAttack() + ", Defence: " + getDefence();
    }
}
