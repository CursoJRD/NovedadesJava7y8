package optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EjemploOptional {
    private List<Persona> personas = new ArrayList<>();
    private static final Persona PERSONA_NO_ENCONTRADA = new Persona("", "No encontrada", "");

    public static void main(String[] args) {
        EjemploOptional ejemplo =new EjemploOptional();
//        ejemplo.ejecuta();
        ejemplo.muestraPersonaOptional("0");
//        ejemplo.muestraPersonaNullObject("");
    }

    private void muestraPersona(String nif) {
        Persona persona;
        if((persona = buscaPersonaPorNIF(nif)) != null)
            System.out.println(persona);
        else System.out.println("No encontrada");
    }

    private void muestraPersonaNullObject(String nif) {
        System.out.println(buscaPersonaPorNIFNullObject(nif));
    }

    private Persona buscaPersonaPorNIFNullObject(String nif) {
        for(Persona persona: personas)
            if(persona.nif.equalsIgnoreCase(nif))
                return persona;

        return PERSONA_NO_ENCONTRADA;
    }

    private void muestraPersonaOptional(String nif) {
        System.out.println(buscaPersonaOptional(nif).orElse(new Persona("", "No encontrada", "")));
    }

    private Optional<Persona> buscaPersonaOptional(String nif) {
        for(Persona persona: personas)
            if(persona.nif.equalsIgnoreCase(nif)) {
                return Optional.of(persona);
            }

        return Optional.empty();
    }

    private Persona buscaPersonaPorNIF(String nif) {
        for(Persona persona: personas)
            if(persona.nif.equalsIgnoreCase(nif))
                return persona;

        return null;
    }

    private static class Persona {
        String nif;
        String nombre;
        String apellidos;

        public Persona(String nif, String nombre, String apellidos) {
            this.nif = nif;
            this.nombre = nombre;
            this.apellidos = apellidos;
        }

        @Override
        public String toString() {
            return "Persona{" +
                    "nif='" + nif + '\'' +
                    ", nombre='" + nombre + '\'' +
                    ", apellidos='" + apellidos + '\'' +
                    '}';
        }
    }
}
