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


    private ArrayList<PalabraClave> palabrasClaves = new ArrayList<>();
    private MiembroEnGrupo autor;
    private Lugar lugarPublicacion;
    private Idioma idiomaPublicacion;
    private Tipo tipoPublicacion;
}
