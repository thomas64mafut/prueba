package idiomas.modelos;

import java.util.Objects;

/**
 *
 * @author Thomas Mafut & Luis Medina Raed
 */
public class Idioma {
    // Variables de instancia
    private String nombre;
    // Relacion entre clases
    // Constructor
    public Idioma(String nombre) {
        this.nombre = nombre;
    }
    // Metodos
    @Override
    public String toString() {
        return nombre;
    }
    public void mostrarIdioma(){
        System.out.println(this.nombre);
    }
    // equals() & hashCode()
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.nombre);
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
        final Idioma other = (Idioma) obj;
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
