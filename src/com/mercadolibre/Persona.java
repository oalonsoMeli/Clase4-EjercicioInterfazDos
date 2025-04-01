package com.mercadolibre;

import java.util.List;

public class Persona {
    private String nombre;
    private int edad;
    private String educacion;
    private String localidad;
    private long telefono;
    private List<String> habilidades;

    public Persona(String nombre, int edad, String educacion, String localidad, long telefono, List<String> habilidades) {
        this.nombre = nombre;
        this.edad = edad;
        this.educacion = educacion;
        this.localidad = localidad;
        this.telefono = telefono;
        this.habilidades = habilidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEducacion() {
        return educacion;
    }

    public void setEducacion(String educacion) {
        this.educacion = educacion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public List<String> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<String> habilidades) {
        this.habilidades = habilidades;
    }

    public void agregarHabilidad(String habilidad){
        this.habilidades.add(habilidad);
    }
}
