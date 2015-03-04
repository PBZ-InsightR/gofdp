package com.gofdp.interfaces.bridge;

class SampleLauncher {
    public static void sampleCherryPlatform() {
        new SodaImpSingleton(new CherrySodaImp());
        System.out.println(
                "testing medium soda on the cherry platform");
        Soda mediumSoda = new MediumSoda();
        mediumSoda.pourSoda();
        System.out.println(
                "testing super size soda on the cherry platform");
        Soda superSizeSoda = new SuperSizeSoda();
        superSizeSoda.pourSoda();
    }

    public static void sampleGrapePlatform() {
        new SodaImpSingleton(new GrapeSodaImp());
        System.out.println(
                "testing medium soda on the grape platform");
        Soda mediumSoda = new MediumSoda();
        mediumSoda.pourSoda();
        System.out.println(
                "testing super size soda on the grape platform");
        Soda superSizeSoda = new SuperSizeSoda();
        superSizeSoda.pourSoda();
    }

    public static void sampleOrangePlatform() {
        new SodaImpSingleton(new OrangeSodaImp());
        System.out.println(
                "testing medium soda on the orange platform");
        Soda mediumSoda = new MediumSoda();
        mediumSoda.pourSoda();
        System.out.println(
                "testing super size soda on the orange platform");
        Soda superSizeSoda = new SuperSizeSoda();
        superSizeSoda.pourSoda();
    }

    public static void main(String[] args) {
        sampleCherryPlatform();
        sampleGrapePlatform();
        sampleOrangePlatform();
    }
}      