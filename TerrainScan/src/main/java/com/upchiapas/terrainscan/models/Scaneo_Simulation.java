package com.upchiapas.terrainscan.models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Scaneo_Simulation {
    public void escan (){
        Scanner teclado = new Scanner(System.in);
        SeccionFertilidadBaja ar = new SeccionFertilidadBaja();
        PresentacionTiposDeSuelo rc = new PresentacionTiposDeSuelo();

        System.out.println("____________________________________________");
        System.out.println("                               Terrain Scan                                   ");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println(" ");
        System.out.println("        ::::::::Ingrese el tipo de suelo::::::::::::");
        System.out.println("(1.- Rocoso)        (2.- Arenoso)             (3. Limo)");
        System.out.println("(4.- arcilla)           (5.- Tierra negra)       (6.- Humifero)");
        System.out.println("____________________________________________");
        System.out.println("ingrese su tipo de suelo");
        int opcion = teclado.nextInt();

        switch (opcion){
            case 1: rc.rock(); break;
            case 2: rc.arena(); break;
            case 3:rc.limo(); break;
            case 4: rc.Arcilla(); break;
            case 5:rc.Negra(); break;
            case 6: rc.Humifero();break;
        }
    }
}
