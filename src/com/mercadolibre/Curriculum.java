package com.mercadolibre;

import java.util.stream.Collectors;

public class Curriculum implements Imprimible{

    /* 	Curriculums: incluye a una persona con todos sus atributos más una lista de sus habilidades.
     */

    Persona persona;

    public Curriculum(Persona persona) {
        this.persona = persona;
    }



    @Override
    public String imprimir() {
        String habilidades = this.persona.getHabilidades().stream()
                .map(h -> "- " + h)
                .collect(Collectors.joining("\n"));
        String imprimible = this.persona.getNombre() + ", edad: " + this.persona.getEdad() +
                ". Estudió en: " + this.persona.getEducacion() + ". Vive en: " + this.persona.getLocalidad() +
                ". Contacto: " + this.persona.getTelefono() + "Mis habilidades son: " + habilidades;
        return imprimible;
    }
}
