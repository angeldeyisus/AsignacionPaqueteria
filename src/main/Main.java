/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import Fachadas.EnvioManejador;
import java.util.Scanner;

/**
 *
 * @author Link
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EnvioManejador manejadorEnvio = new EnvioManejador();
        Scanner tec = new Scanner(System.in);
        String tipoPaquete, servicio;
        double distancia;
        
        System.out.println("Selecciona el tipo de paquete: (Sobre, Caja Pequeña, Caja Mediana, Caja Grande)");
        tipoPaquete = tec.nextLine();
        System.out.println("Selecciona el tipo de Servicio: (Estandar/Express)");
        servicio = tec.nextLine();
        System.out.println("Cual es la distancia?: ");
        distancia = tec.nextDouble();
        
        System.out.println("\n\n"+ manejadorEnvio.crearEnvio(servicio, distancia, tipoPaquete) + "\n\n");
        
        System.out.println("Gracias por utilizar Envios TDAA :D");
    }
    
    public static void test(){
        EnvioManejador manejadorEnvio = new EnvioManejador();
        
        System.out.println(manejadorEnvio.crearEnvio("Estandar", 4, "Caja Pequeña"));
        System.out.println();
        System.out.println(manejadorEnvio.crearEnvio("Express", 12, "Caja Grande"));
        System.out.println();
    }
    
}
