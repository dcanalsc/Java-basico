package com.exercice;

abstract public class SmartDevice {
    //1. atributos

    double almacenamiento;  //en GB
    int numNucleos;
    double velocidad;          //en GHz
    int memoriaRam;         //en GB
    String fabricante;
    int bateria;            //en mAh
    double screenSize;      //en pulgadas
    boolean nfc;
    String color;


    //2.contrusctores

    public SmartDevice(){}
    public SmartDevice(double almacenamiento, int numNucleos, double velocidad, int memoriaRam, String fabricante, int bateria, double screenSize, boolean nfc, String color) {
        this.almacenamiento = almacenamiento;
        this.numNucleos = numNucleos;
        this.velocidad = velocidad;
        this.memoriaRam = memoriaRam;
        this.fabricante = fabricante;
        this.bateria = bateria;
        this.screenSize = screenSize;
        this.nfc = nfc;
        this.color = color;
    }


    //3.metodos

}
