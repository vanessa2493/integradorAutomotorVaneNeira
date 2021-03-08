package com.ada;

public abstract class Persona {
    private String nombre;
    private String dni;
    private String direccion;

    public Persona(String nombre, String dni, String direccion) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
    }
}
