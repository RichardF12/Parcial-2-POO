/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edifications.FoodCourt;

import Phases.Phases;

/**
 *
 * @author ricky
 */
public class Imagination implements Resources{
    private int phase = Phases.getPhase();
    private int Love = 0;

    public Imagination(int Love) {
        this.Love = Love;
    }

    public int getPhase() {
        return phase;
    }

    public void setPhase(int phase) {
        this.phase = phase;
    }

    public int getLove() {
        return Love;
    }

    public void setLove(int Love) {
        this.Love = Love;
    }
    
    @Override
    public void addLove() {
        while(Love != 3000){
            Love += 300;
            
        }
    }

    @Override
    public void addFoodThingys() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addSecretIngredient() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
