package day5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingApp {

	public static void main(String[] args) {

		File f1 = new File("C:\\Users\\admin\\workspace\\MySample\\src\\day5\\"
				+ args[0]);

		File f2 = new File("C:\\Users\\admin\\workspace\\MySample\\src\\day5\\"
				+ args[1]);
		Thread t1 = new Thread(new ReaderThread(f1), "File1");
		Thread t2 = new Thread(new ReaderThread(f2), "File2");
		t1.start();
		t2.start();
	}

}

class ReaderThread implements Runnable {

	File file;

	public ReaderThread(File file) {
		this.file = file;
	}
	
	@Override
	public void run() {

		try {
			BufferedReader buff = new BufferedReader(new FileReader(file));
			String thisLine = buff.readLine();
			while (thisLine != null) {

				System.out.println(Thread.currentThread().getName() + " : "
						+ thisLine);
				Thread.sleep((int) Math.random() * 1000);
				thisLine = buff.readLine();
			}

			buff.close();
		} catch (FileNotFoundException e) {
			System.out.println("No such File");

		} catch (IOException e) {
			System.out.println("Difficulty Reading");
		} catch (InterruptedException e) {
		}

	}

}
