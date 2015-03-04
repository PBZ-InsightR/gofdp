package com.gofdp.responsibility.proxy;

public class PotOfTea implements PotOfTeaInterface {
    public PotOfTea() {
        System.out.println("Making a pot of tea");
    }

    @Override
    public void pourTea() {
        System.out.println("Pouring tea");
    }
}
