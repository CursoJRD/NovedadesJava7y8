package streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ElQuijote {
    private static Stream<String> texto;

    static {
        try {
            texto = Files.lines(Paths.get("src/main/resources/ElQuijote.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new ElQuijote().ejecuta();
    }

    private void ejecuta() {
//        cuentaLineas();
//        cuentaPalabras();
//        cuentaAparicionesPalabra("Sancho");
//        diccionarioDePalabras();
        palabraMasRepetida();
    }


    private void cuentaLineas() {
            long palabras = texto
                    .map(s -> s.split(" "))
                    .count();

            System.out.println("Lineas: " + palabras);
    }

    private void cuentaPalabras() {
            long palabras = texto
                    .map(s -> s.split(" "))
                    .flatMap(a -> Arrays.stream(a))
                    .count();

            System.out.println("Palabras: " + palabras);
    }

    private void cuentaAparicionesPalabra(String palabra) {
            long palabras = texto
                    .map(s -> s.split(" "))
                    .flatMap(a -> Arrays.stream(a))
                    .filter(p -> palabra.equalsIgnoreCase(p))
                    .count();

            System.out.println(palabra + ": " + palabras);
    }

    private void diccionarioDePalabras() {
        Map<String, Long> diccionario = texto
                .map(s -> s.split(" "))
                .flatMap(a -> Arrays.stream(a))
                .map(s -> s.toUpperCase())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(diccionario);
    }

    private void palabraMasRepetida() {
        Map<String, Long> diccionario = texto
                .map(s -> s.split(" "))
                .flatMap(a -> Arrays.stream(a))
                .map(s -> s.toUpperCase())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Entry<String, Long> maximo = diccionario.entrySet()
                .stream()
                .max(Entry.comparingByValue(Comparator.naturalOrder())) // No es necesario Comparator.naturalOrder()
                .get();

        System.out.println(maximo);
    }
}
