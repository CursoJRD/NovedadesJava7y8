package fechas;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.TemporalAmount;

public class Intervalos {
    public static void main(String[] args) {
        new Intervalos().ejecuta();
    }

    private void ejecuta() {
        Period entreFechas = Period.between(LocalDate.now().withYear(2000).withMonth(3), LocalDate.now());
        System.out.println(entreFechas);

        Duration entreHoras = Duration.between(LocalTime.now().withHour(10), LocalTime.now());
        System.out.println(entreHoras);

        Duration diezMinutos = Duration.ofMinutes(10);

        LocalTime enDiezMinutos = LocalTime.now().plus(diezMinutos);
        System.out.println(enDiezMinutos);

        Period cincoDias = Period.ofDays(5);
        LocalDate enCincoDias = LocalDate.now().plus(cincoDias);
        System.out.println(enCincoDias);
    }
}
