package autores.modelos;

import grupos.modelos.MiembroEnGrupo;

import java.util.ArrayList;

public class Profesor {
    private int dni;
    private String apellidos;
    private String nombres;
    private String clave;
    private Cargo cargo;

    private ArrayList<MiembroEnGrupo> miembroengrupos;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.dni;
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
        final Profesor other = (Profesor) obj;
        if (this.dni != other.dni) {
            return false;
        }
        return true;
    }

    public void mostrar(){
        System.out.println("Nombres: "+ nombres);
        System.out.println("Apellidos: "+ apellidos);
        System.out.println("DNI: "+ dni);
        System.out.println("Cargo: "+ cargo.toString());
        System.out.println("Clave: "+ clave);
    }

    public Profesor(int dni, String apellidos, String nombres, String clave, Cargo cargo) {
        this.dni = dni;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.clave = clave;
        this.cargo = cargo;
    }

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

    public String verCargo() {
        return cargo.toString();
    }

    public void asignarCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
