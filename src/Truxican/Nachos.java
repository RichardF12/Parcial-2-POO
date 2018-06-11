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
public class Nachos implements Truxican {
    private int price;
    private int life;
    private final int ATKUnit = 20;
    private final int ATKEdif = 10; 

    public Nachos(){}
    
    public Nachos(int price, int life) {
        this.price = price;
        this.life = life;
    }
        
    @Override
    public void Attack() {//Hay que cambiarla porque solo se pueden atacar edificaciones, no unidades.

        if(Target == Units[]){//Hay que crear un array que contenga todas las unidades de todas las razas y otro igual para edificaciones.
            System.out.println("Tck, Tck, Tck");
            while(Target.life != 0){
                Target.life == Target.life - ATKUnit;
            }
            System.out.println("Ba Dum Tzz");
            Target.delete();
        }else{//cuando estan atacando una edificacion
            System.out.println("Destrucciooooooon weeeeeeeee!!!");
            while(Target.life != 0){
                Target.life == Target.life - ATKEdif;
            }
            System.out.println("Yeiiiiiiii!!!");
            Target.delete();
        }
            
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
