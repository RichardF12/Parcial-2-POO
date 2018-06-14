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
public class Church implements Resources{
    private int phase = Phases.getPhase();
    private int SecretIngredient = 0;

    public Church(int SecretIngredient) {
        this.SecretIngredient = SecretIngredient;
    }

    public int getPhase() {
        return phase;
    }

    public void setPhase(int phase) {
        this.phase = phase;
    }

    public int getSecretIngredient() {
        return SecretIngredient;
    }

    public void setSecretIngredient(int SecretIngredient) {
        this.SecretIngredient = SecretIngredient;
    }
    
    @Override
    public void addSecretIngredient() {
        while(SecretIngredient != 5000){
            SecretIngredient += 500;
            
        }
              
    }

    @Override
    public void addLove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void addFoodThingys() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
