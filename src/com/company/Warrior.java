package com.company;

public class Warrior extends Hero{
    public Warrior(int health, int damage, String superAbility) {
        super(health, damage, superAbility);
    }

    @Override
    public void applySuperAbility(String superAbility) {
        System.out.println(getClass().getSimpleName() + " применил суперспособность " + getSuperAbility());
    }
}
