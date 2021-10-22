package grupos.modelos;

import autores.modelos.Autor;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Thomas Mafut & Luis Medina Raed
 */
public class Grupo {
    // Variables de instancia
    private String nombre;
    private String descripcion;
    // Relacion entre clases
    private ArrayList<MiembroEnGrupo> miembrosGrupo;
    // Constructor
    public Grupo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    // Metodos
    public void mostrar(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Descripcion: "+ descripcion);
    }

    public void verMiembros(){
        for(MiembroEnGrupo unMiembroEnGrupo : miembrosGrupo){
            System.out.println("\t" + unMiembroEnGrupo.toString());//atencion por si falta super y this
        }
    }
    public void agregarMiembro (Autor unAutor, Rol unRol){
        MiembroEnGrupo unMiembroEnGrupo = new MiembroEnGrupo(unAutor, unRol, this);
        if(!tieneMiembros() && miembrosGrupo == null){
            miembrosGrupo = new ArrayList<>();
        }
        if (this.esSuperAdministradores()){
            if(!this.miembrosGrupo.contains(unMiembroEnGrupo)){
                unMiembroEnGrupo.asignarRol(Rol.ADMINISTRADOR);
                this.miembrosGrupo.add(unMiembroEnGrupo);
                //metodo AGREGARGRUPO
            }
        } else if (!this.miembrosGrupo.contains(unMiembroEnGrupo)){
            this.miembrosGrupo.add(unMiembroEnGrupo);
            //metodo AGREGARGRUPO
        }

    }
    public void quitarMiembro(Autor miembro){
        for (MiembroEnGrupo unMiembroEnGrupo : miembrosGrupo){
            if (this.equals(unMiembroEnGrupo.verAutor())){
                miembrosGrupo.remove(miembro);
                //Agregar GRUPO
            }
        }
    }
    public boolean esSuperAdministradores(){
        if(this.nombre.equals("Super Administradores")){
            return true;
        }
        else
            return false;
    }
    public boolean tieneMiembros(){
        if (this.miembrosGrupo.isEmpty()){
            return false;
        }
        else
            return true;
    }

    // equals() & hashCode()
    @Override
    public int hashCode() {
        int hash = 7;
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
        final Grupo other = (Grupo) obj;
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
    public String verDescripcion() {
        return descripcion;
    }
    public void asignarDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}