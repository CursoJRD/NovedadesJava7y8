package streams;

import java.util.List;

public class ProcesaPersonas {
    public static void main(String[] args) {
        ProcesaPersonas procesaPersonas = new ProcesaPersonas();
        procesaPersonas.personasEnProvincia("Castellón");
    }

    private void personasEnProvincia(String provincia) {
        List<Persona> personas = Persona.aleatorias(1000);

        personas.stream()
                .filter(p -> provincia.equalsIgnoreCase(p.getProvincia()))
                .findFirst()
                .ifPresent(System.out::println);
    }
}
