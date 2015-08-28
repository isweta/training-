package day5;

public class Demo3MultipleThreads {
public static void main(String[] args) {
		
		RThread2 rt=new RThread2();
		Thread t1 = new Thread(rt,"MyRThread1");
		Thread t2 = new Thread(rt,"MyRThread2");
		
		t1.start();t2.start();
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
			}
			System.out.println(Thread.currentThread().getName() + " " + i);
		
		}
	}


}

class RThread2 implements Runnable{

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