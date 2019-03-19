package flight.entity;

public class Persona {

    private String rut;
    private String nombre;

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "rut='" + rut + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}