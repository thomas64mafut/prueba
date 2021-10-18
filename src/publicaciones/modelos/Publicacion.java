package publicaciones.modelos;

import grupos.modelos.MiembroEnGrupo;
import idiomas.modelos.Idioma;
import lugares.modelos.Lugar;
import palabrasclaves.modelos.PalabraClave;
import tipos.modelos.Tipo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Publicacion {
    private String titulo;
    private MiembroEnGrupo autor;
    private LocalDate fechaPublicacion;
    private Tipo tipoPublicacion;
    private Idioma idiomaPublicacion;
    private Lugar lugarPublicacion;
    private ArrayList<PalabraClave> palabrasClaves;
    private String enlace;
    private String resumen;

    public Publicacion(String titulo, MiembroEnGrupo autor, LocalDate fechaPublicacion, Tipo tipoPublicacion, Idioma idiomaPublicacion, Lugar lugarPublicacion, ArrayList<PalabraClave> palabrasClaves, String enlace, String resumen) {
        this.titulo = titulo;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
        this.tipoPublicacion = tipoPublicacion;
        this.idiomaPublicacion = idiomaPublicacion;
        this.lugarPublicacion = lugarPublicacion;
        this.palabrasClaves = palabrasClaves;
        this.enlace = enlace;
        this.resumen = resumen;
    }

    public void mostrar(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor.verProfesor().verApellidos() + ", " + this.autor.verProfesor().verNombres());
        System.out.println("Grupo: " + this.autor.verGrupo().verNombre());
        System.out.println("Fecha de Publicacion: " + this.fechaPublicacion);
        System.out.println("Tipo: " + this.tipoPublicacion);
        System.out.println("Idioma: " + this.idiomaPublicacion);
        System.out.println("Lugar: " + this.lugarPublicacion);
        System.out.println("Palabras Claves");
        System.out.println("---------------");
        for (PalabraClave palabraClave : palabrasClaves){
            System.out.println("\t" + palabraClave);
        }
        System.out.println("Enlace: " + this.enlace);
        System.out.println("Resumen: " + this.resumen);
    }
}
