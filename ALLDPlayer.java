/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pdgamehuman;

/**
 *
 * @author Yinyue Hu
 */
public class ALLDPlayer extends BasicPlayer{
    
    public ALLDPlayer() {
        myID="ALLD Player";
    }
    public int makeMove() {
        return GameMove.DEFECT;
    }
}
