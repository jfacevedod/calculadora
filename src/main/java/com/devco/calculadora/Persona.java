package com.devco.calculadora;

import java.util.List;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private List<Persona> familia;

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String name){
        this.nombre = name;
    }
}
