/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eagles;

import Truxican.Interfacer;

/**
 *
 * @author ricky
 */
public class FrenchFries implements Interfacer{
    private int price;
    private int life;
    private final int ATKUnit = 25;
    private final int ATKEdif = 15; 
    
    public FrenchFries(){}
    
    public FrenchFries(int price, int life) {
        this.price = price;
        this.life = life;
    }

    @Override
    public void Attack() {
       
    }

    @Override
    public void Defend() {
        
    }
    
    /*
    @Override
    public void Abscond() {
    
    }
    */
    
}
