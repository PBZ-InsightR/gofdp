package com.gofdp.construction.factoryMethod;

import com.gofdp.construction.builder.BostonClamChowder;
import com.gofdp.construction.builder.BostonFishChowder;
import com.gofdp.construction.builder.ClamChowder;
import com.gofdp.construction.builder.FishChowder;

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



