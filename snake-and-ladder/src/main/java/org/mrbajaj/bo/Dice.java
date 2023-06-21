package org.mrbajaj.bo;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {

    private final int min;
    private final int max;

    public Dice(int min, int max){
        this.min = min;
        this.max = max;
    }
    //TODO should this be moved DiceService?
    public int roll(){
        return ThreadLocalRandom.current().nextInt(min, max+1);
    }
}
