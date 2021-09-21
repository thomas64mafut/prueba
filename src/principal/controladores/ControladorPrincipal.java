package principal.controladores;

import autores.modelos.Alumno;
import autores.modelos.Profesor;
import autores.vistas.VentanaAMAlumno;
import autores.vistas.VentanaAMProfesor;
import grupos.modelos.Grupo;
import grupos.vistas.VentanaAMGrupo;
import idiomas.modelos.Idioma;
import idiomas.vistas.VentanaAIdioma;
import lugares.modelos.Lugar;
import lugares.vistas.VentanaALugar;
import palabrasclaves.modelos.PalabraClave;
import palabrasclaves.vistas.VentanaAPalabraClave;
import tipos.modelos.Tipo;
import tipos.vistas.VentanaATipo;

import javax.swing.*;
import java.util.ArrayList;


public class ControladorPrincipal {
    public static void main(String[] args) {
//        ArrayList<Alumno> alumnos = new ArrayList<>();
//        ArrayList<Profesor> profesores = new ArrayList<>();
//        ArrayList<Idioma> idiomas = new ArrayList<>();
//        ArrayList<Lugar> lugares = new ArrayList<>();
//        ArrayList<PalabraClave> palabrasClaves = new ArrayList<>();
//        ArrayList<Tipo> tipos = new ArrayList<>();
//        ArrayList<Grupo> grupos = new ArrayList<>();
//
//        alumnos.add(new Alumno(43000000, "Medina Raed", "Luis", "capo", "43000000"));
//        alumnos.add(new Alumno(44000000, "Mafut", "Thomas", "Mas Capo", "44000000"));
//
//        profesores.add(new Profesor(35000000, "Abbas", "Facundo", "Es Sheldon Cooper", "Ayudante"));
//
//        grupos.add(new Grupo("Prog II - 1", "Orientado a Java"));
//
//        idiomas.add(new Idioma("Español"));
//        idiomas.add(new Idioma("Ingles"));
//
//        lugares.add(new Lugar("FACET - UNT"));
//
//        tipos.add(new Tipo ("Ensayo"));
//
//        palabrasClaves.add(new PalabraClave("Programando"));
//
//        //Printeos
//        System.out.println("Datos del Alumno: ");
//        for (Alumno unAlumno : alumnos){
//            unAlumno.mostrar();
//        }
//        System.out.println("");
//
//        System.out.println("Datos del Profesor: ");
//        for (Profesor unProfe : profesores){
//            unProfe.mostrar();
//        }
//        System.out.println("");
//
//        System.out.println("Grupos: ");
//        for (Grupo unGrupo : grupos){
//            unGrupo.mostrar();
//        }
//        System.out.println("");
//
//        System.out.println("Idiomas: ");
//        for (Idioma unIdioma : idiomas  ){
//            System.out.printf("\t %s\n",unIdioma.toString());
//        }
//        System.out.println("");
//
//        System.out.println("Lugares: ");
//        for (Lugar unLugar : lugares){
//            System.out.printf("\t %s\n",unLugar.toString());
//        }
//        System.out.println("");
//
//        System.out.println("Tipos: ");
//        for (Tipo unTipo : tipos){
//            System.out.printf("\t %s\n",unTipo.toString());
//        }
//        System.out.println("");
//
//        System.out.println("Palabras Claves: ");
//        for (PalabraClave unaPalabraClave : palabrasClaves){
//            System.out.printf("\t %s\n",unaPalabraClave.toString());
//        }
//        System.out.println("");
        asignarLookAndFeel("Nimbus");

        VentanaAMAlumno ventanaAlumno = new VentanaAMAlumno(null); //se instancia la ventana
        ventanaAlumno.setLocationRelativeTo(null); //se centra la ventana
        ventanaAlumno.setVisible(true); //se hace visible la ventana

        VentanaAMProfesor ventanaProfesor = new VentanaAMProfesor(null); //se instancia la ventana
        ventanaProfesor.setLocationRelativeTo(null); //se centra la ventana
        ventanaProfesor.setVisible(true); //se hace visible la ventana

        VentanaAMGrupo ventanaGrupo = new VentanaAMGrupo(null); //se instancia la ventana
        ventanaGrupo.setLocationRelativeTo(null); //se centra la ventana
        ventanaGrupo.setVisible(true); //se hace visible la ventana

        VentanaAIdioma ventanaIdioma = new VentanaAIdioma(null); //se instancia la ventana
        ventanaIdioma.setLocationRelativeTo(null); //se centra la ventana
        ventanaIdioma.setVisible(true); //se hace visible la ventana

        VentanaALugar ventanaLugar = new VentanaALugar(null); //se instancia la ventana
        ventanaLugar.setLocationRelativeTo(null); //se centra la ventana
        ventanaLugar.setVisible(true); //se hace visible la ventana

        VentanaAPalabraClave ventanaPalabraClave = new VentanaAPalabraClave(null); //se instancia la ventana
        ventanaPalabraClave.setLocationRelativeTo(null); //se centra la ventana
        ventanaPalabraClave.setVisible(true); //se hace visible la ventana

        VentanaATipo ventanaTipo = new VentanaATipo(null); //se instancia la ventana
        ventanaTipo.setLocationRelativeTo(null); //se centra la ventana
        ventanaTipo.setVisible(true); //se hace visible la ventana
    }
    public static void asignarLookAndFeel(String laf) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if (laf.equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                }
            }
        } catch (Exception e) {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            }
            catch (Exception e2) {
                System.exit(0);
            }
        }
    }
}




