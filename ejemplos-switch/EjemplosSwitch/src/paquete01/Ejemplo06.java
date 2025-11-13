/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes

 */
public class Ejemplo06 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese su placa");
        String placa = entrada.nextLine();
        placa = placa.toUpperCase();
        String inicial = placa.substring(0, 1);


        switch(inicial){
            case "P":
                System.out.printf("acceso correcto la placa pertenece a "
                        + "Pichincha\n");
                break;
            case "G":
                System.out.printf("acceso correcto la placa pertenece a "
                        + "Guayas\n");
                break;
            default:
                System.out.println("acceso incorrecto");
                break;
                    
                
        }
        
        }
}
