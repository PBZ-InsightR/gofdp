package com.gofdp.mvc;

import java.util.ArrayList;

public class Observable {
    protected ArrayList<Observer> listObserver = new ArrayList<>();

    public void addObserver(Observer obs) {
        this.listObserver.add(obs);
    }

    public void notifyObserver(String str) {
        if (str.matches("^0[0-9]+"))
            str = str.substring(1, str.length());

        for (Observer obs : listObserver)
            obs.update(str);
    }
}
