package day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Alphabet {

	public static void main(String[] args) throws VowelException, IOException,
			ExitException {
		System.out.println("Enter an alphabet in uppercase");
		BufferedReader buff = new BufferedReader(new InputStreamReader(
				System.in));
		char ch = (char) buff.read();
		if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
			throw new VowelException();
		if (ch == 'X')
			throw new ExitException();
		System.out.println(ch);
	}

}

class VowelException extends Exception {

	public VowelException() {
		super("Vowel Exception");
	}

}

class ExitException extends Exception {
	public ExitException() {
		super("Exit Exception");
	}
}