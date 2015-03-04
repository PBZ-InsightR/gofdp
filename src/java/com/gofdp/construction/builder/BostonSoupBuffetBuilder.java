package com.gofdp.construction.builder;

/**
 * adapted from http://www.fluffycat.com/
 */
class BostonSoupBuffetBuilder extends SoupBuffetBuilder {
    public void buildClamChowder() {
        soupBuffet.clamChowder = new BostonClamChowder();
    }

    public void buildFishChowder() {
        soupBuffet.fishChowder = new BostonFishChowder();
    }

    public void setSoupBuffetName() {
        soupBuffet.soupBuffetName = "Boston Soup Buffet";
    }
}