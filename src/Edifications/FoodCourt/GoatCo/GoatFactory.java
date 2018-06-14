/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edifications.FoodCourt.GoatCo;

import Edifications.FoodCourt.StoreFactory;
import Truxican.Interfacer;

/**
 *
 * @author ricky
 */
public class GoatFactory implements StoreFactory{
    private int life = 1000;
    private int cost;

    @Override
    public Interfacer getGoatCo(int type) {
        if(type == 1){
            System.out.println("Tu Tupperware esta en camino.");
            return (Interfacer) new Tupperware();
        }else{
            System.out.println("Opcion no valida.");
        }
        return null;
    }

    @Override
    public Interfacer getMarket(int type) {
        return null;
    }
    
}
