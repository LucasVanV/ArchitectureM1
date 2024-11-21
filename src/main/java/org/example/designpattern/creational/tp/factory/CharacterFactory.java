package org.example.designpattern.creational.tp.factory;

public class CharacterFactory {
    
    public static Character CreateCharacter(String type){
        switch (type) {
            case "Warior":
                return new Warior();
            case "Mage":
                return new Mage();
            case "Archer":
                return new Archer();
            default:
                return null;
        }
    }
}
