package com.exadel;

public class Human {
    private boolean isVegan;
    private boolean isOnDiet;
    private boolean isAllergic;
    private String name;

    public boolean isVegan() {
        return isVegan;
    }

    public void setVegan(boolean vegan) {
        isVegan = vegan;
    }

    public boolean isOnDiet() {
        return isOnDiet;
    }

    public void setOnDiet(boolean onDiet) {
        isOnDiet = onDiet;
    }

    public boolean isAllergic() {
        return isAllergic;
    }

    public void setAllergic(boolean allergic) {
        isAllergic = allergic;
    }

    public String isName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human(String name, Boolean isAllergic, Boolean isOnDiet, Boolean isVegan){
        this.isVegan = isVegan;
        this.isOnDiet = isOnDiet;
        this.isAllergic = isAllergic;
        this.name = name;

    }

    @Override
    public String toString() {
        return "Hello, I am " + name +
                "! I am" +
                (isAllergic ? " allergic" : "") +
                (isOnDiet ? ", on diet": "") +
                (isVegan ? ", vegan." : ".");

    }
}
