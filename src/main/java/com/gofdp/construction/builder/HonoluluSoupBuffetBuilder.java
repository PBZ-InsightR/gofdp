package com.gofdp.construction.builder;

import com.gofdp.construction.model.HonoluluClamChowder;
import com.gofdp.construction.model.HonoluluFishChowder;

/**
 * adapted from http://www.fluffycat.com/
 */
class HonoluluSoupBuffetBuilder extends SoupBuffetBuilder {
    public void buildClamChowder() {
        soupBuffet.setClamChowder(new HonoluluClamChowder());
    }

    public void buildFishChowder() {
        soupBuffet.setFishChowder(new HonoluluFishChowder());
    }

    public void setSoupBuffetName() {
        soupBuffet.setSoupBuffetName("Honolulu Soup Buffet");
    }
}
