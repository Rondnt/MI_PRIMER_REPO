package prueba;

public class ejemplo extends Thread {
	
	public ejemplo(String str) {
		super(str);
	}
	public void run() {
		for (int i = 0; i < 10 ; i++)
			System.out.println(i + " " + getName());
			System.out.println("Termina thread " + getName());
			}
	public static void main (String [] args) {
		new ejemplo("Pepe").start();
		new ejemplo("Juan").start();
		System.out.println("Termina thread main");
	}
}