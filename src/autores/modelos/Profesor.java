package autores.modelos;

import grupos.modelos.MiembroEnGrupo;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Thomas Mafut & Luis Medina Raed
 */
public class Profesor extends Autor {
   // Relacion entre clases
    private Cargo unCargo;

    // Constructor
    public Profesor(int dni, String apellidos, String nombres, String clave, Cargo unCargo){
        super(dni, apellidos, nombres, clave);
        this.unCargo = unCargo;
    }
    // Metodos
    /**
        Este metodo permite mostrar profesor
    */
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("Cargo: " + this.unCargo);
    }
    // Getters & Setters
    public Cargo verCargo() {
        return unCargo;
    }
    public void asignarCargo(Cargo cargo) {
        this.unCargo = cargo;
    }
}