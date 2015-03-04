package com.gofdp.interfaces.bridge;

public class MediumSoda extends Soda {
    public MediumSoda() {
        setSodaImp();
    }

    @Override
    public void pourSoda() {
        SodaImp sodaImp = this.getSodaImp();
        for (int i = 0; i < 2; i++) {
            System.out.print("...glug...");
            sodaImp.pourSodaImp();
        }
        System.out.println(" ");
    }
}
