package prueba;

public class HiloPrueba extends Thread{
	@Override
	public void run() {
		for (int i= 0; i<50; i++) {
			System.out.println(i+" en hilo: "+getName());
		}
	} 
	
}


/*
 * Crear un programa que pueda contar del 1 al 200
 * mientras imprime 100 veces el texto "Me gusta Java"
 */
