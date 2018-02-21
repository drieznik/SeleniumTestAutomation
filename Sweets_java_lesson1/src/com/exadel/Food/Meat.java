package com.exadel.Food;

import com.exadel.Human;

public class Meat extends Food {

    public enum MeatType {CHICKEN, PORK, BEEF}

    public MeatType type;

    public Meat(MeatType type){
        this.type = type;
    }

    @Override
    public boolean canHumanEatIt(Human human) {
        switch (type){
            case PORK: return (!human.isOnDiet() && !human.isVegan());
            case CHICKEN: return (!human.isVegan());
            case BEEF: return (!human.isVegan());
        }
       return !human.isVegan();
    }

    @Override
    public String toString() {
        return type.toString();

    }
}
