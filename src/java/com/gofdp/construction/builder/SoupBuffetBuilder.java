package com.gofdp.construction.builder;

import com.gofdp.construction.model.*;

/**
 * adapted from http://www.fluffycat.com/
 */
abstract class SoupBuffetBuilder {
    SoupBuffet soupBuffet;

    public SoupBuffet getSoupBuffet() {
        return soupBuffet;
    }

    public void buildSoupBuffet() {
        soupBuffet = new SoupBuffet();
    }

    public abstract void setSoupBuffetName();

    public void buildChickenSoup() {
        soupBuffet.setChickenSoup(new ChickenSoup());
    }

    public void buildClamChowder() {
        soupBuffet.setClamChowder(new ClamChowder());
    }

    public void buildFishChowder() {
        soupBuffet.setFishChowder(new FishChowder());
    }

    public void buildMinnestrone() {
        soupBuffet.setMinnestrone(new Minnestrone());
    }

    public void buildPastaFazul() {
        soupBuffet.setPastaFazul(new PastaFazul());
    }

    public void buildTofuSoup() {
        soupBuffet.setTofuSoup(new TofuSoup());
    }

    public void buildVegetableSoup() {
        soupBuffet.setVegetableSoup(new VegetableSoup());
    }
}