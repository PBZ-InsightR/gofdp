package com.gofdp.mvc;

import java.util.ArrayList;

public abstract class Controller {
    protected Model calc;
    protected String operator = "";
    protected String number = "";
    protected ArrayList<String> operators = new ArrayList<>();

    public Controller(Model cal) {
        this.calc = cal;
        this.operators.add("+");
        this.operators.add("-");
        this.operators.add("*");
        this.operators.add("/");
        this.operators.add("=");
    }

    public void setOperator(String ope) {
        this.operator = ope;
        control();
    }

    public void setNumber(String number) {
        this.number = number;
        control();
    }

    public void reset() {
        this.calc.reset();
    }

    abstract void control();
}