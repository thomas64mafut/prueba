package autores.modelos;

public class Alumno {
    //Declaracion de variables
    private int dni;
    private String apellidos;
    private String nombres;
    private String clave;
    private String cx;

    // Metodos
    public void mostrar(){
        System.out.println("Alumno");
        System.out.println("Nombres: "+ nombres);
        System.out.println("Apellidos: "+ apellidos);
        System.out.println("DNI: "+ dni);
        System.out.println("CX: "+ cx);
        System.out.println("Clave: "+ clave);
    }

    // Objeto
    public Alumno(int dni, String apellidos, String nombres, String clave, String cx) {
        this.dni = dni;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.clave = clave;
        this.cx = cx;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.dni;
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
        final Alumno other = (Alumno) obj;
        if (this.dni != other.dni) {
            return false;
        }
        return true;
    }

    //Getters & Setters
    public int verDni() {
        return dni;
    }

    public void asignarDni(int dni) {
        this.dni = dni;
    }

    public String verApellidos() {
        return apellidos;
    }

    public void asignarApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String verNombres() {
        return nombres;
    }

    public void asignarNombres(String nombres) {
        this.nombres = nombres;
    }

    public String verClave() {
        return clave;
    }

    public void asignarClave(String clave) {
        this.clave = clave;
    }

    public String verCx() {
        return cx;
    }

    public void asignarCx(String cx) {
        this.cx = cx;
    }
}
