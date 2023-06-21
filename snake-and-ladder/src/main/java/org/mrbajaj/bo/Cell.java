package org.mrbajaj.bo;

public class Cell {
    private final int pos;
    private Jump jump;

    public Cell(int pos){
        this.pos = pos;
        jump = new Jump(-1, -1);
    }

    public boolean jumpExists(){
        return jump != null && jump.getLandPos() != -1;
    }
    public Jump getJump() {
        return jump;
    }
    public void setMove(Jump jump) {
        this.jump = jump;
    }
    public int getPos() {
        return pos;
    }

    @Override
    public String toString() {
        return "Pos: " + pos + ( this.jumpExists() ? (" | jump: " + jump.getLandPos() + " " + jump.type) : "" );
    }
}
