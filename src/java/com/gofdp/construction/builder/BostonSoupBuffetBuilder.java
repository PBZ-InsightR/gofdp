package com.gofdp.construction.builder;

import com.gofdp.construction.model.BostonClamChowder;
import com.gofdp.construction.model.BostonFishChowder;

/**
 * adapted from http://www.fluffycat.com/
 */
class BostonSoupBuffetBuilder extends SoupBuffetBuilder {
    public void buildClamChowder() {
        soupBuffet.setClamChowder(new BostonClamChowder());
    }

    public void buildFishChowder() {
        soupBuffet.setFishChowder(new BostonFishChowder());
    }

    public void setSoupBuffetName() {
        soupBuffet.setSoupBuffetName("Boston Soup Buffet");
    }
}