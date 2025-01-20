package creacion;

public class HiloCero extends Thread{
	
	public void run() {
		for (int i = 0; i<= 200; i++) {
			System.out.println(i);
		}
	}


}
