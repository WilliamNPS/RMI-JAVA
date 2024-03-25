
// passo 4

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class   client {
public static void main(String[] args){

    try {
        ola stub = (ola) Naming.lookup("rmi://localhost:1099/ola");
       System.out.println( stub.digaOla());
    } catch (NotBoundException | RemoteException | MalformedURLException e) {
        e.printStackTrace();
    } 
  }
}

