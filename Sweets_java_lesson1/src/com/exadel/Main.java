package com.exadel;

import com.exadel.Food.Food;
import com.exadel.Food.Meat;
import com.exadel.Food.Sweets;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Petya is allergic, on diet and vegan
        Human petya = new Human("Petya", true, true, true);
        //Vasya is on diet
        Human vasya = new Human("Vasya", false, true, false);
        //Vova is vegan
        Human vova = new Human("Vova", false, false, true);

        List<Human> humans = new ArrayList<>();
        humans.add(petya);
        humans.add(vasya);
        humans.add(vova);

        Food food1 = new Sweets(Sweets.SweetType.CHOCOLATE);
        Food food2 = new Sweets(Sweets.SweetType.RASIN);
        Food food3 = new Sweets(Sweets.SweetType.SNIKERS);
        Food food4 = new Meat(Meat.MeatType.BEEF);
        Food food5 = new Meat(Meat.MeatType.CHICKEN);
        Food food6 = new Meat(Meat.MeatType.PORK);

        List<Food> eating = new ArrayList<>();
        eating.add(food1);
        eating.add(food2);
        eating.add(food3);
        eating.add(food4);
        eating.add(food5);
        eating.add(food6);

        for (Human h : humans){
            System.out.println(h);
            for (Food f : eating) {
                System.out.println(" I " + (f.canHumanEatIt(h) ? "can " : "can't ") + "eat " + f.toString());
            }
        }
    }
}
