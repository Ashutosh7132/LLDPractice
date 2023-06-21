package org.mrbajaj.bo;

public class Player {
    private final String name;
    private int currPos;
    private boolean won;

    public Player(String name){
        this.name = name;
        currPos = -1;
        won = false;
    }

    public String getName(){
        return name;
    }
    public void markWon(){
        won = true;
    }
    public int getCurrPos(){
        return currPos;
    }
    public void setCurrPos(int currPos){
        this.currPos = currPos;
    }

    @Override
    public String toString() {
        return name + " ";
    }
}
