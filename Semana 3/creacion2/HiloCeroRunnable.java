package creacion2;

public class HiloCeroRunnable implements Runnable {
	public void run() {
		for (int i=0; i<50; i++)
			System.out.print("0-");
	}

}
