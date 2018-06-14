/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kamikazes;

import Truxican.Interfacer;

/**
 *
 * @author ricky
 */
public class Sushi implements Interfacer{
    private int price;
    private int life;
    private final int ATKUnit = 30;
    private final int ATKEdif = 25; 
    
    public Sushi(){}
    
    public Sushi(int price, int life) {
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
