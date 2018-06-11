/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kamikazes;

/**
 *
 * @author ricky
 */
public class KamiFactory {
    public static Kamikaze getKamikaze(KamiType type){
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
