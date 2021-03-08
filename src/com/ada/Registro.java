package com.ada;

import java.util.List;

public class Registro {
    private Propietario propietario;
    private Automotor automotor;
    List<Autorizado> autorizados;
    private String patente;
    private int seccional;

    private MotoElectrica me;
    private AutoElectrico ae;
    private Motocicleta motocicleta;
    private AutomovilACombustion automovilcombustion;
    private Colectivo colectivo;
    private Utilitario utilitario;
    private Camion camion;



    public Registro(Propietario propietario, Automotor automotor, List<Autorizado> autorizados, String patente, int seccional) {
        this.propietario = propietario;
        this.automotor = automotor;
        this.autorizados = autorizados;
        this.patente = patente;
        this.seccional = seccional;
    }

    public Registro(Camion camion) {
        this.camion = camion;
    }

    public Registro(Colectivo colectivo) {
        this.colectivo = colectivo;
    }
}

