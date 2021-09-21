package principal.controladores;

import autores.modelos.Alumno;
import autores.modelos.Profesor;
import grupos.modelos.Grupo;
import idiomas.modelos.Idioma;
import lugares.modelos.Lugar;
import palabrasclaves.modelos.PalabraClave;
import tipos.modelos.Tipo;
import java.util.ArrayList;


public class ControladorPrincipal {
    public static void main(String[] args) {

        ArrayList<Alumno> alumnos = new ArrayList<>();
        ArrayList<Profesor> profesores = new ArrayList<>();
        ArrayList<Idioma> idiomas = new ArrayList<>();
        ArrayList<Lugar> lugares = new ArrayList<>();
        ArrayList<PalabraClave> palabrasClaves = new ArrayList<>();
        ArrayList<Tipo> tipos = new ArrayList<>();
        ArrayList<Grupo> grupos = new ArrayList<>();

        alumnos.add(new Alumno(43000000, "Medina Raed", "Luis", "capo", "43000000"));
        alumnos.add(new Alumno(44000000, "Mafut", "Thomas", "Mas Capo", "44000000"));

        profesores.add(new Profesor(35000000, "Abbas", "Facundo", "Es Sheldon Cooper", "Ayudante"));

        grupos.add(new Grupo("Prog II - 1", "Orientado a Java"));

        idiomas.add(new Idioma("Español"));
        idiomas.add(new Idioma("Ingles"));

        lugares.add(new Lugar("FACET - UNT"));

        tipos.add(new Tipo ("Ensayo"));

        palabrasClaves.add(new PalabraClave("Programando"));

        //Printeos
        System.out.println("Datos del Alumno: ");
        for (Alumno unAlumno : alumnos){
            unAlumno.mostrar();
        }
        System.out.println("");

        System.out.println("Datos del Profesor: ");
        for (Profesor unProfe : profesores){
            unProfe.mostrar();
        }
        System.out.println("");

        System.out.println("Grupos: ");
        for (Grupo unGrupo : grupos){
            unGrupo.mostrar();
        }
        System.out.println("");

        System.out.println("Idiomas: ");
        for (Idioma unIdioma : idiomas  ){
            System.out.printf("\t %s\n",unIdioma.toString());
        }
        System.out.println("");

        System.out.println("Lugares: ");
        for (Lugar unLugar : lugares){
            System.out.printf("\t %s\n",unLugar.toString());
        }
        System.out.println("");

        System.out.println("Tipos: ");
        for (Tipo unTipo : tipos){
            System.out.printf("\t %s\n",unTipo.toString());
        }
        System.out.println("");

        System.out.println("Palabras Claves: ");
        for (PalabraClave unaPalabraClave : palabrasClaves){
            System.out.printf("\t %s\n",unaPalabraClave.toString());
        }
        System.out.println("");
    }
}
