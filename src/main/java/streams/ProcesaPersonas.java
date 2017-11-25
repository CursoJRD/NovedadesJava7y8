package streams;

import java.util.List;

public class ProcesaPersonas {
    public static void main(String[] args) {
        ProcesaPersonas procesaPersonas = new ProcesaPersonas();
        procesaPersonas.personasEnProvincia("Castellón");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void personasEnProvincia(String provincia) {
        List<Persona> personas = Persona.aleatorias(100);

        personas.stream()
                .filter(p -> provincia.equalsIgnoreCase(p.getProvincia()))
                .findFirst()
                .ifPresent(System.out::println);

        System.out.println(personas);

    }
}
