package fechas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class FechaYHora {
    public static void main(String[] args) {
        new FechaYHora().ejecuta();
    }

    private void ejecuta() {
        LocalDateTime ahora = LocalDateTime.now();
        System.out.println("Ahora: " + ahora);

        LocalDate fecha = ahora.toLocalDate();
        LocalTime hora = ahora.toLocalTime();

        System.out.println(ahora.plusYears(-3));

        LocalDateTime haceTresAnyos = ahora.plusYears(-3);
        LocalDateTime manayana = ahora.plusDays(1);
        LocalDateTime enDiezMinutos = ahora.plusMinutes(10);
    }
}
