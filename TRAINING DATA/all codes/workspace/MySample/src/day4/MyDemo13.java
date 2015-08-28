package day4;

//who is responisble for handling exception--using throws to shirk responsibility of handling exception
//if not handled compiler throws unhandled exception 
//ultimately jvm will have to handle if the main method also throws backs the exception
public class MyDemo13 {

	public static void main(String[] args) {
		//try {

			Account acc = new Account(-5000);

		/*} catch (MinBalanceException2 e) {
			System.out.println(e.getMessage());
		}*/
	}

}

class Account {
	int balance;

	Account(int balance) throws MinBalanceException2 {
		if (balance < 0)
			throw new MinBalanceException2("Negative balance not allowed");
		this.balance = balance;
	}
}

class MinBalanceException2 extends Exception {

	public MinBalanceException2(String message) {
		super(message);
	}

}
