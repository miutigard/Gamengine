package Gamengine.Item;

public abstract class Item {

    String name, graphics, interactKey;

    public Item() {

    }

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGraphics() {
        return graphics;
    }

    public void setGraphics(String graphics) {
        this.graphics = graphics;
    }

    public String getInteractKey() {
        return interactKey;
    }

    public void setInteractKey(String interactKey) {
        this.interactKey = interactKey;
    }

    //Methods

    //Interact with item
    public void interactItem() {

    }
}
