package day4;

//creating own exception message

//if meesage not initilaised getmessage returns null

public class MyDemo12{
	
	public static void main(String[] args) {
		try{
			
			throw new MinBalanceException2("Min Balance Reached");
			
		}catch(MinBalanceException2 e){
			System.out.println(e.getMessage());
		}
	}

}

class MinBalanceException2 extends Exception{
	
	
	public MinBalanceException2(String message){
		super(message);
	}
	
	
}
