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
    private ArrayList<MiembroEnGrupo> miembros;
    // Constructor
    public Grupo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    // Metodos
    public void mostrar(){
        for(MiembroEnGrupo unMiembroEnGrupo : miembros){
//            System.out.println("\t" + unMiembroEnGrupo.toString());//atencion por si falta super y this
            System.out.println("Grupo: "+ unMiembroEnGrupo.verGrupo().nombre + " - " + unMiembroEnGrupo.verAutor().verNombres()+ ", "+ unMiembroEnGrupo.verAutor().verApellidos() + " Rol: "+ unMiembroEnGrupo.verRol());
        }
    }
    public ArrayList <MiembroEnGrupo> verMiembros(){
        return miembros;
    }
    public void agregarMiembro (Autor autor, Rol rol){
        MiembroEnGrupo unMiembroEnGrupo = new MiembroEnGrupo(autor, this, rol);
        if(tieneMiembros() == false && miembros == null){
            miembros = new ArrayList<>();
        }
        if (this.esSuperAdministradores()){
            if(!this.miembros.contains(unMiembroEnGrupo)){
                unMiembroEnGrupo.asignarRol(Rol.ADMINISTRADOR);
                this.miembros.add(unMiembroEnGrupo);
                autor.agregarGrupo(this,Rol.ADMINISTRADOR);
            }
        } else if (!this.miembros.contains(unMiembroEnGrupo)){
            this.miembros.add(unMiembroEnGrupo);
            autor.agregarGrupo(this,rol);
        }

    }
    public void quitarMiembro(Autor miembro){
        for (MiembroEnGrupo unMiembroEnGrupo : miembros){
            if (this.miembros == null){
                System.out.println("Este Grupo ya esta Vacio");
            }
            if (this.equals(unMiembroEnGrupo.verAutor())){
                miembros.remove(miembro);
                miembro.quitarGrupo(this);
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
        if (this.miembros == null) {
            return false;
        }
        if (this.miembros.isEmpty()){
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