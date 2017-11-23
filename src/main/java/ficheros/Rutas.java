package ficheros;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Rutas {
    public static final String EL_QUIJOTE_TXT = "src/main/resources/ElQuijote.txt";

    public static void main(String[] args) {
        new Rutas().ejecuta();
    }

    private void ejecuta() {
        Path ruta = Paths.get(EL_QUIJOTE_TXT);
    }
}
