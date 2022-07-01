package Encapsulación;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(23);
        persona.setNombre("Pepito");
        persona.setTelefono(312564789);

        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Telefono: " + persona.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private long telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public long getTelefono() {
        return telefono;
    }
}