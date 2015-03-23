package com.gofdp.operations.command;

public class DvdCommandNameStarsOff extends CommandAbstract {
    private DvdName dvdName;

    public DvdCommandNameStarsOff(DvdName dvdNameIn) {
        this.dvdName = dvdNameIn;
    }

    @Override
    public void execute() {
        this.dvdName.setNameStarsOff();
    }
}
