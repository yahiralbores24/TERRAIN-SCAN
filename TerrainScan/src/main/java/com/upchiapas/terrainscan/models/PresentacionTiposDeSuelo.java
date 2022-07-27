package com.upchiapas.terrainscan.models;

import java.util.Scanner;

public class PresentacionTiposDeSuelo {
    public void rock(){
        IngresaDatos ing = new IngresaDatos();
        System.out.println("____________________________________________");
        System.out.println("                                 Rocoso");
        System.out.println("--------------------------------------------------------------------------");
        ing.ingresor();
    }

    public void arena(){
        Scanner teclado = new Scanner(System.in);
        IngresaDatos ing = new IngresaDatos();
        System.out.println("____________________________________________");
        System.out.println("                                  Arenoso");
        System.out.println("--------------------------------------------------------------------------");
        ing.ingresor();
    }

    public void limo(){
        Scanner teclado = new Scanner(System.in);
        IngresaDatos ing = new IngresaDatos();
        System.out.println("____________________________________________");
        System.out.println("                                  Limo");
        System.out.println("--------------------------------------------------------------------------");
        ing.ingresor();
    }

    public void Negra(){
        Scanner teclado = new Scanner(System.in);
        IngresaDatos ing = new IngresaDatos();
        System.out.println("____________________________________________");
        System.out.println("                                  Tierra Negra");
        System.out.println("--------------------------------------------------------------------------");
        ing.ingresor();
    }

    public void Arcilla(){
        Scanner teclado = new Scanner(System.in);
        IngresaDatos ing = new IngresaDatos();
        System.out.println("____________________________________________");
        System.out.println("                                  Arcilla");
        System.out.println("--------------------------------------------------------------------------");
        ing.ingresor();
    }

    public void Humifero(){
        Scanner teclado = new Scanner(System.in);
        IngresaDatos ing = new IngresaDatos();
        System.out.println("____________________________________________");
        System.out.println("                                  Humifero");
        System.out.println("--------------------------------------------------------------------------");
        ing.ingresor();
    }
}
