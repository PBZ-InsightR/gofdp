package com.gofdp.construction.model;

public abstract class AbstractFork implements Cloneable {
    String forkName;

    public String getForkName() {
        return this.forkName;
    }

    public void setForkName(String forkName) {
        this.forkName = forkName;
    }

    public Object clone() {
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException exception) {
            System.err.println("AbstractFork is not Cloneable");
        }
        return object;
    }
}
