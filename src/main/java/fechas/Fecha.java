package fechas;

import java.time.LocalDate;

public class Fecha {
    public static void main(String[] args) {
        new Fecha().ejecuta();
    }

    private void ejecuta() {
        LocalDate hoy = LocalDate.now();
        System.out.println("Hoy es: " + hoy);

        LocalDate cumpleanyos = LocalDate.parse("1969-07-05");
        System.out.println("Nací el: " + cumpleanyos);

        LocalDate hombreEnLaLuna = LocalDate.of(1969, 7, 20);
        System.out.println("El día en que el hombre llegó a la luna: " + hombreEnLaLuna);

        System.out.println(hombreEnLaLuna.getDayOfWeek());

        LocalDate dia = LocalDate.now()
                .withYear(2000)
                .withMonth(1)
                .withDayOfMonth(29);

        System.out.println(dia);
    }
}
