package com.upchiapas.terrainscan.models;

import com.upchiapas.terrainscan.controllers.PropuestasController;

public class Datos extends PropuestasController implements Estado {
  //  private String TipoTerreno;
    private int potasio;
    private int fosforo;
    private int nitrogeno;
    private int medidaX;
    private int medidaY;

    public Datos(int potasio, int fosforo, int nitrogeno, int medidaX, int medidaY) {
      //  TipoTerreno = tipoTerreno;
        this.potasio = potasio;
        this.fosforo = fosforo;
        this.nitrogeno = nitrogeno;
        this.medidaX = medidaX;
        this.medidaY = medidaY;
    }

   /* public String getTipoTerreno() {
        return TipoTerreno;
    }

    public void setTipoTerreno(String tipoTerreno) {
        TipoTerreno = tipoTerreno;
    }*/

    public int getPotasio() {
        return potasio;
    }

    public void setPotasio(int potasio) {
        this.potasio = potasio;
    }

    public int getFosforo() {
        return fosforo;
    }

    public void setFosforo(int fosforo) {
        this.fosforo = fosforo;
    }

    public int getNitrogeno() {
        return nitrogeno;
    }

    public void setNitrogeno(int nitrogeno) {
        this.nitrogeno = nitrogeno;
    }

    public int getMedidaX() {return medidaX;}

    public void setMedidaX(int medidaX) {this.medidaX = medidaX;}

    public int getMedidaY() {return medidaY;}

    public void setMedidaY(int medidaY) {this.medidaY = medidaY;}

    @Override
    public String toString() {
        return  "\n"+
          //      "TipoTerreno: " + TipoTerreno
                "\n"+
                "Potasio: " + potasio +"\n"+
                "Fosforo: " + fosforo +"\n"+
                "Nitrogeno: " + nitrogeno + "\n"+
                "Medida del terreno: "+medidaX+"x"+medidaY +" por metros cuadrados\n\n"+"Terreno fertil: "+ estaFertil();
    }
    private boolean TerrenoFertil = false;

    private String estaFertil() {
        String salidafertil = "";
        if (TerrenoFertil())
            salidafertil = "si ";
        else
            salidafertil = "no ";
        return salidafertil;
    }
    @Override
    public void fertil() {
        this.TerrenoFertil = true;
    }

    @Override
    public void noFertil() {
        this.TerrenoFertil = false;
    }

    @Override
    public void MedioFertil() {
       this.TerrenoFertil = true;
    }

    @Override
    public boolean TerrenoFertil() {
        return this.TerrenoFertil;
    }
}
