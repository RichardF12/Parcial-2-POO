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
public class Menu1{
    public static void Menu(){
        Scanner scan = new Scanner(System.in);
        System.out.println("============== Bienvenido a RicardoPerez's World ===============");
        System.out.println("");
        System.out.println("1)Iniciar Juego");
        System.out.println("2)Salir");
        System.out.print("Elija una opcion: ");
        switch(scan.nextInt()){
            case 1:
                try{
                    Menu2.MenuInicio();
                }catch (Exception e){
                        System.out.println("Menu fallido");
                }    
            case 2:
                System.out.println("Gracias por jugar");
                System.exit(0);
        }
        
    }
}
