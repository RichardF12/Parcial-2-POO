/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edifications.FoodCourt;

import Edifications.FoodCourt.GoatCo.GoatFactory;
import Edifications.FoodCourt.Market.PlateFactory;

/**
 *
 * @author ricky
 */
public class StoreProducer {
    public static StoreFactory getFactory(int type){
        switch(type){
            case 1: 
                return new GoatFactory();
            case 2:
                return new PlateFactory();
        }
        return null;
    }
}
