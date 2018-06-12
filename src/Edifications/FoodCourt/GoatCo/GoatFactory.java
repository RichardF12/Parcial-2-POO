/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edifications.FoodCourt.GoatCo;

import Edifications.FoodCourt.Market.Market;
import Edifications.FoodCourt.StoreFactory;

/**
 *
 * @author ricky
 */
public class GoatFactory implements StoreFactory{

    @Override
    public GoatCo getGoatCo(int type) {
        if(type == 1){
            System.out.println("Tu Tupperware esta en camino.");
            return new Tupperware();
        }else{
            System.out.println("Opcion no valida.");
        }
        return null;
    }

    @Override
    public Market getMarket(int type) {
        return null;
    }
    
}
