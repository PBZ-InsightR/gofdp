package com.gofdp.operations.state;

public class DvdStateNameExclaim implements DvdStateName {
    @Override
    public void showName(DvdStateContext dvdStateContext,
                         String nameIn) {
        System.out.println(nameIn.replace(' ', '!'));
        //show exclaim only once, switch back to stars
        dvdStateContext.setDvdStateName(new DvdStateNameStars());
    }
}
