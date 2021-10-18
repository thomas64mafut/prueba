package palabrasclaves.modelos;

public class PalabraClave {
    private String nombre;

    public PalabraClave(String nombre) {
        this.nombre = nombre;
    }

    public String verNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarPalabraClave(){
        System.out.println(this.nombre);
    }

    public String toString() {
        return nombre;
    }
}
