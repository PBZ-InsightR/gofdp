package com.gofdp.operations.interpreter;

import java.util.ArrayList;
import java.util.ListIterator;

public class DvdActorExpression extends DvdAbstractExpression {
    @Override
    public String interpret(DvdInterpreterContext dvdInterpreterContext) {
        ArrayList actors = dvdInterpreterContext.getAllActors();
        ListIterator actorsIterator = actors.listIterator();
        StringBuilder titleBuffer = new StringBuilder("");
        boolean first = true;
        while (actorsIterator.hasNext()) {
            if (!first) {
                titleBuffer.append(", ");
            } else {
                first = false;
            }
            titleBuffer.append((String) actorsIterator.next());
        }
        return titleBuffer.toString();
    }
}
