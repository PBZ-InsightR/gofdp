package com.gofdp.interfaces.bridge;

public class SuperSizeSoda extends Soda {
    public SuperSizeSoda() {
        setSodaImp();
    }

    @Override
    public void pourSoda() {
        SodaImp sodaImp = this.getSodaImp();
        for (int i = 0; i < 5; i++) {
            System.out.print("...glug...");
            sodaImp.pourSodaImp();
        }
        System.out.println(" ");
    }
}
