package interfaces;

public class Main {
    public static void main(String[] args) {
        Utilidad utilidad = new Utilidad();
        System.out.println(utilidad.isPar(3));
        System.out.println(Interfaz.isMultiploDeCinco(5));
        System.out.println(utilidad.calculaSuma());

        System.out.println(InterfazHija.isMultiploDe(2,4));
//        InterfazHija.isMultiploDeCinco(5);
    }
}
