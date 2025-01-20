package ejercicio;

public class Mensaje extends Thread {
	public void run() {
		for (int i=0; i<100 ; i++) {
			System.out.println("Me Gusta Java");
		}
	}
}
