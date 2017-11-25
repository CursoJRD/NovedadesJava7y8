package streams;

import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;
import es.uji.belfern.generador.GeneradorDatosINE;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    private static final GeneradorDatosINE generador = new GeneradorDatosINE();
    private String nombre;
    private String apellidos;
    private int edad;
    private String nif;
    private String provincia;
    private String poblacion;

    private Persona(String nombre, String apellidos, int edad, String nif, String provincia, String poblacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.nif = nif;
        this.provincia = provincia;
        this.poblacion = poblacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public String getNif() {
        return nif;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getPoblacion() {
        return poblacion;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persona{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append(", edad=").append(edad);
        sb.append(", nif='").append(nif).append('\'');
        sb.append(", provincia='").append(provincia).append('\'');
        sb.append(", poblacion='").append(poblacion).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static Persona aleatoria() {

        String nombre = generador.getNombre();
        String apellidos = generador.getApellido() + " " + generador.getApellido();
        int edad = generador.getEdad();
        String provincia = generador.getProvincia();
        String poblacion = generador.getPoblacion(provincia);
        String nif = generador.getNIF();

        return new Persona(nombre, apellidos, edad, nif, provincia, poblacion);
    }

    public static List<Persona> aleatorias(int cuantas) {
        List<Persona> personas = new ArrayList<>();

        for(int i = 0; i <  cuantas; i++)
            personas.add(aleatoria());

        return personas;
    }
}
