package com.exercice;

public class SmartPhone extends SmartDevice{

    //1. atributos
    String coberturaMovil;      //4G o 5G
    String sistemaOperativo;    //Android, IOS ...
    String tipoWifi;            //Wifi 4, 5 o 6
    boolean conexionAuriculares;

    //2.contrusctores

    public SmartPhone(){
        super();
    }

    public SmartPhone(double almacenamiento, int numNucleos, double velocidad, int memoriaRam, String fabricante, int bateria, double screenSize, boolean nfc, String color, String coberturaMovil, String sistemaOperativo, String tipoWifi, boolean conexionAuriculares) {
        super(almacenamiento, numNucleos, velocidad, memoriaRam, fabricante, bateria, screenSize, nfc, color);
        this.coberturaMovil = coberturaMovil;
        this.sistemaOperativo = sistemaOperativo;
        this.tipoWifi = tipoWifi;
        this.conexionAuriculares = conexionAuriculares;

    }

    @Override
    public String toString() {
        return "SmartPhone:\n" +
                "Cobertura='" + coberturaMovil + '\'' +
                ", Sistema Operativo='" + sistemaOperativo + '\'' +
                ", Wifi='" + tipoWifi + '\'' +
                ", Jack 3.5=" + conexionAuriculares +
                ", ROM(GB)=" + almacenamiento +
                ", Nucleos(Cores)=" + numNucleos +
                ", Velocidad(GHz)=" + velocidad +
                "\nRAM(GB)=" + memoriaRam +
                ", Marca='" + fabricante + '\'' +
                ", Capacidad Bateria(mAh)=" + bateria +
                ", Pantalla=" + screenSize +
                ", NFC=" + nfc +
                ", color='" + color + '\'';
    }
//3.metodos

}
