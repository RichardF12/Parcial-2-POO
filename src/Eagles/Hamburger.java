/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eagles;

/**
 *
 * @author ricky
 */
public class Hamburger implements Eagle{
    private int price;
    private int life;
    private final int ATKUnit = 60;
    private final int ATKEdif = 40; 

    public Hamburger() {}

    public Hamburger(int price, int life) {
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
