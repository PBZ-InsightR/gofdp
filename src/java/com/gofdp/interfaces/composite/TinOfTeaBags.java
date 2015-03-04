package com.gofdp.interfaces.composite;

import java.util.LinkedList;
import java.util.ListIterator;

public class TinOfTeaBags extends TeaBags {
    public TinOfTeaBags(String nameIn) {
        teaBagList = new LinkedList<>();
        this.setName(nameIn);
    }

    @Override
    public int countTeaBags() {
        int totalTeaBags = 0;
        ListIterator<TeaBags> listIterator = createListIterator();
        TeaBags tempTeaBags;
        while (listIterator.hasNext()) {
            tempTeaBags = listIterator.next();
            totalTeaBags += tempTeaBags.countTeaBags();
        }
        return totalTeaBags;
    }

    @Override
    public boolean add(TeaBags teaBagsToAdd) {
        teaBagsToAdd.setParent(this);
        return teaBagList.add(teaBagsToAdd);
    }

    @Override
    public boolean remove(TeaBags teaBagsToRemove) {
        ListIterator<TeaBags> listIterator = createListIterator();
        TeaBags tempTeaBags;
        while (listIterator.hasNext()) {
            tempTeaBags = listIterator.next();
            if (tempTeaBags == teaBagsToRemove) {
                listIterator.remove();
                return true;
            }
        }
        return false;
    }

    @Override
    public ListIterator<TeaBags> createListIterator() {
        return teaBagList.listIterator();
    }
}
