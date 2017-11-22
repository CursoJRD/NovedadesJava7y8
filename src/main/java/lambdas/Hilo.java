package lambdas;

public class Hilo {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hola desde un hilo.");
            }
        }).run();

        new Thread(() -> System.out.println("Hola desde un hilo."));

        Runnable runnable = () -> System.out.println("Hola desde un hilo");

    }
}
