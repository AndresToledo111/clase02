/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author patri
 * @version 1.1
 *
 */
public class Persona {

    private String nombre;
    private String apellido;
    private int edad;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int ed) throws Exception {
        if (edad <= 0) {
            edad = ed;
        } else {
            throw new Exception("Edad Tiene que ser mayor, igual a 0");
        }

    }

    public int pEdad() {
        return getEdad() + 1;
    }

    public int anioPasado() {
        return edad - 1;
    }

    /**
     *
     * @param String nombre
     *
     *
     */
    public void setNombre(String nom) throws Exception {
        if (nom.trim() != "") {
            nombre = nom;
        } else {
            throw new Exception("No puedes ingresar el nombre vacio");
        }
    }

    /**
     *
     * @return String del nombre
     *
     *
     */
    public String getNombre() {
        return nombre;
    }

    public void Saludo() {
        System.out.println("Hola " + getNombre());
    }

    public String Saludo2() {
        return "Señor " + getNombre() + ",";
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) throws Exception {
        if (apellido.trim() != "" && apellido.length() < 50) {

            this.apellido = apellido;
        } else {
            throw new Exception("Error apellido menor a 50 caracteres");
        }
    }

}
