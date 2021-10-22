package tipos.modelos;

import java.util.Objects;

/**
 *
 * @author Thomas Mafut & Luis Medina Raed
 */
public class Tipo {
    // Variables de instancia
    private String nombre;
    // Constructor
    public Tipo(String nombre) {
        this.nombre = nombre;
    }
    // Metodos
    @Override
    public String toString() {
        return nombre;
    }
    public void mostrarTipo(){
        System.out.println(this.nombre);
    }
    // equals() & hashCode()
    @Override
    public int hashCode() {
        int hash = 3;
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
        final Tipo other = (Tipo) obj;
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
}
