package com.gofdp.mvc;

public class Launcher {

    public static void main(String[] args) {
        Model calc = new ComputingModel();
        Controller controler = new ComputingController(calc);
        ComputingEngine calculette = new ComputingEngine(controler);
        calc.addObserver(calculette);
    }
}