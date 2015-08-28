package day5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class StudentRecord {
	
	

	public static void main(String[] args) throws IOException {
		char contCh;
		do{
		
		System.out.println("Enter Roll, name, age, address");
		BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
		String in[]=buff.readLine().split(" ");
		
		int roll=Integer.parseInt(in[0]);
		String name=in[1];
		int age=Integer.parseInt(in[2]);
		String adr=in[3];
		
		System.out.println("Save record(y/n)?");
		char ch=(char)buff.read();
		if(ch=='n')
			return;
		Student s=new Student();
		s.roll=roll;
		s.name=name;
		s.age=age;
		s.adr=adr;
		
		ObjectOutputStream file=new ObjectOutputStream(new FileOutputStream(new File("Record.txt")));
		file.writeObject(s);
		System.out.println("Do you wish to insert another record?(y/n)");
		contCh=(char)buff.read();
		System.out.println("contCh"+ contCh);
		}while(contCh=='y');
		
	}

}
class Student implements Serializable{
	
	/**
	 * 
	 */
	//private static final long serialVersionUID = -1285762568846220786L;
	int roll;
	String name;
	int age;
	String adr;
}


