package optional;

import java.util.Optional;

public class EjemploOptional {
    public static void main(String[] args) {
        new EjemploOptional().ejecuta();
    }

    private void ejecuta() {
        Optional<Integer> opcional = Optional.of(1);
    }
}
