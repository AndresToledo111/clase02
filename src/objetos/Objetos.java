/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import Entidades.Persona;

/**
 *
 * @author patri
 */
public class Objetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Persona p1 = new Persona();

        p1.setApellido("ToledokkkkToledokkkkToledokkkkToledokkkkToledokk ");
        p1.setNombre("Danilo ffff");
        p1.setEdad(0);

        System.out.println("    hola");
        System.out.println(p1.Saludo2() + " que tenga un buen dia \n el proximo año cumple: " + p1.pEdad() + " \n el año pasado usted tenia: " + p1.anioPasado());

    }

}
