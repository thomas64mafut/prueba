package autores.modelos;

import java.util.Objects;

/**
 *
 * @author Thomas Mafut & Luis Medina Raed
 */
public class Alumno extends Autor {
    // Variables de instancia  
    private String cx;
    // Constructor
    public Alumno(int dni, String apellidos, String nombres, String clave, String cx) {
        super(dni, apellidos, nombres, clave);
        this.cx = cx;
    }
    // Metodos
    @Override
    public void mostrar() {
        System.out.println("[" + super.verDni() + "] " + super.verApellidos() + ", " + super.verNombres());
        System.out.println("CX: " + cx);
    }
    // equals() & hashCode()
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.cx);
        return hash;
    }
    @Override
    public boolean equals(Object obj) {
        if(!super.equals(obj)){
            if(getClass() != obj.getClass()){
                return false;
            }
            Alumno other = (Alumno) obj;
            if(!Objects.equals(this.cx, other.cx)){
                return false;
            }
            return true;
        }
        return true;
    }
    // Getters & Setters
    public String verCx() {
        return cx;
    }
    public void asignarCx(String cx) {
        this.cx = cx;
    }
}
