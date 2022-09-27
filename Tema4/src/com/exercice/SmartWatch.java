package com.exercice;

public class SmartWatch extends SmartDevice {

    //1. atributos

    boolean medirOxigenoSangre;
    boolean medirSueno;
    boolean medirPulso;
    int numeroEjercicios;
    String sistemaOperativo;
    String autonomia;

    //2.contrusctores

    public SmartWatch() {
        super();
    }

    public SmartWatch(double almacenamiento, int numNucleos, double velocidad, int memoriaRam, String fabricante, int bateria, double screenSize, boolean nfc, String color, boolean medirOxigenoSangre, boolean medirSueno, boolean medirPulso, int numeroEjercicios, String sistemaOperativo, String autonomia) {
        super(almacenamiento, numNucleos, velocidad, memoriaRam, fabricante, bateria, screenSize, nfc, color);
        this.medirOxigenoSangre = medirOxigenoSangre;
        this.medirSueno = medirSueno;
        this.medirPulso = medirPulso;
        this.numeroEjercicios = numeroEjercicios;
        this.sistemaOperativo = sistemaOperativo;
        this.autonomia = autonomia;
    }

    @Override
    public String toString() {
        return "SmartWatch:\n" +
                "Sensores: {Oxigeno en sangre=" + medirOxigenoSangre +
                ", Medir sueño=" + medirSueno +
                ", Medir pulso=" + medirPulso +
                "}, Ejercicios=" + numeroEjercicios +
                ", Sistema Operativo='" + sistemaOperativo + '\'' +
                ", Autonomia='" + autonomia + '\'' +
                "\nROM(GB)=" + almacenamiento +
                ", Nucleos(cores)=" + numNucleos +
                ", velocidad=" + velocidad +
                ", RAM(GB)=" + memoriaRam +
                ", fabricante='" + fabricante + '\'' +
                ", Capacidad bateria(mAh)=" + bateria +
                ", Pantalla=" + screenSize +
                ", NFC=" + nfc +
                ", color='" + color + '\'';
    }
//3.metodos

}