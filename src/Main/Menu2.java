/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Scanner;
/**
 *
 * @author ricky
 */
public class Menu2 {
    public static void MenuInicio(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("-----------------------------------------");
        System.out.print("Jugador 1 Ingrese su usuario: ");
        String user1 = scan.next();
        System.out.println("");
        System.out.println("RAZAS");
        System.out.println("-----");
        System.out.println("1)Truxican");
        System.out.println("2)Eagles");
        System.out.println("3)Kamikazes");
        System.out.print("Escoja su raza: ");
        int race1 = scan.nextInt(); 
            switch(race1){
            case 1:
                //Import Truxican(?)
            case 2:
                //Import Eagles(?)
            case 3:
                //Import Kamikazes(?)
            }
        System.out.println("----------------------------------------");
        System.out.print("Jugador 2 Ingrese su usuario: ");
        String user = scan.next();
        System.out.println("");
        System.out.println("RAZAS");
        System.out.println("-----");
        System.out.println("1)Truxican");
        System.out.println("2)Eagles");
        System.out.println("3)Kamikazes");
        System.out.print("Escoja su raza: ");
        int race2 = scan.nextInt();
        switch(race2){
            case 1:
                //Import Truxican(?)
            case 2:
                //Import Eagles(?)
            case 3:
                //Import Kamikazes(?)
        }
        /*if(user1 && race1 && user2 && race2 != null){
            Menu3.GameMenu();
        }*/
    }
}
