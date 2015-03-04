package com.gofdp.construction.abstractFactory;

import com.gofdp.construction.builder.BostonClamChowder;
import com.gofdp.construction.builder.BostonFishChowder;
import com.gofdp.construction.builder.ClamChowder;
import com.gofdp.construction.builder.FishChowder;

/**
 * adapted from http://www.fluffycat.com/
 */
class BostonConcreteSoupFactory extends AbstractSoupFactory {
    public BostonConcreteSoupFactory() {
        factoryLocation = "Boston";
    }

    public ClamChowder makeClamChowder() {
        return new BostonClamChowder();
    }

    public FishChowder makeFishChowder() {
        return new BostonFishChowder();
    }
}