package com.gofdp.responsibility.observer;

public class DvdRelease {
    private String serialNumber;
    private String dvdName;
    private int dvdReleaseYear;
    private int dvdReleaseMonth;
    private int dvdReleaseDay;


    public DvdRelease(String serialNumber,
                      String dvdName,
                      int dvdReleaseYear,
                      int dvdReleaseMonth,
                      int dvdReleaseDay) {
        setSerialNumber(serialNumber);
        setDvdName(dvdName);
        setDvdReleaseYear(dvdReleaseYear);
        setDvdReleaseMonth(dvdReleaseMonth);
        setDvdReleaseDay(dvdReleaseDay);
    }

    public void updateDvdReleaseDate(int dvdReleaseYear,
                                     int dvdReleaseMonth,
                                     int dvdReleaseDay) {
        setDvdReleaseYear(dvdReleaseYear);
        setDvdReleaseMonth(dvdReleaseMonth);
        setDvdReleaseDay(dvdReleaseDay);
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }

    public void setSerialNumber(String serialNumberIn) {
        this.serialNumber = serialNumberIn;
    }

    public String getDvdName() {
        return this.dvdName;
    }

    public void setDvdName(String dvdNameIn) {
        this.dvdName = dvdNameIn;
    }

    public int getDvdReleaseYear() {
        return this.dvdReleaseYear;
    }

    public void setDvdReleaseYear(int dvdReleaseYearIn) {
        this.dvdReleaseYear = dvdReleaseYearIn;
    }

    public int getDvdReleaseMonth() {
        return this.dvdReleaseMonth;
    }

    public void setDvdReleaseMonth(int dvdReleaseMonthIn) {
        this.dvdReleaseMonth = dvdReleaseMonthIn;
    }

    public int getDvdReleaseDay() {
        return this.dvdReleaseDay;
    }

    public void setDvdReleaseDay(int dvdReleaseDayIn) {
        this.dvdReleaseDay = dvdReleaseDayIn;
    }
}
