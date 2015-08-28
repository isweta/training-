package day5;

public class Demo5DiffObjDiffThreads {
public static void main(String[] args) {
		
		RThread4 rt1=new RThread4();
		RThread4 rt2=new RThread4();
		Thread t1 = new Thread(rt1,"MyRThread1");
		Thread t2 = new Thread(rt2,"MyRThread2");
		
		t1.start();t2.start();
		
	}


}

class RThread4 implements Runnable{
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