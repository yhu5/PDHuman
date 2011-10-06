/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pdgamehuman;

/**
 *
 * @author Yinyue Hu
 */
public class ALLCPlayer extends BasicPlayer{
    
    public ALLCPlayer() {
        myID="ALLC Player";
    }
    public int makeMove() {
        return GameMove.COOPERATE;
    }
}
