package ejercicio;

public class Contador extends Thread {
	
	public void run() {
		for (int i= 0; i<=200; i++) {
			System.out.println(i);
		}
	}
	
}
