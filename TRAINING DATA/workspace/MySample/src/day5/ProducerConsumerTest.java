package day5;

public class ProducerConsumerTest {
	public static void main(String[] args) {
		Inventory c = new Inventory();
		Producer p1 = new Producer(c);
		Consumer c1 = new Consumer(c);
		p1.start();
		c1.start();
	}
}


class Inventory {
	private int contents;
	private boolean available = false;

	public synchronized int get() {
		while (available == false) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		available = false;
		System.out.println("get" + contents);
		notify();
		
		

		return contents;
	}

	public synchronized void put(int value) {
		while (available == true) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		contents = value;
		System.out.println("put" + contents);
		available = true;
		notify();
	}
}

class Producer extends Thread {
	private Inventory inventory;

	public Producer(Inventory c) {
		inventory = c;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				sleep((int) (Math.random() * 1000));
				// sleep(500);
			} catch (InterruptedException e) {
			}
			inventory.put(i);

		}
	}
}

class Consumer extends Thread {
	private Inventory inventory;

	public Consumer(Inventory c) {
		inventory = c;

	}

	public void run() {
		int value = 0;
		for (int i = 0; i < 10; i++) {
			try {
				sleep((int) Math.random() * 1000);
			} catch (InterruptedException e) {
			}
			value = inventory.get();

		}
	}
}