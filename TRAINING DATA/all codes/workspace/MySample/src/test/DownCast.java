package test;

import test7889.Empl2;

public abstract class DownCast extends Object{

		public static void main(String[] args) {
			
			Empl2 obj=new Mang2();
			
			
			//printFn(obj);
		}
		
		public void printFn(Empl2 e){
			if(e instanceof Mang2){
				Mang2 m=(Mang2)e;
				m.manage();
				Object o=new Object();
				
				
				
				
			}
		}
}



class Mang2 extends Empl2{
	public void manage()
	{
		System.out.println("Manage");
	Empl2 e=new Empl2();
		testMethod();
		
		
	}
	
}
