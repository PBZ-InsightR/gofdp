package com.gofdp.operations.interpreter;

import java.util.ArrayList;
import java.util.ListIterator;

public class DvdActorTitleExpression extends DvdAbstractExpression {
    String title;

    public DvdActorTitleExpression(String title) {
        this.title = title;
    }

    @Override
    public String interpret(DvdInterpreterContext dvdInterpreterContext) {
        ArrayList actorsAndTitles =
                dvdInterpreterContext.getActorsForTitle(title);
        ListIterator actorsAndTitlesIterator =
                actorsAndTitles.listIterator();
        StringBuilder actorBuffer = new StringBuilder("");
        boolean first = true;
        while (actorsAndTitlesIterator.hasNext()) {
            if (!first) {
                actorBuffer.append(", ");
            } else {
                first = false;
            }
            actorBuffer.append((String) actorsAndTitlesIterator.next());
        }
        return actorBuffer.toString();
    }
}
