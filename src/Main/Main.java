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
public class Main {
    public void Menu(){
        Scanner scan = new Scanner(System.in);
        System.out.println("============== Bienvenido a RicardoPerez's World ===============");
        System.out.println("");
        System.out.println("1)Iniciar Juego");
        System.out.println("2)Salir");
        System.out.print("Elija una opcion: ");
        switch(scan.nextInt()){
            case 1:
                Menu2.MenuInicio();
            case 2:
                System.exit(0);
        }
        
    }
}
