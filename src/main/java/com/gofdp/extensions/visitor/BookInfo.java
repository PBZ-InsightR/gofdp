package com.gofdp.extensions.visitor;

public class BookInfo extends AbstractTitleInfo {
    private String author;

    public BookInfo(String titleName, String author) {
        this.setTitleName(titleName);
        this.setAuthor(author);
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String authorIn) {
        this.author = authorIn;
    }

    public void accept(TitleBlurbVisitor titleBlurbVisitor) {
        titleBlurbVisitor.visit(this);
    }
}
