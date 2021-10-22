package autores.modelos;

import grupos.modelos.MiembroEnGrupo;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Thomas Mafut & Luis Medina Raed
 */
public abstract class Autor {
    // Variables de instancia 
    private int dni;
    private String apellidos;
    private String nombres;
    private String clave;
    // Relacion entre clases
    private ArrayList <MiembroEnGrupo> unMiembroEnGrupos;
    // Constructor
    public Autor(int dni, String apellidos, String nombres, String clave) {
        this.dni = dni;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.clave = clave;
    }
    // Metodos
    public void mostrar(){
        System.out.println("[" + dni + "] " + apellidos + ", " + nombres);
    }
    // equals() & hashCode()
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + this.dni;
        return hash;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass().getSuperclass() != obj.getClass().getSuperclass()) {
            return false;
        }
        final Autor other = (Autor) obj;
        if (this.dni != other.dni) {
            return false;
        }
        return true;
    }
    // Getters & Setters
    public int verDni() {
        return dni;
    }
    public void asignarDni(int dni) {
        this.dni = dni;
    }
    public String verApellidos() {
        return apellidos;
    }
    public void asignarApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String verNombres() {
        return nombres;
    }
    public void asignarNombres(String nombres) {
        this.nombres = nombres;
    }
    public String verClave() {
        return clave;
    }
    public void asignarClave(String clave) {
        this.clave = clave;
    }
}
