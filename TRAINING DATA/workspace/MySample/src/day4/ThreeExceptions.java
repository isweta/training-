package day4;

public class ThreeExceptions {

	public static void main(String[] args) {
		try {
			throwException();
			throw new ArrayIndexOutOfBoundsException(
					"Array Index Out Of Bounds ");

		} catch (Exception1 | Exception2 | Exception3 e) {
			System.out.println(e.getMessage());

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

	}

	public static void throwException() throws Exception1, Exception2,
			Exception3 {
		
		throw new Exception2();
	}
}

class Exception1 extends Exception {
	public Exception1() {
		super("Throws Exception 1");
	}

}

class Exception2 extends Exception {
	public Exception2() {
		super("Throws Exception 2");
	}

}

class Exception3 extends Exception {
	public Exception3() {
		super("Throws Exception 3");
	}

}
