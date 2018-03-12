package streams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
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

    public static final String EL_QUIJOTE_TXT = "src/main/resources/ElQuijote.txt";

    static {
        try {
            texto = Files.lines(Paths.get(EL_QUIJOTE_TXT));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new ElQuijote().ejecuta();
    }

    private void ejecuta() {
        cuentaLineasSinStreams();
        cuentaLineas();

//        cuentaPalabrasSinStreams();
//        cuentaPalabras();

//        cuentaAparicionesPalabraSinStreams("Rocinante");
//        cuentaAparicionesPalabra("Sancho");

//        diccionarioDePalabras();
//        palabraMasRepetida();
    }


    private void cuentaLineas() {
        long lineas = texto
                .count();

        System.out.println("Lineas: " + lineas);
    }

    private void cuentaLineasSinStreams() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(EL_QUIJOTE_TXT));
            int lineas = 0;
            while((br.readLine()) != null) {
                lineas++;
            }
            System.out.println("Lineas: " + lineas);
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void cuentaPalabras() {
            long palabras = texto
                    .map(s -> s.split(" "))
                    .flatMap(a -> Arrays.stream(a))
                    .count();

            System.out.println("Palabras: " + palabras);
    }

    private void cuentaPalabrasSinStreams() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(EL_QUIJOTE_TXT));
            int palabras = 0;
            String linea;
            while((linea = br.readLine()) != null) {
                palabras += linea.split(" ").length;
            }
            System.out.println("Palabras: " + palabras);
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void cuentaAparicionesPalabra(String palabra) {
            long palabras = texto
                    .map(s -> s.split(" "))
                    .flatMap(a -> Arrays.stream(a))
                    .filter(p -> palabra.equalsIgnoreCase(p))
                    .count();

            System.out.println(palabra + ": " + palabras);
    }

    private void cuentaAparicionesPalabraSinStreams(String palabra) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(EL_QUIJOTE_TXT));
            int palabras = 0;
            String linea;
            while((linea = br.readLine()) != null) {
                for(String token: linea.split(" "))
                    if(palabra.equalsIgnoreCase(token))
                        palabras++;
            }
            System.out.println(palabra + ": " + palabras);
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
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
