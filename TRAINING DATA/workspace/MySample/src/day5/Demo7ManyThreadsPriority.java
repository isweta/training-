package day5;

public class Demo7ManyThreadsPriority {
public static void main(String[] args) {
		
		RThread6 rt=new RThread6();
		
		Thread t1 = new Thread(rt,"one");
		Thread t2 = new Thread(rt,"two");
		Thread t3 = new Thread(rt,"three");
		Thread t4 = new Thread(rt,"four");
		Thread t5 = new Thread(rt,"five");
		Thread t6 = new Thread(rt,"six");
		t1.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
		t5.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t4.setPriority(Thread.NORM_PRIORITY);
		t6.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();t2.start();t3.start();
		t4.start();t5.start();t6.start();
	}


}

class RThread6 implements Runnable{
	int count=0;
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
			}
			System.out.println(Thread.currentThread().getName() + " " + i + "line1 ");
			System.out.println(Thread.currentThread().getName() + " " + i + "line2 ");
			System.out.println(Thread.currentThread().getName() + " " + i + "line3 ");
			System.out.println(Thread.currentThread().getName() + " " + i + "line4 ");
			System.out.println(Thread.currentThread().getName() + " " + i + "line5 ");
			System.out.println(Thread.currentThread().getName() + " " + i + "line6 ");
			System.out.println(Thread.currentThread().getName() + " " + i + "line7 ");
			System.out.println(Thread.currentThread().getName() + " " + i + "line8 ");
			System.out.println(Thread.currentThread().getName() + " " + i + "line9 ");
			System.out.println(Thread.currentThread().getName() + " " + i + "line10 ");
			
			
		}
		
	}
	
}