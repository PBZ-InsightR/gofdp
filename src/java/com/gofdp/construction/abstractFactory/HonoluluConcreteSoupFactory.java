package com.gofdp.construction.abstractFactory;

import com.gofdp.construction.builder.ClamChowder;
import com.gofdp.construction.builder.FishChowder;
import com.gofdp.construction.builder.HonoluluClamChowder;
import com.gofdp.construction.builder.HonoluluFishChowder;

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

