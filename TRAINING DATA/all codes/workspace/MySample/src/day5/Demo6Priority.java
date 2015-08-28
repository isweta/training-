package day5;

public class Demo6Priority {
public static void main(String[] args) {
		
		RThread5 rt=new RThread5();
		
		Thread t1 = new Thread(rt,"one");
		Thread t2 = new Thread(rt,"two");
		Thread t3 = new Thread(rt,"three");
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();t2.start();t3.start();
		
	}


}

class RThread5 implements Runnable{
	int count=0;
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(900);
			} catch (InterruptedException e) {
				
			}
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
		
	}
	
}