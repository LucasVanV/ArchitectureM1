package org.example.designpattern.creational.tp.factory;

public abstract class Character {
    private String name;
    private int health;
    private int attack;
    private String special;

    Character(String name, int health, int attack, String special){
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.special = special;
    }

    public int getHealth(){return this.health;}
    public int getAttack(){return this.attack;}
    public void useSpecialSkill(){System.out.println(this.special);}

    @Override
    public String toString(){
        return this.name + " / pv: " + this.health + " / att: " + this.attack +" / spe: " + this.special;
    }

}
