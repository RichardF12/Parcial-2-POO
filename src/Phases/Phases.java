/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phases;

/**
 *
 * @author ricky
 */
public class Phases {
    private static int phase = 0;
    
    private Phases(){}

    public static int getPhase() {
        return phase;
    }

    public static void setPhase(int phase) {
        Phases.phase = phase;
    }
      
}
