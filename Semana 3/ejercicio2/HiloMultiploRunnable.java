package ejercicio2;

public class HiloMultiploRunnable implements Runnable {
    private String nombreHilo;

    public HiloMultiploRunnable(String nombreHilo) {
        this.nombreHilo = nombreHilo;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println(nombreHilo + ": Múltiplo de 2: " + (i * 2));
            try {
                Thread.sleep(100); // Pausa para permitir que el otro hilo se ejecute
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
    public static void main(String[] args) {
        Thread hilo1 = new Thread(new HiloMultiploRunnable("Hilo 1"));
        Thread hilo2 = new Thread(new HiloMultiploRunnable("Hilo 2"));

        hilo1.start();
        hilo2.start();
    }
}
