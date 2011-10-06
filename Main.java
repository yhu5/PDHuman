/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pdgamehuman;
import java.util.ArrayList;

/**
 *
 * @author Yinyue Hu
 */
public class Main {
    
    ArrayList<Player> players;
    
    public void setupTournament() {
        players=new ArrayList<Player>();
        players.add(new RandomPlayer());
        players.add(new T4TPlayer());
        players.add(new ALLDPlayer());
        players.add(new PavlovPlayer());
        players.add(new T2TPlayer());
        players.add(new ALLCPlayer());
    }
    
    Player me=new HumanPlayer();

    public void roundRobin() {
        Judge dredd=new Judge();
        for (Player p1: players) {
            dredd.playMatch(p1, me, 10);
        }
    }
    
    public void printResults() {
        System.out.println("RESULTS>>>>>>>");
        for (Player p : players ) {
            System.out.println(p.toString());
        }
        System.out.println(me.toString());
        
    }
    
    
     public static void main(String[] args) {
        Main foo=new Main();

        foo.setupTournament();
        foo.roundRobin();
        foo.printResults();


    }







}
