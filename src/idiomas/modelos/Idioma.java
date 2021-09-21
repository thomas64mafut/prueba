package idiomas.modelos;

public class Idioma {
    private String nombre;

    @Override
    public String toString() {
        return nombre;
    }

    public void mostrarIdioma(){
        System.out.println(this.nombre);
    }

    public Idioma(String nombre) {
        this.nombre = nombre;
    }

    public String verNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }


}
