package grupos.modelos;

import autores.modelos.Autor;
import autores.modelos.Profesor;
import java.util.Objects;

/**
 *
 * @author Thomas Mafut & Luis Medina Raed
 */
public class MiembroEnGrupo {
    // Relacion entre clases
    private Autor unAutor;
    private Grupo unGrupo;
    private Rol unRol;
    // Constructor
    public MiembroEnGrupo(Autor unAutor, Rol unRol, Grupo unGrupo) {
        this.unAutor = unAutor;
        this.unGrupo = unGrupo;
        this.unRol = unRol;
    }
    // equals() & hashCode()
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.unAutor);
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
        final MiembroEnGrupo other = (MiembroEnGrupo) obj;
        if (!Objects.equals(this.unAutor, other.unAutor)) {
            return false;
        }
        return true;
    }
    // Getters & Setters
    public Autor verAutor() {
        return unAutor;
    }

    public void asignarAutor(Autor unAutor) {
        this.unAutor = unAutor;
    }

    public Rol verRol() {
        return unRol;
    }

    public void asignarRol(Rol unRol) {
        this.unRol = unRol;
    }

    public Grupo verGrupo() {
        return unGrupo;
    }

    public void asignarGrupo(Grupo unGrupo) {
        this.unGrupo = unGrupo;
    }
}
