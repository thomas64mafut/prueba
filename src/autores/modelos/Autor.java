package autores.modelos;

import grupos.modelos.Grupo;
import grupos.modelos.MiembroEnGrupo;
import grupos.modelos.Rol;

import javax.sound.midi.SysexMessage;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Thomas Mafut & Luis Medina Raed
 */
public abstract class Autor {
    // Variables de instancia 
    private int dni;
    private String apellidos;
    private String nombres;
    private String clave;
    // Relacion entre clases
    private ArrayList <MiembroEnGrupo> miembros = new ArrayList<>();
    // Constructor
    public Autor(int dni, String apellidos, String nombres, String clave) {
        this.dni = dni;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.clave = clave;
    }
    // Metodos
    /**
        Este metodo permite mostrar Autor
    */
    public void mostrar(){
        System.out.println("------------------------------");
        System.out.println("Nombre y apellido: " + this.nombres +", " + this.apellidos + ".");
        System.out.println("DNI: "+ dni);
        System.out.println("Clave: "+ clave);
        System.out.println("Pertenece a los siguientes grupos: ");
        if(this.tieneGrupos()){
            for(MiembroEnGrupo unGrupo : this.miembros){
                System.out.println(unGrupo.verGrupo().verNombre() + "\nSu Rol es: " + unGrupo.verRol().toString() + ".");
            }
        } else {
            System.out.println("Este autor no pertenece a ningun grupo.");
        }
    }

    public ArrayList <MiembroEnGrupo> verGrupos(){
        return miembros;
    }

    public void asignarGrupos(ArrayList<MiembroEnGrupo> grupos) {
        this.miembros = grupos;
    }
    
    /**
        Este metodo nos permite agregar autores a grupos
    */
//    public void agregarGrupo (Grupo grupo, Rol rol){
//        MiembroEnGrupo unGrupo = new MiembroEnGrupo(this, grupo, rol);
//        if(!this.tieneGrupos() == false){
//            miembros.add(unGrupo);
//        }
//        if (grupo.esSuperAdministradores()){
//            if(!this.miembros.contains(unGrupo)){
//                unGrupo.asignarRol(Rol.ADMINISTRADOR);
//                this.miembros.add(unGrupo);
//                grupo.agregarMiembro(this, Rol.ADMINISTRADOR);
//            }
//        } else if(!this.miembros.contains(unGrupo)){
//            this.miembros.add(unGrupo);
//            grupo.agregarMiembro(this, rol);
//        }
//    }
        public void agregarGrupo(Grupo grupo, Rol rol){
            MiembroEnGrupo unGrupo = new MiembroEnGrupo(this, grupo, rol);

            if(!this.miembros.contains(unGrupo)){
                this.miembros.add(unGrupo);
                grupo.agregarMiembro(this, rol);
            }
        }

    
    /**
        Este metodo nos permite quitar autores de grupos
    */
    public void quitarGrupo(Grupo grupo){
        for (MiembroEnGrupo unGrupo : miembros){
            if (unGrupo.verGrupo().equals(grupo)){
                miembros.remove(unGrupo);
                grupo.quitarMiembro(this);
            }
        }
    }
    /**
        Este metodo nos permite saber si un autor es superadministrador
    */
    public boolean esSuperAdministrador(){
        for (MiembroEnGrupo unGrupo : miembros){
            if (unGrupo.verGrupo().esSuperAdministradores()){
                return true;
            }
        }
            return false;
    }

    /**
        Este metodo nos permite saber si un autor tiene grupos
    */
    public boolean tieneGrupos(){
        if (this.miembros == null)
            return false;
        else if (this.miembros.isEmpty())
            return false;
        else
            return true;
    }

    // equals() & hashCode()
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + this.dni;
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
        if (getClass().getSuperclass() != obj.getClass().getSuperclass()) {
            return false;
        }
        final Autor other = (Autor) obj;
        if (this.dni != other.dni) {
            return false;
        }
        return true;
    }
    // Getters & Setters
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
}
