/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edifications.FoodCourt;

import Edifications.FoodCourt.GoatCo.GoatCo;
import Edifications.FoodCourt.Market.Market;

/**
 *
 * @author ricky
 */
public interface StoreFactory {
    GoatCo getGoatCo(int type);
    Market getMarket(int type);
}
