package com.gofdp.construction.builder;

import java.util.ArrayList;

/**
 * adapted from http://www.fluffycat.com/
 */
public abstract class Soup {
    ArrayList<String> soupIngredients = new ArrayList<>();
    String soupName;

    public String getSoupName() {
        return soupName;
    }

    public String toString() {
        StringBuilder stringOfIngredients = new StringBuilder(soupName);
        stringOfIngredients.append(" Ingredients: ");
        for (Object soupIngredient : soupIngredients) {
            stringOfIngredients.append(soupIngredient);
        }
        return stringOfIngredients.toString();
    }
}