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




