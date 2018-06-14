/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edifications.FoodCourt;

import Truxican.Interfacer;

/**
 *
 * @author ricky
 */
public interface StoreFactory {
    Interfacer getGoatCo(int type);
    Interfacer getMarket(int type);
}
