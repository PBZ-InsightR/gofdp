package com.gofdp.construction.abstractFactory;

import com.gofdp.construction.model.BostonClamChowder;
import com.gofdp.construction.model.BostonFishChowder;
import com.gofdp.construction.model.ClamChowder;
import com.gofdp.construction.model.FishChowder;

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