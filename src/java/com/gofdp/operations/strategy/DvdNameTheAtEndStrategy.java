package com.gofdp.operations.strategy;

public class DvdNameTheAtEndStrategy extends DvdNameStrategy {
    @Override
    public String formatDvdName(String dvdName, char charIn) {
        if (dvdName.startsWith("The ")) {
            return dvdName.substring(4, (dvdName.length())) + ", The";
        }
        if (dvdName.startsWith("THE ")) {
            return dvdName.substring(4, (dvdName.length())) + ", THE";
        }
        if (dvdName.startsWith("the ")) {
            return dvdName.substring(4, (dvdName.length())) + ", the";
        }
        return dvdName;
    }
}
