package lugares.modelos;

public class Lugar {
    private String nombre;

    public void mostrarLugar(){
        System.out.println(this.nombre);
    }

    public Lugar(String nombre) {
        this.nombre = nombre;
    }

    public String verNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }
}
