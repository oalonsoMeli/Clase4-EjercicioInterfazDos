package com.mercadolibre;

public class Curriculum implements Imprimible{

    /* 	Curriculums: incluye a una persona con todos sus atributos más una lista de sus habilidades.
     */

    Persona persona;

    public Curriculum(Persona persona) {
        this.persona = persona;
    }



    @Override
    public String imprimir() {
        String habilidades = "";
        for(String habilidad : this.persona.getHabilidades()){
             habilidades = habilidad + "\n";
        }
        String imprimible = this.persona.getNombre() + ", edad: " + this.persona.getEdad() +
                ". Estudió en: " + this.persona.getEducacion() + ". Vive en: " + this.persona.getLocalidad() +
                ". Contacto: " + this.persona.getTelefono() + "Mis habilidades son: " + habilidades;
        return imprimible;
    }
}
