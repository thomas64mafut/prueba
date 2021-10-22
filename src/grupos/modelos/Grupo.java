package grupos.modelos;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Thomas Mafut & Luis Medina Raed
 */
public class Grupo {
    // Variables de instancia
    private String nombre;
    private String descripcion;
    // Relacion entre clases
    private ArrayList<MiembroEnGrupo> unMiembroEnGrupos;
    // Constructor
    public Grupo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    // Metodos
    public void mostrar(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Descripcion: "+ descripcion);
    }
    // equals() & hashCode()
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nombre);
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
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Grupo other = (Grupo) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
    // Getters & Setters
    public String verNombre() {
        return nombre;
    }
    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }
    public String verDescripcion() {
        return descripcion;
    }
    public void asignarDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}