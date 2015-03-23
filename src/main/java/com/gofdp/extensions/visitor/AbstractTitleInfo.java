package com.gofdp.extensions.visitor;

public abstract class AbstractTitleInfo {
    private String titleName;

    public final String getTitleName() {
        return this.titleName;
    }

    public final void setTitleName(String titleNameIn) {
        this.titleName = titleNameIn;
    }

    public abstract void accept(TitleBlurbVisitor titleBlurbVisitor);
}
