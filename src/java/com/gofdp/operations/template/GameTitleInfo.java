package com.gofdp.operations.template;

public class GameTitleInfo extends TitleInfo {
    public GameTitleInfo(String titleName) {
        this.setTitleName(titleName);
    }

    @Override
    public String getTitleBlurb() {
        return ("Game: " + this.getTitleName());
    }
}
