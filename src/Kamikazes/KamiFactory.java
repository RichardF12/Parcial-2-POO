/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kamikazes;

import Truxican.Interfacer;

/**
 *
 * @author ricky
 */
public class KamiFactory {
    public static Interfacer getKamikaze(KamiType type){
        switch(type){
            case COMMON:
                return new Onigiri();
            case SPECIAL:
                return new Sushi();
            case LEGENDARY:
                return new Ramen();
        }
        return null;
    }
}
