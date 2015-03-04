package com.gofdp.construction.abstractFactory;

import com.gofdp.construction.model.Soup;

import java.util.Calendar;

/**
 * adapted from http://www.fluffycat.com/
 */
class SampleLauncher {

    public static Soup MakeSoupOfTheDay(AbstractSoupFactory concreteSoupFactory) {
        Calendar todayCalendar = Calendar.getInstance();
        int dayOfWeek = todayCalendar.get(Calendar.DAY_OF_WEEK);

        switch (dayOfWeek) {
            case Calendar.MONDAY:
                return concreteSoupFactory.makeChickenSoup();
            case Calendar.TUESDAY:
                return concreteSoupFactory.makeClamChowder();
            case Calendar.WEDNESDAY:
                return concreteSoupFactory.makeFishChowder();
            case Calendar.THURSDAY:
                return concreteSoupFactory.makeMinnestrone();
            case Calendar.FRIDAY:
                return concreteSoupFactory.makePastaFazul();
            case Calendar.SATURDAY:
                return concreteSoupFactory.makeTofuSoup();
            default:
                return concreteSoupFactory.makeVegetableSoup();
        }
    }

    public static void main(String[] args) {
        AbstractSoupFactory concreteSoupFactory =
                new BostonConcreteSoupFactory();
        Soup soupOfTheDay = MakeSoupOfTheDay(concreteSoupFactory);
        System.out.println("The Soup of the day " + concreteSoupFactory.getFactoryLocation() + " is " + soupOfTheDay.getSoupName());

        concreteSoupFactory = new HonoluluConcreteSoupFactory();
        soupOfTheDay = MakeSoupOfTheDay(concreteSoupFactory);
        System.out.println("The Soup of the day " + concreteSoupFactory.getFactoryLocation() + " is " + soupOfTheDay.getSoupName());
    }
}      