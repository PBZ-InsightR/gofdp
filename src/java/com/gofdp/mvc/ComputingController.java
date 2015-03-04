package com.gofdp.mvc;

public class ComputingController extends Controller {

    public ComputingController(Model cal) {
        super(cal);
    }

    @Override
    public void control() {
        if (this.operators.contains(this.operator)) {
            if (this.operator.equals("="))
                this.calc.getResult();
            else
                this.calc.setOperator(this.operator);
        }

        if (this.number.matches("^[0-9.]+$"))
            this.calc.setNumber(this.number);

        this.operator = "";
        this.number = "";
    }
}