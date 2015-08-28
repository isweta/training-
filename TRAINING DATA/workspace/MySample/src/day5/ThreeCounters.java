package day5;

public class ThreeCounters {

	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();
		Thread t1 = new Thread(new ThreadInc5(c1), "Inc5");
		Thread t2 = new Thread(new ThreadInc10(c2), "Inc10");
		Thread t3 = new Thread(new ThreadInc100(c3), "Inc100");
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
		t3.start();

	}

}

class ThreadInc5 implements Runnable {

	Counter counterObj;

	public ThreadInc5(Counter counterObj) {
		this.counterObj = counterObj;
	}

	@Override
	public void run() {
		while (counterObj.value < 1000)
			counterObj.inc(5);
	}

}

class ThreadInc10 implements Runnable {

	Counter counterObj;

	public ThreadInc10(Counter counterObj) {
		this.counterObj = counterObj;
	}

	@Override
	public void run() {
		while (counterObj.value < 1000)
			counterObj.inc(10);
	}

}

class ThreadInc100 implements Runnable {

	Counter counterObj;

	public ThreadInc100(Counter counterObj) {
		this.counterObj = counterObj;
	}

	@Override
	public void run() {
		while (counterObj.value < 1000)
			counterObj.inc(100);
	}

}

class Counter {
	int value;

	public void inc(int inc) {
		System.out.println(Thread.currentThread().getName() + "  " + value);
		this.value += inc;
	}

}
