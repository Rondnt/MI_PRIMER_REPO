package creacion2;

public class instaciaRunnable {

	public static void main(String[] args) {
	HiloUnoRunnable ob1 = new HiloUnoRunnable();
	HiloCeroRunnable ob2 = new HiloCeroRunnable();
	
	Thread h1 = new Thread (ob1);
	Thread h2 = new Thread (ob2);
	
	h1.start();
	h2.start();
	}
	
}

/*
 *Crear un programa que muestre los 20 primeros multiplos de 2 y el nombre del hilo que se esta ejecutando 
 *y al mismo tiempo se este mostrando los 20 primeros multiplos de 2 en otro hilo
 *y el nombre del otro hilo  
 */
