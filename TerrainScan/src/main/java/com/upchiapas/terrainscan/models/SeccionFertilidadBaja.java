package com.upchiapas.terrainscan.models;

import java.util.Scanner;

public class SeccionFertilidadBaja {
    public void arena(){
        Scanner teclado = new Scanner(System.in);
        IngresaDatos ing = new IngresaDatos();
        System.out.println("____________________________________________");
        System.out.println("Seleccione una opcion: ");
        System.out.println("1. Natural                  2. Quimico");
        System.out.println("--------------------------------------------------------------------------");
        ing.ingresor();
    }
}
