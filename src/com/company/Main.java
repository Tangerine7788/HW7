package com.company;

public class Main {
    public static void main(String[] args) {
        Hero[] heroes = new Hero[3];
        heroes[0] = new Warrior(300, 30, "CRITICAL DAMAGE");
        heroes[1] = new Magic(200, 10, "BOOST");
        heroes[2] = new Medic(150, 0, "HEALTH");

        for (Hero hero : heroes) {
            hero.applySuperAbility(hero.getSuperAbility());
        }
    }
}
