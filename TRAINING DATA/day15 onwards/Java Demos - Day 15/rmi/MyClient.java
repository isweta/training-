import java.rmi.*;
import java.rmi.server.*;

public class MyClient{


     public static void main(String ar[]) throws Exception{

            MyRemote  remote  =(MyRemote)Naming.lookup("localhost");
             System.out.println(remote.sayHello());
       }
}