import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
// PASSO 3
public class Server {
 public static void main(String[] args) {
      try {
        Registry registry = LocateRegistry.createRegistry(1099);
        Naming.rebind("rmi://localhost:1099/ola", new Olaimpi());
       
        System.out.println("servidor tá rodando rapaz");
    } catch (RemoteException | MalformedURLException e) {
        
        e.printStackTrace();
     }
   }
 }

