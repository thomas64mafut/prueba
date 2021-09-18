package tipos.modelos;

public class Tipo {
    private String nombre;

    public void mostrarTipo(){
        System.out.println(this.nombre);
    }

    public Tipo(String nombre) {
        this.nombre = nombre;
    }

    public String verNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }
}
