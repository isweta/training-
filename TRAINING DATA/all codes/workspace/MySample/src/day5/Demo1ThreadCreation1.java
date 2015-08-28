package day5;

public class Demo1ThreadCreation1 {

	public static void main(String[] args) {
		MyThread mt1 = new MyThread("MyThread");
		mt1.start();
		for (int i = 1; i <= 10; i++) {
			
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}

}

class MyThread extends Thread {
	MyThread(String name) {
		super(name);
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}
}
