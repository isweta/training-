package day5;

public class Demo3ThreadCreation2 {
	
	public static void main(String[] args) {
		
		
		Thread t1 = new Thread(new RThread(),"MyRThread");
		t1.start();
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
			}
			System.out.println(Thread.currentThread().getName() + " " + i);
		
		}
	}

}


class RThread implements Runnable{

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
			}
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
		
	}
	
}