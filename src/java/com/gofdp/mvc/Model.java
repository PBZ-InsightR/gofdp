package com.gofdp.mvc;

public abstract class Model extends Observable {
    protected double result = 0;
    protected String operator = "";
    protected String operand = "";

    public abstract void reset();

    public abstract void getResult();

    public abstract void setOperator(String operator);

    public abstract void setNumber(String num);

}