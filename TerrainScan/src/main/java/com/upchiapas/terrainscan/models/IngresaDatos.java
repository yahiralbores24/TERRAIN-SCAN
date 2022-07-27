package com.upchiapas.terrainscan.models;

import java.util.Scanner;

public class IngresaDatos {
    public void ingresor() {
        Scanner teclado = new Scanner(System.in);
        Natural hook = new Natural();
        Quimico qm = new Quimico();
        FertilidadMediaNatural media = new FertilidadMediaNatural();
        SeccionFertilidadBaja baja = new SeccionFertilidadBaja();

        int proteinas;

        System.out.println("ingrese nivel de proteinas: ");
        proteinas = teclado.nextInt();

        System.out.print("Ingrese nivel de nutrientes--(10 a 100): ");
        int nutrientes = teclado.nextInt();
        System.out.println("nivel de proteinas: "+proteinas+"\n");

        int pci = 0;

        if (proteinas >= 70)
            do{

                {
                    System.out.println("_______________________________________");

                    System.out.println(":::::::::::::Recomendaciones y propuestas::::::::::::");
                    System.out.println("Para incrementar la fertilidad de su terreno, le recomendamos seguirlo tratando.");
                    System.out.println("acontinuacion seleccione el tipo de abono que desee emplear: ");
                    System.out.println("1. Natural                  2. Quimico " );

                    int opc = teclado.nextInt();
                    switch (opc){
                        case 1:
                            System.out.println("1. Arenoso                  2. Rocoso                  3. Limo" );
                            System.out.println("4. Tierra negra         5. Humifero");
                            int opcion = teclado.nextInt();
                            switch (opcion){
                                case 1: qm.Arenoso(); break;
                                case 2: qm.rocoso(); break;
                                case 3: qm.Limo(); break;
                                case 4: qm.Negra(); break;
                                case 5: qm.Humifero(); break;
                            }
                            break;
                        case 2:
                            System.out.println("1. Arenoso                  2. Rocoso                  3. Limo" );
                            System.out.println("4. Tierra negra         5. Humifero");
                            int opcion1 = teclado.nextInt();
                            switch (opcion1){
                                case 1: hook.arenoso(); break;
                                case 2: hook.rocoso(); break;
                                case 3: hook.limo(); break;
                                case 4: hook.Negra(); break;
                                case 5: hook.Humifero(); break;
                            }
                            break;
                    }
                }
            } while (pci ==0);

        if (proteinas >= 40 && proteinas <= 69 )
        {
            do{
                System.out.println("_______________________________________");

                System.out.println(":::::::::::::Recomendaciones y propuestas::::::::::::");
                System.out.println("Para incrementar la fertilidad de su terreno, le recomendamos seguirlo tratando.");
                System.out.println("acontinuacion seleccione el tipo de abono que desee emplear: ");
                System.out.println("1. Natural                  2. Quimico ");

                int opc = teclado.nextInt();
                switch (opc) {
                    case 1:
                        System.out.println("1. Arenoso                  2. Rocoso                  3. Limo");
                        System.out.println("4. Tierra negra         5. Humifero");
                        int opcion = teclado.nextInt();
                        switch (opcion) {
                            case 1:
                                qm.Arenoso();
                                break;
                            case 2:
                                qm.rocoso();
                                break;
                            case 3:
                                qm.Limo();
                                break;
                            case 4:
                                qm.Negra();
                                break;
                            case 5:
                                qm.Humifero();
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("1. Arenoso                  2. Rocoso                  3. Limo");
                        System.out.println("4. Tierra negra         5. Humifero");
                        int opcion1 = teclado.nextInt();
                        switch (opcion1) {
                            case 1:
                                media.arenoso();
                                break;
                            case 2:
                                media.rocoso();
                                break;
                            case 3:
                                media.limo();
                                break;
                            case 4:
                                media.Negra();
                                break;
                            case 5:
                                media.Humifero();
                                break;
                        }
                        break;
                }
            }while (pci ==0);
        }

        if(proteinas <=39){
            System.out.println("    SU TERRENO ESTA EN LA SECCION DE NO FERTIL!!!!");
            System.out.println(" ");
            System.out.println("si requiere aumentar su fertlidad, seleccione una opcion: ");
            System.out.println("1. Ver propuestas               2. Volver a escanear");
            int op = teclado.nextInt();
            if(op==1){
                System.out.println("seleccione su tipo de suelo: ");
                System.out.println("1. Arenoso                  2. Rocoso                  3. Limo");
                System.out.println("4. Tierra negra         5. Humifero");
                int opcion = teclado.nextInt();
                switch (opcion){
                    case 1: baja.arena(); break;
                    case 2: break;
                    case 3: break;
                    case 4: break;
                    case 5: break;
                }
            }
        }
    }
}
