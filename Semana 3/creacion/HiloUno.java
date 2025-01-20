package creacion;

public class HiloUno extends Thread {

	public void run() {
		for  (int i = 0; i< 100; i++) {
			System.out.println("Me gusta java");
		}
	}
	
}
