/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edifications.FoodCourt;

import Phases.Phases;
//import Edifications.FoodCourt.FoodThingys;
/**
 *
 * @author ricky
 */
public class Walmart implements Resources{    
    private int phase = Phases.getPhase();
    //private FoodThingys Food;
    private int FoodThingys = 0;

    public int getPhase() {
        return phase;
    }

    public void setPhase(int phase) {
        this.phase = phase;
    }

    public int getFoodThingys() {
        return FoodThingys;
    }

    public void setFoodThingys(int FoodThingys) {
        this.FoodThingys = FoodThingys;
    }
    
    @Override
    public void addFoodThingys() {
        while(FoodThingys != 10000){
            FoodThingys += 1000;
            
        }
      
    }

    @Override
    public void addSecretIngredient() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addLove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
            
            

            
    
}
