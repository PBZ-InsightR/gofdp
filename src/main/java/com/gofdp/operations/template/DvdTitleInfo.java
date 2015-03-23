package com.gofdp.operations.template;

public class DvdTitleInfo extends TitleInfo {
    private String star;
    private char encodingRegion;

    public DvdTitleInfo(String titleName,
                        String star,
                        char encodingRegion) {
        this.setTitleName(titleName);
        this.setStar(star);
        this.setEncodingRegion(encodingRegion);
    }

    public void setStar(String starIn) {
        this.star = starIn;
    }

    public String getStar() {
        return this.star;
    }

    public void setEncodingRegion(char encodingRegionIn) {
        this.encodingRegion = encodingRegionIn;
    }

    public char getEncodingRegion() {
        return this.encodingRegion;
    }

    @Override
    public String getTitleBlurb() {
        return ("DVD: " + this.getTitleName() + ", starring " + this.getStar());
    }

    @Override
    public String getDvdEncodingRegionInfo() {
        return (", encoding region: " + this.getEncodingRegion());
    }
}
