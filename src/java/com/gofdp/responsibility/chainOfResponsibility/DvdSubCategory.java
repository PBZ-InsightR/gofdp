package com.gofdp.responsibility.chainOfResponsibility;

public class DvdSubCategory implements TopTitle {
    private String subCategory;
    private String topSubCategoryTitle;
    private DvdCategory parent;

    public DvdSubCategory(DvdCategory dvdCategory, String subCategory) {
        this.setSubCategory(subCategory);
        this.parent = dvdCategory;
    }

    public String getSubCategory() {
        return this.subCategory;
    }

    public void setSubCategory(String subCategoryIn) {
        this.subCategory = subCategoryIn;
    }

    public String getCategory() {
        return parent.getCategory();
    }

    public void setCategory(String categoryIn) {
        parent.setCategory(categoryIn);
    }

    @Override
    public String getAllCategories() {
        return (getCategory() + "/" + getSubCategory());
    }

    public String getTopSubCategoryTitle() {
        return this.topSubCategoryTitle;
    }

    public void setTopSubCategoryTitle(String topSubCategoryTitleIn) {
        this.topSubCategoryTitle = topSubCategoryTitleIn;
    }

    public String getTopCategoryTitle() {
        return parent.getTopCategoryTitle();
    }

    public void setTopCategoryTitle(String topCategoryTitleIn) {
        parent.setTopCategoryTitle(topCategoryTitleIn);
    }

    @Override
    public String getTopTitle() {
        if (null != getTopSubCategoryTitle()) {
            return this.getTopSubCategoryTitle();
        } else {
            System.out.println("no top title in Category/SubCategory " +
                    getAllCategories());
            return parent.getTopTitle();
        }
    }
}
