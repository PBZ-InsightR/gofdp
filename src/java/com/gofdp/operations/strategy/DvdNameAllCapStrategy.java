package com.gofdp.operations.strategy;

public class DvdNameAllCapStrategy extends DvdNameStrategy {
    @Override
    public String formatDvdName(String dvdName, char charIn) {
        return dvdName.toUpperCase();
    }
}
