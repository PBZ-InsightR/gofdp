package com.gofdp.construction.prototype;

import com.gofdp.construction.model.AbstractFork;
import com.gofdp.construction.model.AbstractSpoon;

public class PrototypeFactory {
    AbstractSpoon prototypeSpoon;
    AbstractFork prototypeFork;

    public PrototypeFactory(AbstractSpoon spoon, AbstractFork fork) {
        prototypeSpoon = spoon;
        prototypeFork = fork;
    }

    public AbstractSpoon makeSpoon() {
        return (AbstractSpoon) prototypeSpoon.clone();
    }

    public AbstractFork makeFork() {
        return (AbstractFork) prototypeFork.clone();
    }
}
