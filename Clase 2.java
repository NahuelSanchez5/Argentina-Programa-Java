package com.mycompany.arg.programa.ejercicios;

public class Clase1 {

    public static void main(String args[]) {
       
        //A) Muestra los números del 5 al 14 \\
        int numeroInicio = 5;
        int numeroFin = 14;
        int numeroEnPantalla = numeroInicio;
        while (numeroEnPantalla <= numeroFin) {            
            System.out.println(numeroEnPantalla);
            numeroEnPantalla = numeroEnPantalla + 1;
        }
    }
    
    public static void main(String args[]) {
       
        // Muestra los números de 2 en 2 \\        
        int numeroInicio = 5;
        int numeroFin = 14;
        int numeroEnPantalla = numeroInicio;
        while (numeroEnPantalla <= numeroFin) {            
            System.out.println(numeroEnPantalla);
            numeroEnPantalla = numeroEnPantalla + 2;
        }
    }
    
    public static void main(String args[]) {
       
            //B) Muestra solo los números pares\\
        int numeroInicio = 5;
        int numeroFin = 14;
        int numeroEnPantalla = numeroInicio;
        while (numeroEnPantalla <= numeroFin) { 
            if (numeroEnPantalla % 2 == 0) {
                System.out.println(numeroEnPantalla);
            }
            numeroEnPantalla = numeroEnPantalla + 1;
        }
    }
    
}
