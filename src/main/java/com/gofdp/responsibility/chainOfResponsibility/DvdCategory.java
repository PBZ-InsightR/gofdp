package com.gofdp.responsibility.chainOfResponsibility;

public class DvdCategory implements TopTitle {
    private String category;
    private String topCategoryTitle;

    public DvdCategory(String category) {
        this.setCategory(category);
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String categoryIn) {
        this.category = categoryIn;
    }

    @Override
    public String getAllCategories() {
        return getCategory();
    }

    public String getTopCategoryTitle() {
        return this.topCategoryTitle;
    }

    public void setTopCategoryTitle(String topCategoryTitleIn) {
        this.topCategoryTitle = topCategoryTitleIn;
    }

    @Override
    public String getTopTitle() {
        return this.topCategoryTitle;
    }
}
