package com.gofdp.extensions.decorator;

class SampleLauncher {

    public static void main(String[] args) {
        Tea teaLeaves = new TeaLeaves();
        Tea chaiDecorator = new ChaiDecorator(teaLeaves);
        chaiDecorator.steepTea();
    }
}