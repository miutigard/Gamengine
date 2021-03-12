package Gamengine;

import Gamengine.Character.PlayerCharacter;
import Gamengine.Item.Armor;
import Gamengine.Item.Item;

public class Main {

    public static void main(String[] args) {

        //Create character test

        PlayerCharacter Sebastian = new PlayerCharacter();
        Sebastian.setName("Sebastian");
        Sebastian.setHitPoints(10);
        Sebastian.setAttack(3);
        Sebastian.setDefence(2);

        PlayerCharacter Markus = new PlayerCharacter("Markus", 10, 2, 3);


        System.out.println(Markus);
        System.out.println(Sebastian);

        Armor chestpiece = new Armor("Leather Armor", 20 , 10);

        System.out.println(chestpiece.getName());

    }
}
