import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class SerializationDemo {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		/*ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("C:\\Java\\sout3.ser"));
		Game gameState=new Game();
		gameState.val1=1;
		gameState.val2="Hello";
		out.writeObject(gameState);*/
		
		
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("C:\\Java\\sout3.ser"));
		System.out.println((	(Game)in.readObject()	).serialVersionUID);
		System.out.println(Game.serialVersionUID);
		in.readObject().getClass().
		if(	(	(Game)in.readObject()	).serialVersionUID==Game.serialVersionUID)
		{			Game gameStateRead=(Game)in.readObject();
		System.out.println(gameStateRead.val1);
		System.out.println(gameStateRead.val2);}
		
	}

}
