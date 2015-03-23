package com.gofdp.construction.abstractFactory;

import com.gofdp.construction.model.ClamChowder;
import com.gofdp.construction.model.FishChowder;
import com.gofdp.construction.model.HonoluluClamChowder;
import com.gofdp.construction.model.HonoluluFishChowder;

/**
 * adapted from http://www.fluffycat.com/
 */
class HonoluluConcreteSoupFactory extends AbstractSoupFactory {
    public HonoluluConcreteSoupFactory() {
        factoryLocation = "Honolulu";
    }

    public ClamChowder makeClamChowder() {
        return new HonoluluClamChowder();
    }

    public FishChowder makeFishChowder() {
        return new HonoluluFishChowder();
    }
}

