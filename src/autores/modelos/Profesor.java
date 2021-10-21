package autores.modelos;

import grupos.modelos.MiembroEnGrupo;

import java.util.ArrayList;
import java.util.Objects;

public class Profesor extends Autor {
    private Cargo cargo;

    public void mostrar() {
        System.out.println("[" + super.verDni() + "] " + super.verApellidos() + ", " + super.verNombres());
        System.out.println("Cargo: " + cargo.toString());
    }

    public Profesor(int dni, String apellidos, String nombres, String clave, Cargo cargo) {
        super(dni, apellidos, nombres, clave);
        this.cargo = cargo;
    }

    public Cargo verCargo() {
        return cargo;
    }

    public void asignarCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
