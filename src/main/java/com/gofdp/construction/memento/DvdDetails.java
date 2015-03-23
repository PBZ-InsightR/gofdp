package com.gofdp.construction.memento;

import java.util.ArrayList;

public class DvdDetails {
    private String titleName;
    private ArrayList<String> stars;
    private char encodingRegion;

    public DvdDetails(String titleName,
                      ArrayList<String> stars,
                      char encodingRegion) {
        this.setTitleName(titleName);
        this.setStars(stars);
        this.setEncodingRegion(encodingRegion);
    }

    private void setTitleName(String titleNameIn) {
        this.titleName = titleNameIn;
    }

    private String getTitleName() {
        return this.titleName;
    }

    private void setStars(ArrayList<String> starsIn) {
        this.stars = starsIn;
    }

    public void addStar(String starIn) {
        stars.add(starIn);
    }

    private ArrayList<String> getStars() {
        return this.stars;
    }

    private static String getStarsString(ArrayList starsIn) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (Object aStarsIn : starsIn) {
            if (count++ > 0) {
                sb.append(", ");
            }
            sb.append((String) aStarsIn);
        }
        return sb.toString();
    }

    private void setEncodingRegion(char encodingRegionIn) {
        this.encodingRegion = encodingRegionIn;
    }

    private char getEncodingRegion() {
        return this.encodingRegion;
    }

    public String formatDvdDetails() {
        return ("DVD: " + this.getTitleName() +
                ", starring: " + getStarsString(getStars()) +
                ", encoding region: " + this.getEncodingRegion());
    }

    //sets current state to what DvdMemento has
    public void setDvdMemento(DvdMemento dvdMementoIn) {
        dvdMementoIn.getState();
    }

    //save current state of DvdDetails in a DvdMemento
    public DvdMemento createDvdMemento() {
        DvdMemento mementoToReturn = new DvdMemento();
        mementoToReturn.setState();
        return mementoToReturn;
    }

    //an inner class for the memento
    class DvdMemento {
        private String mementoTitleName;
        private ArrayList<String> mementoStars;
        private char mementoEncodingRegion;

        //sets DvdMementoData to DvdDetails
        public void setState() {
            //Because String are immutable we can just set 
            //  the DvdMemento Strings to = the DvdDetail Strings.
            mementoTitleName = getTitleName();
            mementoEncodingRegion = getEncodingRegion();
            //However, ArrayLists are not immutable,
            //  so we need to instantiate a new ArrayList. 
            mementoStars = new ArrayList<>(getStars());
        }

        //resets DvdDetails to DvdMementoData
        public void getState() {
            setTitleName(mementoTitleName);
            setStars(mementoStars);
            setEncodingRegion(mementoEncodingRegion);
        }

        //only useful for testing
        public String showMemento() {
            return ("DVD: " + mementoTitleName +
                    ", starring: " + getStarsString(mementoStars) +
                    ", encoding region: " + mementoEncodingRegion);
        }
    }
}