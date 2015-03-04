package com.gofdp.construction.factoryMethod;

import com.gofdp.construction.model.ClamChowder;
import com.gofdp.construction.model.FishChowder;
import com.gofdp.construction.model.HonoluluClamChowder;
import com.gofdp.construction.model.HonoluluFishChowder;

/**
 * adapted from http://www.fluffycat.com/
 */
class HonoluluSoupFactoryMethodSubclass extends SoupFactoryMethod {
    public String makeBuffetName() {
        return "Honolulu Soup Buffet";
    }

    public ClamChowder makeClamChowder() {
        return new HonoluluClamChowder();
    }

    public FishChowder makeFishChowder() {
        return new HonoluluFishChowder();
    }
}

