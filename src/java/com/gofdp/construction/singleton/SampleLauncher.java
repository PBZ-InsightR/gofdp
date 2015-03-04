package com.gofdp.construction.singleton;

import com.gofdp.construction.model.SingleSpoon;

class SampleLauncher {

    public static void main(String[] args) throws Exception {
        System.out.println("First person getting the spoon");
        SingleSpoon spoonForFirstPerson =
                SingleSpoon.getTheSpoon();
        if (spoonForFirstPerson != null)
            System.out.println(spoonForFirstPerson + "\n");
        else {
            System.out.println("No spoon was available \n");
            throw new Exception("Constructor does not work !!!");
        }

        System.out.println("Second person getting a spoon");
        SingleSpoon spoonForSecondPerson = SingleSpoon.getTheSpoon();
        if (spoonForSecondPerson != null)
            System.out.println(spoonForSecondPerson + "\n");
        else
            System.out.println("No spoon was available \n");


        System.out.println("First person returning the spoon");
        spoonForFirstPerson.returnTheSpoon();
        System.out.println("The spoon was returned");

        System.out.println("");

        System.out.println("Second person getting a spoon");
        spoonForSecondPerson = SingleSpoon.getTheSpoon();
        if (spoonForSecondPerson != null)
            System.out.println(spoonForSecondPerson);
        else
            System.out.println("No spoon was available");
    }
}      