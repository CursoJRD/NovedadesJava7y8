package fechas;

import java.time.LocalTime;

public class Hora {
    public static void main(String[] args) {
        new Hora().ejecuta();
    }

    private void ejecuta() {
        LocalTime ahora = LocalTime.now();
        System.out.println("La hora es: " + ahora);

        LocalTime instante = LocalTime.of(10,10);
        System.out.println("Las diez y diez: "  + instante);

        LocalTime cincoDeLaTarde = LocalTime.parse("17:00:00");
        System.out.println("Las cinco de la tarde: " + cincoDeLaTarde);

        LocalTime hora = LocalTime.now()
                .withMinute(0)
                .withHour(22)
                .withSecond(10);

        System.out.println("La nueva hora: " + hora);
    }
}
