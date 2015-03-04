package com.gofdp.interfaces.composite;

import java.util.ListIterator;

public class OneTeaBag extends TeaBags {
    public OneTeaBag(String nameIn) {
        this.setName(nameIn);
    }

    @Override
    public int countTeaBags() {
        return 1;
    }

    @Override
    public boolean add(TeaBags teaBagsToAdd) {
        return false;
    }

    @Override
    public boolean remove(TeaBags teaBagsToRemove) {
        return false;
    }

    @Override
    public ListIterator<TeaBags> createListIterator() {
        return null;
    }
}
