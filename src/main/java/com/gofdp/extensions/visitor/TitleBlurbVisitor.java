package com.gofdp.extensions.visitor;

public abstract class TitleBlurbVisitor {
    String titleBlurb;

    public String getTitleBlurb() {
        return this.titleBlurb;
    }

    public void setTitleBlurb(String blurbIn) {
        this.titleBlurb = blurbIn;
    }

    public abstract void visit(BookInfo bookInfo);

    public abstract void visit(DvdInfo dvdInfo);

    public abstract void visit(GameInfo gameInfo);
}   
