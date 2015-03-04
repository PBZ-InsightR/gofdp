package com.gofdp.interfaces.composite;

import java.util.LinkedList;
import java.util.ListIterator;

public abstract class TeaBags {
    protected LinkedList<TeaBags> teaBagList;
    protected TeaBags parent;
    protected String name;

    public abstract int countTeaBags();

    public abstract boolean add(TeaBags teaBagsToAdd);

    public abstract boolean remove(TeaBags teaBagsToRemove);

    public abstract ListIterator<TeaBags> createListIterator();

    public void setParent(TeaBags parentIn) {
        parent = parentIn;
    }

    public void setName(String nameIn) {
        name = nameIn;
    }

}
