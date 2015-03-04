package com.gofdp.responsibility.flyweight;

public class TeaFlavor extends TeaOrder {
    private String teaFlavor;

    TeaFlavor(String teaFlavor) {
        this.teaFlavor = teaFlavor;
    }

    public String getFlavor() {
        return this.teaFlavor;
    }

    @Override
    public void serveTea(TeaOrderContext teaOrderContext) {
        System.out.println("Serving tea flavor " + teaFlavor + " to table number " + teaOrderContext.getTable());
    }
}
