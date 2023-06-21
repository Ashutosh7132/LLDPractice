package org.mrbajaj.services.helper;

import org.mrbajaj.bo.Player;

import java.util.ArrayList;
import java.util.List;

public class PlayerHelper {

    public static List<Player> createPlayerList(List<String> names){
        List<Player> players = new ArrayList<>();
        for(String name: names){
            Player player = new Player(name);
            player.setCurrPos(0);

            players.add(player);
        }
        return players;
    }

    public static void printCurrPositions(List<Player> players){
        System.out.println("Positions");
        for(Player p : players){
            System.out.print("\t" +p.getName() + " : " + p.getCurrPos());
        }
        System.out.println();
    }
}
