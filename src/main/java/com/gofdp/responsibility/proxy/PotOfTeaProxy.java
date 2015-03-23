package com.gofdp.responsibility.proxy;

public class PotOfTeaProxy implements PotOfTeaInterface {
    PotOfTea potOfTea;

    @Override
    public void pourTea() {
        potOfTea = new PotOfTea();
        potOfTea.pourTea();
    }
}
