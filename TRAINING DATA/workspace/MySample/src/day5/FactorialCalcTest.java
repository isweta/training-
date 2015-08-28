package day5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FactorialCalcTest {
	public static void main(String[] args) {
		FactorialCalc factCalc = new FactorialCalc();
		Thread t1 = new Thread(new InputGetterThread(factCalc), "Reader");
		Thread t2 = new Thread(new FactCalcThread(factCalc), "Calculator");
		t1.start();
		t2.start();
	}

}

class FactorialCalc {
	int num;
	private boolean available = false;

	public synchronized int getNum() {
		while (available == false) {
			try {
				wait();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}
		available = false;
		notify();
		return num;
	}

	public synchronized void setNum(int num) {
		
		while (available == true) {
			try {
				wait();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}
		available = true;
		this.num=num;
		notify();

	}

}

class InputGetterThread implements Runnable {
	FactorialCalc factCalc;

	public InputGetterThread(FactorialCalc factCalc) {
		this.factCalc = factCalc;
	}
	
	

	@Override
	public void run() {
		BufferedReader in;
		try {
			in = new BufferedReader(
					new FileReader(
							new File(
									"C:\\Users\\admin\\workspace\\MySample\\src\\day5\\Numbers.txt")));
			for(int i=1; i<=5; i++) {
				
				factCalc.setNum(Integer.parseInt(in.readLine()));
				
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}

class FactCalcThread implements Runnable {
	FactorialCalc factCalc;

	public FactCalcThread(FactorialCalc factCalc) {
		this.factCalc = factCalc;
	}

	@Override
	public void run() {
		for(int numi=1; numi<=5; numi++){
			int num = factCalc.getNum();
			long ans = 1;
			for (int i = 1; i <= num; i++) {
				ans *= i;
			}
			System.out.println("Factorial of " + num + " is : " + ans);
		}
		
	}

}
