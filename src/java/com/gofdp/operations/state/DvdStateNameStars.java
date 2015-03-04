package com.gofdp.operations.state;

public class DvdStateNameStars implements DvdStateName {
    int starCount;

    public DvdStateNameStars() {
        starCount = 0;
    }

    @Override
    public void showName(DvdStateContext dvdStateContext,
                         String nameIn) {
        System.out.println(nameIn.replace(' ', '*'));
        // show stars twice, switch to exclamation point
        if (++starCount > 1) {
            dvdStateContext.setDvdStateName(
                    new DvdStateNameExclaim());
        }
    }
}
