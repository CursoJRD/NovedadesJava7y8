package interfaces;

@FunctionalInterface
public interface Interfaz {
    Double E = 2.718281; // Definición de una constante
    double calculaSuma(); // Declaración de un método

    default boolean isPar(int numero) {
        return numero%2 == 0 ? true : false;
    }

    static boolean isMultiploDeCinco(int numero) {
        return numero%5 == 0 ? true : false;
    }
}
