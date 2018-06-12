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
    public void Attack() {//Modificar para que funcione de forma practica no solo teorica.
        if(Target == Edif[]){
            System.out.println("Destrucciooooooon wiiiiiii!!!");
            while(Target.life != 0){
                Target.life == Target.life - ATKEdif;
            }
            System.out.println("Yeiiiiiiii!!!");
            Target.delete();
        }
            
    }

    @Override
    public void Defend() {
        if(Target == Units[]){//Hay que arreglar un poco para que funcione.
        System.out.println("No toques mi queso wey!!!");
            while(Target.life != 0){
                Target.life == Target.life - ATKUnit;
            }
            System.out.println("Se cayooo weeeey!!!");
            Target.delete();
    }
    
    /*
    @Override
    public void Abscond() {
    
    }
    */
    
}
