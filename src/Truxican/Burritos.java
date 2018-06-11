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
public class Burritos implements Truxican{
    private int price;
    private int life;
    private final int ATKUnit = 50;
    private final int ATKEdif = 40;
    
    public Burritos(){}
    
    public Burritos(int price, int life) {
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
