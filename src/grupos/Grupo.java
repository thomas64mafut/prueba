/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupos;

import java.util.ArrayList;

/**
 *
 * @author Luis Medina Raed
 */
      
public class Grupo {
    
    String nombre;
    String descripcion;
    
    ArrayList<Grupo> grupos = new ArrayList<>();
    
    void mostrar(){
    System.out.print("El nombre del grupo es: " + nombre + ". La descripcion del grupo es: " + descripcion + "\n");
    }
    
}




