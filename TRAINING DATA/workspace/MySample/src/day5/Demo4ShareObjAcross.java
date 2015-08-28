package day5;

public class Demo4ShareObjAcross {
public static void main(String[] args) {
		
		RThread3 rt=new RThread3();
		Thread t1 = new Thread(rt,"MyRThread1");
		Thread t2 = new Thread(rt,"MyRThread2");
		
		t1.start();t2.start();
		
	}


}

class RThread3 implements Runnable{
	int count=0;
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
			}
			System.out.println(Thread.currentThread().getName() + " " + i+" count :"+ count++);
		}
		
	}
	
}