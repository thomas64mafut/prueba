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
    private ArrayList<MiembroEnGrupo> miembros = new ArrayList<>();
    // Constructor
    public Grupo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    // Metodos
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
    /**
        Este metodo nos permite mostrar un grupo
    */  
    public void mostrar(){
        System.out.println("------------------------------");
        System.out.println("Nombre: "+ nombre);
        System.out.println("Descripcion: "+ descripcion);
        System.out.println("Los miembros del grupo son: ");
        if(tieneMiembros()){
            for(MiembroEnGrupo unMiembroEnGrupo : miembros){
            System.out.println(unMiembroEnGrupo.verAutor().verNombres()+ ", "+ unMiembroEnGrupo.verAutor().verApellidos() + " Rol: "+ unMiembroEnGrupo.verRol());
        }
        }
            else
            {
                System.out.println("El grupo no tiene miembros.");       
            }
        }
    public ArrayList <MiembroEnGrupo> verMiembros(){
        return miembros;
    }

//    public void agregarMiembro (Autor autor, Rol rol){
//        MiembroEnGrupo unMiembroEnGrupo = new MiembroEnGrupo(autor, this, rol);
//        if(this.tieneMiembros() == false || miembros == null){
//            miembros = new ArrayList<>();
//        }
//        if (this.esSuperAdministradores()){
//            if(!this.miembros.contains(unMiembroEnGrupo)){
//                unMiembroEnGrupo.asignarRol(Rol.ADMINISTRADOR);
//                this.miembros.add(unMiembroEnGrupo);
//                autor.agregarGrupo(this,Rol.ADMINISTRADOR);
//            }
//        } else if (!this.miembros.contains(unMiembroEnGrupo)){
//            this.miembros.add(unMiembroEnGrupo);
//            autor.agregarGrupo(this,rol);
//        }
//    }
    public void agregarMiembro(Autor autor, Rol rol) {

        MiembroEnGrupo miembro = new MiembroEnGrupo(autor, this, rol);

        if(this.esSuperAdministradores()){
            miembro.asignarRol(Rol.ADMINISTRADOR);
        }

        if(!this.miembros.contains(miembro)){
            this.miembros.add(miembro);
            autor.agregarGrupo(this, rol);
        }
    }

    public void quitarMiembro(Autor miembro){
        ArrayList<MiembroEnGrupo> borraMiembro= new ArrayList<>();
        ArrayList<MiembroEnGrupo> borraGrupo = new ArrayList<>();

        if(tieneMiembros()){
            for(MiembroEnGrupo i: this.miembros){
                 if(!i.verAutor().equals(miembro)){
                     borraMiembro.add(i);
                 }
            }
             for(MiembroEnGrupo g: miembro.verGrupos()){
                if(!g.verGrupo().equals(this)){
                    borraGrupo.add(g);
                }
            }
        }
        miembro.asignarGrupos(borraGrupo);
        this.miembros = borraMiembro;
    }
    public boolean esSuperAdministradores(){
        if(this.nombre.equals("Super Administradores")){
            return true;
        }
        else
            return false;
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