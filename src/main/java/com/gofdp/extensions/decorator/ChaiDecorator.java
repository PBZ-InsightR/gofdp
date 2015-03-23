package com.gofdp.extensions.decorator;

import java.util.ArrayList;

public class ChaiDecorator extends Tea {
    private Tea teaToMakeChai;
    private ArrayList<String> chaiIngredients = new ArrayList<>();

    public ChaiDecorator(Tea teaToMakeChai) {
        this.addTea(teaToMakeChai);
        chaiIngredients.add("bay leaf");
        chaiIngredients.add("cinnamon stick");
        chaiIngredients.add("ginger");
        chaiIngredients.add("honey");
        chaiIngredients.add("soy milk");
        chaiIngredients.add("vanilla bean");
    }

    private void addTea(Tea teaToMakeChaiIn) {
        this.teaToMakeChai = teaToMakeChaiIn;
    }

    public void steepTea() {
        this.steepChai();
    }

    public void steepChai() {
        teaToMakeChai.steepTea();
        this.steepChaiIngredients();
        System.out.println("tea is steeping with chai");
    }

    public void steepChaiIngredients() {
        for (Object chaiIngredient : chaiIngredients) {
            System.out.println((chaiIngredient) + " is steeping");
        }
        System.out.println("chai ingredients are steeping");
    }
}