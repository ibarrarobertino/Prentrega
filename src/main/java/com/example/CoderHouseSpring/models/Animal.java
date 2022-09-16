package com.example.CoderHouseSpring.models;

public class Animal {

    private final String nombre;
    private final Integer edad;
    private final boolean esPadre;

    public Animal(String nombre, Integer edad, boolean esPadre) {
        this.nombre = nombre;
        this.edad = edad;
        this.esPadre = esPadre;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public boolean isEsPadre() {
        return esPadre;
    }
}
