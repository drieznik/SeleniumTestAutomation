package com.exadel.Food;

import com.exadel.Human;

public class Sweets extends Food {

    public enum SweetType {SNIKERS, CHOCOLATE, RASIN}

    public SweetType stype;

    public Sweets(SweetType stype){
        this.stype = stype;
    }

    @Override
    public boolean canHumanEatIt(Human human) {
        switch (stype){
            case SNIKERS: return (!human.isAllergic() && !human.isOnDiet());
            case CHOCOLATE: return !human.isOnDiet();
            case RASIN: return !human.isAllergic();
        }
       return (!human.isAllergic() && !human.isOnDiet());
    }

    @Override
    public String toString() {
        return stype.toString();

    }
}
