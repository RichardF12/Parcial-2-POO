/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Truxican;

/**
 *
 * @author ricky
 */
public class Tacos implements Interfacer {
    private int price;
    private int life;
    private final int ATKUnit = 30;
    private final int ATKEdif = 20;
    
    public Tacos(){}
    
    public Tacos(int price, int life) {
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
