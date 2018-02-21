package com.exadel.Food;

import com.exadel.Human;

public interface EatFood {

    public boolean canHumanEatIt(Human human);

    public int getSumOfCalories(int weight);
}
