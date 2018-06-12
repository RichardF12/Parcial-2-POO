/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edifications.FoodCourt.Market;

import Edifications.FoodCourt.GoatCo.GoatCo;
import Edifications.FoodCourt.StoreFactory;

/**
 *
 * @author ricky
 */
public class PlateFactory implements StoreFactory{

    @Override
    public GoatCo getGoatCo(int type) {
        return null;
    }

    @Override
    public Market getMarket(int type) {
        if(type == 1){
            System.out.println("Tu plato esta en camino.");
            return new PlainPlate();
        }else{
            System.out.println("Opcion no valida.");
        }
        return null;
    }
    
}
