package com.gofdp.responsibility.chainOfResponsibility;

public class DvdSubSubCategory implements TopTitle {
    private String subSubCategory;
    private String topSubSubCategoryTitle;
    private DvdSubCategory parent;

    public DvdSubSubCategory(DvdSubCategory dvdSubCategory,
                             String subCategory) {
        this.setSubSubCategory(subCategory);
        this.parent = dvdSubCategory;
    }

    public String getSubSubCategory() {
        return this.subSubCategory;
    }

    public void setSubSubCategory(String subSubCategoryIn) {
        this.subSubCategory = subSubCategoryIn;
    }

    public String getSubCategory() {
        return parent.getSubCategory();
    }

    public void setSubCategory(String subCategoryIn) {
        parent.setSubCategory(subCategoryIn);
    }

    public String getCategory() {
        return parent.getCategory();
    }

    public void setCategory(String categoryIn) {
        parent.setCategory(categoryIn);
    }

    @Override
    public String getAllCategories() {
        return (getCategory() + "/" +
                getSubCategory() + "/" +
                getSubSubCategory());
    }

    public String getTopSubSubCategoryTitle() {
        return this.topSubSubCategoryTitle;
    }

    public void setTopSubSubCategoryTitle(
            String topSubSubCategoryTitleIn) {
        this.topSubSubCategoryTitle = topSubSubCategoryTitleIn;
    }

    public String getTopSubCategoryTitle() {
        return parent.getTopSubCategoryTitle();
    }

    public void setTopSubCategoryTitle(
            String topSubCategoryTitleIn) {
        parent.setTopSubCategoryTitle(topSubCategoryTitleIn);
    }

    public String getTopCategoryTitle() {
        return parent.getTopCategoryTitle();
    }

    public void setTopCategoryTitle(String topCategoryTitleIn) {
        parent.setTopCategoryTitle(topCategoryTitleIn);
    }

    @Override
    public String getTopTitle() {
        if (null != getTopSubSubCategoryTitle()) {
            return this.getTopSubSubCategoryTitle();
        } else {
            System.out.println(
                    "no top title in Category/SubCategory/SubSubCategory " +
                            getAllCategories());
            return parent.getTopTitle();
        }
    }
}
