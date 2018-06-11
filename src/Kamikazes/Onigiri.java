/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kamikazes;

/**
 *
 * @author ricky
 */
public class Onigiri implements Kamikaze{
    private int price;
    private int life;
    private final int ATKUnit = 20;
    private final int ATKEdif = 10; 
    
    public Onigiri(){}
    
    public Onigiri(int price, int life) {
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
