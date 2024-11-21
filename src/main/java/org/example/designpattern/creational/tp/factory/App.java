package org.example.designpattern.creational.tp.factory;

public class App {
    public static void main(String[] args) {
        Character c1 = CharacterFactory.CreateCharacter("Warior");
        Character c2 = CharacterFactory.CreateCharacter("Mage");
        Character c3 = CharacterFactory.CreateCharacter("Archer");

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }

}
