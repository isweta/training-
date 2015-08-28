package day4;

//checkd and unchecked exceptions
//checked exceptions---compiler forces you to handle it
public class MyDemo15 {

	public static void main(String[] args) {

		throw new Error();
		//Account acc = new Account(-5000);

	}

}

class Account {
	int balance;

	Account(int balance) {
		if (balance < 0) {
			// throw new ArithmeticException();
			//throw new MinBalanceException2("Error!!");
		}

		this.balance = balance;
	}
}

class MinBalanceException2 extends Exception {

	public MinBalanceException2(String message) {
		super(message);
	}

}
