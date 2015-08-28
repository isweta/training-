package day5;

public class Demo2SlightSynchroSleep {

	public static void main(String[] args) {
		MyThread2 mt1 = new MyThread2("MyThread");
		mt1.start();
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
			}
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}

}

class MyThread2 extends Thread {
	MyThread2(String name) {
		super(name);
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}
}
