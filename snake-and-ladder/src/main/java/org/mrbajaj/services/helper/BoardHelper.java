package org.mrbajaj.services.helper;

import org.mrbajaj.bo.Board;
import org.mrbajaj.bo.Cell;

public class BoardHelper {

    public static void printBoard(Board board){
        if(board != null){
            for(Cell cell: board.getCells()){
                System.out.println(cell);
            }
        }
    }
}
