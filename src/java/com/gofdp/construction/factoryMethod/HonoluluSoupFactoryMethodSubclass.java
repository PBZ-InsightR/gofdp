package com.gofdp.construction.factoryMethod;

import com.gofdp.construction.builder.ClamChowder;
import com.gofdp.construction.builder.FishChowder;
import com.gofdp.construction.builder.HonoluluClamChowder;
import com.gofdp.construction.builder.HonoluluFishChowder;

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

