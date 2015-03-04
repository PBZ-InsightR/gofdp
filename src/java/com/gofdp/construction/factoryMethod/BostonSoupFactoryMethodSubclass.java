package com.gofdp.construction.factoryMethod;

import com.gofdp.construction.model.BostonClamChowder;
import com.gofdp.construction.model.BostonFishChowder;
import com.gofdp.construction.model.ClamChowder;
import com.gofdp.construction.model.FishChowder;

/**
 * adapted from http://www.fluffycat.com/
 */
class BostonSoupFactoryMethodSubclass extends SoupFactoryMethod {
    public String makeBuffetName() {
        return "Boston Soup Buffet";
    }

    public ClamChowder makeClamChowder() {
        return new BostonClamChowder();
    }

    public FishChowder makeFishChowder() {
        return new BostonFishChowder();
    }
}



