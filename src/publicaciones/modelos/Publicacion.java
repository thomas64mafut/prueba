package publicaciones.modelos;

import grupos.modelos.MiembroEnGrupo;
import idiomas.modelos.Idioma;
import lugares.modelos.Lugar;
import palabrasclaves.modelos.PalabraClave;
import tipos.modelos.Tipo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Publicacion {
    private String titulo;
    private LocalDate fechaPublicacion;
    private String enlace;
    private String resumen;
    private ArrayList<PalabraClave> palabrasClaves;
    private MiembroEnGrupo autor;
    private Lugar lugarPublicacion;
    private Idioma idiomaPublicacion;
    private Tipo tipoPublicacion;

    public Publicacion(String titulo, LocalDate fechaPublicacion, String enlace, String resumen, ArrayList<PalabraClave> palabrasClaves, MiembroEnGrupo autor, Lugar lugarPublicacion, Idioma idiomaPublicacion, Tipo tipoPublicacion) {
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
        this.enlace = enlace;
        this.resumen = resumen;
        this.palabrasClaves = palabrasClaves;
        this.autor = autor;
        this.lugarPublicacion = lugarPublicacion;
        this.idiomaPublicacion = idiomaPublicacion;
        this.tipoPublicacion = tipoPublicacion;
    }

    void mostrar(){
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
