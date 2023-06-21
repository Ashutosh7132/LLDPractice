package org.mrbajaj.bo;

import org.mrbajaj.enums.JumpType;

/**
 * This class is used for both Snake and Ladder nextPositionMove
 */
public class Jump {

    private final int landPos;
    JumpType type;

    public Jump(int startPos, int nextPos){
        if(startPos == nextPos){
            type = JumpType.NONE;
        }else if(startPos < nextPos){
            type = JumpType.LADDER;
        }else {
            type = JumpType.SNAKE;
        }
        this.landPos = nextPos;

    }
    public int getLandPos(){
        return this.landPos;
    }
}
