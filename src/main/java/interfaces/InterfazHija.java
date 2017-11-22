package interfaces;

public interface InterfazHija extends Interfaz {
    @Override
    default boolean isPar(int numero) {
        return isMultiploDe(numero, 2);
    }

    static boolean isMultiploDe(int divisor, int numero) {
        return numero%divisor == 0 ? true : false;
    }
}
