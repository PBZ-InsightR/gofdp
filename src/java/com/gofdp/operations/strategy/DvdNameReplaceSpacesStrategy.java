package com.gofdp.operations.strategy;

public class DvdNameReplaceSpacesStrategy extends DvdNameStrategy {
    @Override
    public String formatDvdName(String dvdName, char charIn) {
        return dvdName.replace(' ', charIn);
    }
}
