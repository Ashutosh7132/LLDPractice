package org.mrbajaj.bo;

import java.util.concurrent.ThreadLocalRandom;

public class Board {

    private Cell[] cells; // Note: 0 indexed start of the cell
    private int winPos;

    private int size;
    public Board(int size, int snakesCount, int ladderCount){

        configureBoard(size, snakesCount, ladderCount);

    }

    public int getWinPos() {
        return winPos;
    }

    public boolean isWinPosition(int pos){
        return  pos >= winPos;
    }

    public Cell[] getCells() {
        return cells;
    }

    public Cell getCellAtIndex(int index){
        if(index >= size){
            return null;
        }
        return cells[index];
    }

    /**
     * TODO: TooManySnakesException, TooManyLadderException
     *
     */
    public void configureBoard(int size, int snakeCount, int ladderCount){
        this.size = size;
        this.winPos = size-1;
        this.cells = new Cell[size];
        // initialize all cells
        for(int i = 0; i < size; i++){
            cells[i] = new Cell(i);
        }

        // add snakes to cells
        while(snakeCount != 0){
            // add snakes
            int snakeHeadPos = ThreadLocalRandom.current().nextInt(1, size);

            Cell cell = this.cells[snakeHeadPos];
            int snakeTailPos = ThreadLocalRandom.current().nextInt(1, snakeHeadPos);
            if(!cell.jumpExists()){
                // no jump exist on this position

                Jump jump = new Jump(snakeHeadPos, snakeTailPos);

                cell.setMove(jump);

                snakeCount--;

                System.out.println("Snake added with head: " + snakeHeadPos + ", tail: " + snakeTailPos);
            }else{
                System.out.println("Jump already exist while adding snake at " + snakeHeadPos);
            }
        }

        while (ladderCount != 0){
            int ladderBottomPos = ThreadLocalRandom.current().nextInt(1, size);

            Cell cell = this.cells[ladderBottomPos];
            int ladderTopPos = ThreadLocalRandom.current().nextInt(ladderBottomPos+1, size);
            if(!cell.jumpExists()){
                // no jump exist on this position

                Jump jump = new Jump(ladderBottomPos, ladderTopPos);

                cell.setMove(jump);

                ladderCount--;
                System.out.println("Ladder added with bottom: " + ladderBottomPos + ", top: " + ladderTopPos);
            }else{
                System.out.println("Jump already exist while adding ladder at " + ladderBottomPos);
            }

        }


    }
}
