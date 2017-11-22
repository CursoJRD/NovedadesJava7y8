package lambdas;

public class Main {
    public static void main(String[] args) {
        new Main().ejecuta();
    }

    private void ejecuta() {
        TablaConversion tabla = new TablaConversion();
        tabla.addConversor((grados) -> grados);
        tabla.addConversor((grados) -> 9.0/5.0*grados + 32);
        System.out.println(tabla.generaTabla());
    }
}
