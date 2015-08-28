import java.rmi.*;
import java.rmi.server.*;

public class MyServer extends UnicastRemoteObject implements MyRemote{


     public String sayHello() throws RemoteException{

         return "Hello!";
     }
     public MyServer() throws RemoteException{  super();
                   System.out.println("Object created");
     }

     public static void main(String ar[]) throws Exception{

         MyServer  server = new MyServer();

         Naming.rebind("//192.168.1.5/bhimrmi",server);

             System.out.println("Registered");
     }
}