package com.gofdp.construction.model;

public class SingleSpoon {
    private static SingleSpoon theSpoon;
    private static boolean theSpoonIsAvailable = true;
    private Soup soupLastUsedWith;

    private SingleSpoon() {
    }

    public static SingleSpoon getTheSpoon() {
        if (theSpoonIsAvailable) {
            if (theSpoon == null) {
                theSpoon = new SingleSpoon();
            }
            theSpoonIsAvailable = false;
            return theSpoon;
        } else {
            return null;
        }
    }

    public void returnTheSpoon() {
        theSpoon.cleanSpoon();
        theSpoonIsAvailable = true;
    }

    public String toString() {
        return "Behold the glorious single spoon!";
    }

    public Soup getSoupLastUsedWith() {
        return this.soupLastUsedWith;
    }

    public void setSoupLastUsedWith(Soup soup) {
        this.soupLastUsedWith = soup;
    }

    public void cleanSpoon() {
        this.setSoupLastUsedWith(null);
    }
}
