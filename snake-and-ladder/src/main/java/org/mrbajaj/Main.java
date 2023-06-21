package org.mrbajaj;

import org.mrbajaj.bo.Board;
import org.mrbajaj.bo.Dice;
import org.mrbajaj.bo.Player;
import org.mrbajaj.services.GameService;
import org.mrbajaj.services.helper.BoardHelper;
import org.mrbajaj.services.helper.PlayerHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Let's play Snake and Ladder");

        Board board = new Board(50, 5, 5);
        List<Player> players = PlayerHelper.createPlayerList( new ArrayList<String>() {{add("P1"); add("P2"); add("P3");}} );
        Dice dice = new Dice(1, 6);

        BoardHelper.printBoard(board);

        GameService game = new GameService();

        Player winner = game.Play(players, board, dice);

        System.out.println(winner +" has won the game");


        System.out.println("Bye Bye ");
    }
}