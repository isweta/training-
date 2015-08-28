package day5;

public class Demo9Synchro {

	public static void main(String[] args) {

		Thread t1 = new Thread(new RThread7(), "one");
		t1.start();

		try {
			t1.join(); // line 11 crossed only after completion of t1
		} catch (InterruptedException e1) {
		}
		for (int i = 40; i <= 70; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {

			}
			System.out.println(Thread.currentThread().getName() + " " + i);

		}
	}

}

class RThread7 implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 39; i++) {

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {

			}
			System.out.println(Thread.currentThread().getName() + " " + i);
		}

	}

}