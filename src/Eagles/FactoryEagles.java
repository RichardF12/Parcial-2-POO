/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eagles;

import Truxican.Interfacer;

/**
 *
 * @author ricky
 */
public class FactoryEagles {
    
    public static Interfacer getEagle(EagleType type){
        switch(type){
            case COMMON:
                return new FrenchFries();
            case SPECIAL:
                return new HotDogs();
            case LEGENDARY:
                return new Hamburger();
        }
        return null;
    }
}
