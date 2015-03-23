package com.gofdp.operations.interpreter;

import java.util.ArrayList;
import java.util.ListIterator;

public class DvdTitleExpression extends DvdAbstractExpression {
    @Override
    public String interpret(DvdInterpreterContext
                                    dvdInterpreterContext) {
        ArrayList titles = dvdInterpreterContext.getAllTitles();
        ListIterator titlesIterator = titles.listIterator();
        StringBuilder titleBuffer = new StringBuilder("");
        boolean first = true;
        while (titlesIterator.hasNext()) {
            if (!first) {
                titleBuffer.append(", ");
            } else {
                first = false;
            }
            titleBuffer.append((String) titlesIterator.next());
        }
        return titleBuffer.toString();
    }
}
