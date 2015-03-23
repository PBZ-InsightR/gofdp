package com.gofdp.interfaces.bridge;

public class SodaImpSingleton {
    private static SodaImp sodaImp;

    public SodaImpSingleton(SodaImp sodaImpIn) {
        sodaImp = sodaImpIn;
    }

    public static SodaImp getTheSodaImp() {
        return sodaImp;
    }
}