package org.mrbajaj.services;

import org.mrbajaj.bo.Board;
import org.mrbajaj.bo.Cell;
import org.mrbajaj.bo.Dice;
import org.mrbajaj.bo.Player;
import org.mrbajaj.services.helper.PlayerHelper;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GameService {

    // return the first user who won the game ends as soon as any one player is won
    public Player Play(List<Player> players, Board board, Dice dice){

        System.out.println("Game Started");

        if(players == null){
            //TODO throw InsufficientPlayersException
            return null;
        }
        // plays the game and returns the winner of the game
        Queue<Player> playesInGame = new LinkedList<>(players);

        Player winner = null;

        while(winner == null){

            PlayerHelper.printCurrPositions(players);

            Player currPlayer = playesInGame.poll();

            makeMove(currPlayer, board, dice);

            if(currPlayer.getCurrPos() >= board.getWinPos()){
                winner = currPlayer;
            }else {
                playesInGame.offer(currPlayer);
            }

        }

        return winner;
    }

    private void makeMove(Player player, Board board, Dice dice){

        int points = dice.roll();

        int newPosition;
        Cell cell;
        newPosition = points + player.getCurrPos();
        cell = board.getCellAtIndex(newPosition);
        System.out.println(newPosition);

        while (cell.jumpExists() && !board.isWinPosition(newPosition)){
            newPosition = cell.getJump().getLandPos();
            cell = board.getCellAtIndex(newPosition);
        }

        player.setCurrPos(newPosition);
    }
}
