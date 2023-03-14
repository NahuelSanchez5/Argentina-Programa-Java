package com.mycompany.arg.programa.ejercicios;
public class ARGPROGRAMAEjercicios {

    public static void main(String args[]) {
       
        
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

 