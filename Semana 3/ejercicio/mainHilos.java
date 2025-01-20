package ejercicio;

public class mainHilos {

	public static void main(String[] args) {
		Contador h1 = new Contador();
		Mensaje h2 = new Mensaje();
		
		h1.start();
		h2.start();
	}
}


