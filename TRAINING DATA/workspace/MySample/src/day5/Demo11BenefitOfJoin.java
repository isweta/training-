package day5;

//with t1.join less time required for execution

public class Demo11BenefitOfJoin {

	public static void main(String[] args) {
		long start=(System.currentTimeMillis());

		Thread t1 = new Thread(new RThread9(), "one");
		//t1.start();
		try {

			for (int i = 1; i <= 25; i++) {
				Thread.sleep(100);
				System.out.println(Thread.currentThread().getName() + " " + i);
			}
			//t1.join();
			t1.run();

		} catch (InterruptedException e) {}
		System.out.println("Printing Completed");
		long end=(System.currentTimeMillis());
		System.out.println(end-start);

	}

}

class RThread9 implements Runnable {

	@Override
	public void run() {
		for (int i = 26; i <= 50; i++) {

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {

			}
			System.out.println(Thread.currentThread().getName() + " " + i);
		}

	}

}