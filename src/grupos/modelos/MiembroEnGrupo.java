package grupos.modelos;

import autores.modelos.Profesor;

import java.time.LocalDate;

public class MiembroEnGrupo {
    private Profesor profesor;
    private Grupo grupo;
    private Rol rol;


    public MiembroEnGrupo(Profesor profesor, Rol rol, Grupo grupo) {
        this.profesor = profesor;
        this.grupo = grupo;
        this.rol = rol;

    }

    public Profesor verProfesor() {
        return profesor;
    }

    public void asignarProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Rol verRol() {
        return rol;
    }

    public void asignarRol(Rol rol) {
        this.rol = rol;
    }

    public Grupo verGrupo() {
        return grupo;
    }

    public void asignarGrupo(Grupo grupo) {
        this.grupo = grupo;
    }
}
