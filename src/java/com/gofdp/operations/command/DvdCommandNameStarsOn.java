package com.gofdp.operations.command;

public class DvdCommandNameStarsOn extends CommandAbstract {
    private DvdName dvdName;

    public DvdCommandNameStarsOn(DvdName dvdNameIn) {
        this.dvdName = dvdNameIn;
    }

    @Override
    public void execute() {
        this.dvdName.setNameStarsOn();
    }
}
