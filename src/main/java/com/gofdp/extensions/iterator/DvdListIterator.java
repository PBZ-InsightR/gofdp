package com.gofdp.extensions.iterator;

public interface DvdListIterator {
    public void first();

    public void next();

    public boolean isDone();

    public String currentItem();
}
