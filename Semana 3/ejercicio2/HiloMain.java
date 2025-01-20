package ejercicio2;

public class HiloMain {

	public static void main(String[] args) {
        Thread hilo1 = new Thread(new HiloMultiploRunnable("Hilo 1"));
        Thread hilo2 = new Thread(new HiloMultiploRunnable("Hilo 2"));

        hilo1.start();
        hilo2.start();
    }
}
