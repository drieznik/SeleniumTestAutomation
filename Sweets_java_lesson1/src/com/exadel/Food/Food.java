package com.exadel.Food;

public abstract class Food implements EatFood {
    int calories;
    String type;

    @Override
    public int getSumOfCalories(int weight) {
        return calories * weight;
    }
}
