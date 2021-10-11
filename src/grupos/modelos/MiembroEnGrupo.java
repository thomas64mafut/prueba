package grupos.modelos;

import autores.modelos.Profesor;

import java.time.LocalDate;

public class MiembroEnGrupo {
    private Profesor profesor;
    private Rol rol;
    private Grupo grupo;

    public MiembroEnGrupo(Profesor profesor, Rol rol, Grupo grupo) {
        this.profesor = profesor;
        this.rol = rol;
        this.grupo = grupo;
    }
}
