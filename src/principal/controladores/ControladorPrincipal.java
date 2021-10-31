/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.controladores;

import autores.modelos.Alumno;
import autores.modelos.Autor;
import autores.modelos.Cargo;
import autores.modelos.Profesor;
import grupos.modelos.Grupo;
import grupos.modelos.MiembroEnGrupo;
import grupos.modelos.Rol;
import idiomas.modelos.Idioma;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import lugares.modelos.Lugar;
import palabrasclaves.modelos.PalabraClave;
import publicaciones.modelos.Publicacion;
import tipos.modelos.Tipo;


/**
 *
 * @author Cel
 */
public class ControladorPrincipal {
    public static void main(String[] args) {
        //<editor-fold defaultstate="collapsed" desc="Sin intefaz gráfica">
        ArrayList<Grupo> grupos = new ArrayList<>();
//        ArrayList<Alumno> alumnos = new ArrayList<>();
//        ArrayList<Profesor> profesores = new ArrayList<>();
        ArrayList<Autor> autores = new ArrayList<>();
        ArrayList<Tipo> tipos = new ArrayList<>();
        ArrayList<Lugar> lugares = new ArrayList<>();
        ArrayList<Idioma> idiomas = new ArrayList<>();
        ArrayList<PalabraClave> palabrasClaves = new ArrayList<>();
        ArrayList<Publicacion> publicaciones = new ArrayList<>();

        Grupo grupo1 = new Grupo("Grupo 1", "Descripción 1");
        Grupo grupo2 = new Grupo("Grupo 2", "Descripción 2");
        Grupo grupo3 = new Grupo("Grupo 3", "Descripción 3");
        Grupo grupo4 = new Grupo("Grupo 4", "Descripción 4");
        Grupo grupo5 = new Grupo("Grupo 5", "Descripción 5");
        Grupo grupo6 = new Grupo("Grupo 1", "Descripción 5"); //nombre repetido

        if (!grupos.contains(grupo1))
            grupos.add(grupo1);
        if (!grupos.contains(grupo2))
            grupos.add(grupo2);
        if (!grupos.contains(grupo3))
            grupos.add(grupo3);
        if (!grupos.contains(grupo4))
            grupos.add(grupo4);
        if (!grupos.contains(grupo5))
            grupos.add(grupo5);
        if (!grupos.contains(grupo6))
            grupos.add(grupo6);

//        for(Grupo g : grupos)
//            g.mostrar();

        Autor alumno1 = new Alumno(1, "Apellido1", "Nombre1", "Clave1", "1");
        Autor alumno2 = new Alumno(2, "Apellido2", "Nombre2", "Clave2", "2");
        Autor alumno3 = new Alumno(3, "Apellido3", "Nombre3", "Clave3", "3");
        Autor alumno4 = new Alumno(4, "Apellido4", "Nombre4", "Clave4", "4");
        Autor alumno5 = new Alumno(5, "Apellido5", "Nombre5", "Clave5", "5");
        Autor alumno6 = new Alumno(1, "Apellido6", "Nombre6", "Clave6", "6");
        //dni repetido con un alumno

        if (!autores.contains(alumno1))
            autores.add(alumno1);
        if (!autores.contains(alumno2))
            autores.add(alumno2);
        if (!autores.contains(alumno3))
            autores.add(alumno3);
        if (!autores.contains(alumno4))
            autores.add(alumno4);
        if (!autores.contains(alumno5))
            autores.add(alumno5);
        if (!autores.contains(alumno6))
            autores.add(alumno6);

        Autor profesor1 = new Profesor(10, "Apellido10", "Nombre10", "Clave10", Cargo.TITULAR);
        Autor profesor2 = new Profesor(20, "Apellido20", "Nombre20", "Clave20", Cargo.ASOCIADO);
        Autor profesor3 = new Profesor(30, "Apellido30", "Nombre30", "Clave30", Cargo.ADJUNTO);
        Autor profesor4 = new Profesor(40, "Apellido40", "Nombre40", "Clave40", Cargo.JTP);
        Autor profesor5 = new Profesor(50, "Apellido50", "Nombre50", "Clave50", Cargo.ADG);
        Autor profesor6 = new Profesor(10, "Apellido60", "Nombre60", "Clave60", Cargo.ADG);
        //dni repetido con otro profesor
        Autor profesor7 = new Profesor(1, "Apellido70", "Nombre70", "Clave70", Cargo.ADG);
        //dni repetido con otro alumno
        Autor alumno7 = new Alumno(50, "Apellido7", "Nombre7", "Clave7", "7");
        //dni repetido con un profesor
        Autor alumno8 = new Alumno(8, "Apellido8", "Nombre8", "Clave8", "5");
        //cx repetido con un alumno

        if (!autores.contains(profesor1))
            autores.add(profesor1);
        if (!autores.contains(profesor2))
            autores.add(profesor2);
        if (!autores.contains(profesor3))
            autores.add(profesor3);
        if (!autores.contains(profesor4))
            autores.add(profesor4);
        if (!autores.contains(profesor5))
            autores.add(profesor5);
        if (!autores.contains(profesor6))
            autores.add(profesor6);

        if (!autores.contains(profesor7))
            autores.add(profesor7);
        if (!autores.contains(alumno7))
            autores.add(alumno7);
        if (!autores.contains(alumno8))
            autores.add(alumno8);


//        for(Autor a : autores)
//            a.mostrar();

        /*Main parte 3*/
        /*
        1) Luego de crear grupos y autores, tomar 1 grupo y agregarle 2 autores
        como miembros. Mostrar el grupo verificando que tenga los miembros
        asignados. Verificar también que no se pueda agregar
        un mismo autor más de una vez, por más que sean en roles distintos.
        */
        System.out.println("");
        System.out.println("PARTE 1");
        grupo1.agregarMiembro(profesor1, Rol.ADMINISTRADOR);
        grupo1.agregarMiembro(profesor1, Rol.COLABORADOR); //autor repetido
        grupo1.agregarMiembro(alumno1, Rol.COLABORADOR);
        grupo1.mostrar();

        /*
        2) Tomar 1 de los 2 autores que se asignó al grupo anterior y
        agregarlo a otro grupo distinto.
        Mostrar los 2 autores verificando que pertenezcan a los grupos
        a los que fueron asignados.
        Verificar también que no se pueda agregarle a un autor
        un mismo grupo más de una vez, por más que sean roles distintos.
        */

        System.out.println("");
        System.out.println("PARTE 2");
        profesor1.agregarGrupo(grupo2, Rol.COLABORADOR);
        profesor1.agregarGrupo(grupo2, Rol.ADMINISTRADOR); //grupo repetido
        grupo2.quitarMiembro(profesor1);
        profesor1.mostrar();
        alumno1.mostrar();

        /*
        3) Tomar el grupo al que se le agregaron los 2 autores como miembros,
        quitarle 1 y mostrarlo, verificando que el autor
        ya no es miembro del grupo.
        */

        System.out.println("");
        System.out.println("PARTE 3");
        grupo1.quitarMiembro(profesor1);
        grupo1.mostrar();

        /*
        4) Crear un nuevo grupo para los super administradores.
        Este grupo DEBE llevar por nombre "Super Administradores".
        Intentar asignarle como miembro un autor cualquiera
        con el rol de colaborador, verificando que se lo
        agrega pero con el rol de administrador.
        */

        System.out.println("");
        System.out.println("PARTE 4");
        Grupo grupo7 = new Grupo("Super Administradores", "Grupo para los super administradores"); //grupo para los super administradores
        if (!grupos.contains(grupo7))
            grupos.add(grupo7);
        grupo7.agregarMiembro(profesor1, Rol.COLABORADOR);
        grupo7.mostrar();

        /*
        5) Verificar que el último grupo creado es de super administradores
        y cualquiera de los otros grupos no
        (usar el método esSuperAdministradores() definido en la clase Grupo).
        */

        System.out.println("");
        System.out.println("PARTE 5");
        System.out.println(grupo7.esSuperAdministradores());
        System.out.println(grupo1.esSuperAdministradores());

        /*
        6) Tomar el autor que se agregó al grupo de super administradores,
        verificar que el mismo es super administrador
        y los otros autores no (usar el método esSuperAdministrador()
        definido en la clase Autor).
        */
        System.out.println("");
        System.out.println("PARTE 6");
        System.out.println(profesor1.esSuperAdministrador());
        System.out.println(alumno1.esSuperAdministrador());

        /*Main parte 3*/

        Tipo tipo1 = new Tipo("Tipo 1");
        Tipo tipo2 = new Tipo("Tipo 2");
        Tipo tipo3 = new Tipo("Tipo 3");
        Tipo tipo4 = new Tipo("Tipo 4");
        Tipo tipo5 = new Tipo("Tipo 5");
        Tipo tipo6 = new Tipo("Tipo 1"); //nombre repetido

        if (!tipos.contains(tipo1))
            tipos.add(tipo1);
        if (!tipos.contains(tipo2))
            tipos.add(tipo2);
        if (!tipos.contains(tipo3))
            tipos.add(tipo3);
        if (!tipos.contains(tipo4))
            tipos.add(tipo4);
        if (!tipos.contains(tipo5))
            tipos.add(tipo5);
        if (!tipos.contains(tipo6))
            tipos.add(tipo6);

//        for(Tipo t : tipos)
//            System.out.println(t);

        Lugar lugar1 = new Lugar("Lugar 1");
        Lugar lugar2 = new Lugar("Lugar 2");
        Lugar lugar3 = new Lugar("Lugar 3");
        Lugar lugar4 = new Lugar("Lugar 4");
        Lugar lugar5 = new Lugar("Lugar 5");
        Lugar lugar6 = new Lugar("Lugar 1"); //nombre repetido

        if (!lugares.contains(lugar1))
            lugares.add(lugar1);
        if (!lugares.contains(lugar2))
            lugares.add(lugar2);
        if (!lugares.contains(lugar3))
            lugares.add(lugar3);
        if (!lugares.contains(lugar4))
            lugares.add(lugar4);
        if (!lugares.contains(lugar5))
            lugares.add(lugar5);
        if (!lugares.contains(lugar6))
            lugares.add(lugar6);

//        for(Lugar l : lugares)
//            System.out.println(l);

        Idioma idioma1 = new Idioma("Idioma 1");
        Idioma idioma2 = new Idioma("Idioma 2");
        Idioma idioma3 = new Idioma("Idioma 3");
        Idioma idioma4 = new Idioma("Idioma 4");
        Idioma idioma5 = new Idioma("Idioma 5");
        Idioma idioma6 = new Idioma("Idioma 1"); //nombre repetido

        if (!idiomas.contains(idioma1))
            idiomas.add(idioma1);
        if (!idiomas.contains(idioma2))
            idiomas.add(idioma2);
        if (!idiomas.contains(idioma3))
            idiomas.add(idioma3);
        if (!idiomas.contains(idioma4))
            idiomas.add(idioma4);
        if (!idiomas.contains(idioma5))
            idiomas.add(idioma5);
        if (!idiomas.contains(idioma6))
            idiomas.add(idioma6);

//        for(Idioma i : idiomas)
//            System.out.println(i);

        PalabraClave palabraClave1 = new PalabraClave("PalabraClave1");
        PalabraClave palabraClave2 = new PalabraClave("PalabraClave2");
        PalabraClave palabraClave3 = new PalabraClave("PalabraClave3");
        PalabraClave palabraClave4 = new PalabraClave("PalabraClave4");
        PalabraClave palabraClave5 = new PalabraClave("PalabraClave5");
        PalabraClave palabraClave6 = new PalabraClave("PalabraClave1"); //nombre repetido

        if (!palabrasClaves.contains(palabraClave1))
            palabrasClaves.add(palabraClave1);
        if (!palabrasClaves.contains(palabraClave2))
            palabrasClaves.add(palabraClave2);
        if (!palabrasClaves.contains(palabraClave3))
            palabrasClaves.add(palabraClave3);
        if (!palabrasClaves.contains(palabraClave4))
            palabrasClaves.add(palabraClave4);
        if (!palabrasClaves.contains(palabraClave5))
            palabrasClaves.add(palabraClave5);
        if (!palabrasClaves.contains(palabraClave6))
            palabrasClaves.add(palabraClave6);

//        for(PalabraClave pc : palabrasClaves)
//            System.out.println(pc);

        Publicacion publicacion1 = new Publicacion("Título 1", new MiembroEnGrupo(profesor1, grupo1, Rol.ADMINISTRADOR), LocalDate.of(2020, 06, 24), tipo1, idioma1, lugar1, new ArrayList<>(Arrays.asList(new PalabraClave[] {palabraClave1, palabraClave2, palabraClave3})), "Enlace 1", "Resumen 1");
        Publicacion publicacion2 = new Publicacion("Título 2", new MiembroEnGrupo(profesor2, grupo1, Rol.ADMINISTRADOR), LocalDate.of(2020, 06, 24), tipo2, idioma2, lugar2, new ArrayList<>(Arrays.asList(new PalabraClave[] {palabraClave4, palabraClave5})), "Enlace 2", "Resumen 2");
        Publicacion publicacion3 = new Publicacion("Título 3", new MiembroEnGrupo(profesor2, grupo2, Rol.COLABORADOR), LocalDate.of(2020, 06, 24), tipo1, idioma2, lugar2, new ArrayList<>(Arrays.asList(new PalabraClave[] {palabraClave2, palabraClave4, palabraClave5})), "Enlace 3", "Resumen 3");
        Publicacion publicacion4 = new Publicacion("Título 4", new MiembroEnGrupo(profesor4, grupo3, Rol.ADMINISTRADOR), LocalDate.of(2020, 06, 24), tipo4, idioma2, lugar5, new ArrayList<>(Arrays.asList(new PalabraClave[] {palabraClave1})), "Enlace 4", "Resumen 4");
        Publicacion publicacion5 = new Publicacion("Título 5", new MiembroEnGrupo(profesor4, grupo5, Rol.COLABORADOR), LocalDate.of(2020, 06, 24), tipo5, idioma3, lugar5, new ArrayList<>(Arrays.asList(new PalabraClave[] {palabraClave2, palabraClave3, palabraClave4})), "Enlace 5", "Resumen 5");
        Publicacion publicacion6 = new Publicacion("Título 1", new MiembroEnGrupo(profesor4, grupo5, Rol.COLABORADOR), LocalDate.of(2020, 06, 24), tipo5, idioma3, lugar5, new ArrayList<>(Arrays.asList(new PalabraClave[] {palabraClave2, palabraClave3, palabraClave4})), "Enlace 5", "Resumen 5"); //título repetido

        if (!publicaciones.contains(publicacion1))
            publicaciones.add(publicacion1);
        if (!publicaciones.contains(publicacion2))
            publicaciones.add(publicacion2);
        if (!publicaciones.contains(publicacion3))
            publicaciones.add(publicacion3);
        if (!publicaciones.contains(publicacion4))
            publicaciones.add(publicacion4);
        if (!publicaciones.contains(publicacion5))
            publicaciones.add(publicacion5);
        if (!publicaciones.contains(publicacion6))
            publicaciones.add(publicacion6);

//        for(Publicacion p : publicaciones) {
//            p.mostrar();
//            System.out.println();
    }

    //</editor-fold>

    //     //<editor-fold defaultstate="collapsed" desc="Intefaz gráfica"> 
//         VentanaAMGrupo ventanaGrupo = new VentanaAMGrupo(null); //se instancia la ventana
///*
////        ventanaGrupo.setLocationRelativeTo(null); //se centra la ventana
////        ventanaGrupo.setVisible(true); //se hace visible la ventana
//        
////        VentanaAMAlumno ventanaAlumno = new VentanaAMAlumno(null); //se instancia la ventana
////        ventanaAlumno.setLocationRelativeTo(null); //se centra la ventana
////        ventanaAlumno.setVisible(true); //se hace visible la ventana
//*/        
//        VentanaAMProfesor ventanaProfesor = new VentanaAMProfesor(null); //se instancia la ventana
//        ventanaProfesor.setLocationRelativeTo(null); //se centra la ventana
//        ventanaProfesor.setVisible(true); //se hace visible la ventana        
///*        
////        VentanaAIdioma ventanaIdioma = new VentanaAIdioma(null); //se instancia la ventana
////        ventanaIdioma.setLocationRelativeTo(null); //se centra la ventana
////        ventanaIdioma.setVisible(true); //se hace visible la ventana                
//        
////        VentanaALugar ventanaLugar = new VentanaALugar(null); //se instancia la ventana
////        ventanaLugar.setLocationRelativeTo(null); //se centra la ventana
////        ventanaLugar.setVisible(true); //se hace visible la ventana                        
//        
////        VentanaAPalabraClave ventanaPalabraClave = new VentanaAPalabraClave(null); //se instancia la ventana
////        ventanaPalabraClave.setLocationRelativeTo(null); //se centra la ventana
////        ventanaPalabraClave.setVisible(true); //se hace visible la ventana                                
//        
////        VentanaATipo ventanaTipo = new VentanaATipo(null); //se instancia la ventana
////        ventanaTipo.setLocationRelativeTo(null); //se centra la ventana
////        ventanaTipo.setVisible(true); //se hace visible la ventana   
//*/
//
//     //</editor-fold>
}
