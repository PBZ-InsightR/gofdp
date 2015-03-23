package com.gofdp.mvc;

public class ComputingModel extends Model {

    @Override
    public void setOperator(String ope) {
        compute();
        this.operator = ope;
        if (!ope.equals("=")) {
            this.operand = "";
        }
    }

    @Override
    public void setNumber(String num) {
        this.operand += num;
        notifyObserver(this.operand);
    }

    @Override
    public void getResult() {
        compute();
    }

    @Override
    public void reset() {
        this.result = 0;
        this.operand = "0";
        this.operator = "";
        notifyObserver(String.valueOf(this.result));
    }

    public void compute() {
        if (this.operator.equals("")) {
            this.result = Double.parseDouble(this.operand);
        } else {
            if (!this.operand.equals("")) {
                if (this.operator.equals("+"))
                    this.result += Double.parseDouble(this.operand);
                if (this.operator.equals("-"))
                    this.result -= Double.parseDouble(this.operand);
                if (this.operator.equals("*"))
                    this.result *= Double.parseDouble(this.operand);
                if (this.operator.equals("/")) {
                    try {
                        this.result /= Double.parseDouble(this.operand);
                    } catch (ArithmeticException e) {
                        this.result = 0;
                    }
                }
            }
        }
        this.operand = "";
        notifyObserver(String.valueOf(this.result));
    }


}