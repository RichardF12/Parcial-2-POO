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
public class TruxFactory {
    public static Truxican getTruxican(TruxType type){
        switch(type){
            case COMMON:
                return new Nachos();
            case SPECIAL:
                return new Tacos();
            case LEGENDARY:
                return new Burritos();
        }
        return null;
    }
}
