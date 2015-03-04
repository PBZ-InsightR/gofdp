package com.gofdp.responsibility.observer;

import java.util.ArrayList;
import java.util.ListIterator;

public class DvdReleaseByCategory {
    String categoryName;
    ArrayList<DvdSubscriber> subscriberList = new ArrayList<>();
    ArrayList<DvdRelease> dvdReleaseList = new ArrayList<>();

    public DvdReleaseByCategory(String categoryNameIn) {
        categoryName = categoryNameIn;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public boolean addSubscriber(DvdSubscriber dvdSubscriber) {
        return subscriberList.add(dvdSubscriber);
    }

    public boolean removeSubscriber(DvdSubscriber dvdSubscriber) {
        ListIterator listIterator = subscriberList.listIterator();
        while (listIterator.hasNext()) {
            if (dvdSubscriber == listIterator.next()) {
                listIterator.remove();
                return true;
            }
        }
        return false;
    }

    public void newDvdRelease(DvdRelease dvdRelease) {
        dvdReleaseList.add(dvdRelease);
        notifySubscribersOfNewDvd(dvdRelease);
    }

    public void updateDvd(DvdRelease dvdRelease) {
        boolean dvdUpdated = false;
        DvdRelease tempDvdRelease;
        ListIterator<DvdRelease> listIterator = dvdReleaseList.listIterator();
        while (listIterator.hasNext()) {
            tempDvdRelease = listIterator.next();
            if (dvdRelease.getSerialNumber().
                    equals(tempDvdRelease.getSerialNumber())) {
                listIterator.remove();
                listIterator.add(dvdRelease);
                dvdUpdated = true;
                break;
            }
        }
        if (dvdUpdated) {
            notifySubscribersOfUpdate(dvdRelease);
        } else {
            this.newDvdRelease(dvdRelease);
        }
    }

    private void notifySubscribersOfNewDvd(DvdRelease dvdRelease) {
        for (Object aSubscriberList : subscriberList) {
            ((DvdSubscriber) (aSubscriberList)).
                    newDvdRelease(dvdRelease, this.getCategoryName());
        }
    }

    private void notifySubscribersOfUpdate(DvdRelease dvdRelease) {
        for (Object aSubscriberList : subscriberList) {
            ((DvdSubscriber) (aSubscriberList)).
                    updateDvdRelease(dvdRelease, this.getCategoryName());
        }
    }
}
