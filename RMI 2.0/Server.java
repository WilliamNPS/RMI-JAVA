import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

// PASSO 3: Configurando o servidor

public class Server {
    public static void main(String[] args) {
        try {
            // Criando um registro para os serviços de RMI na porta 1099
            Registry registry = LocateRegistry.createRegistry(1099);
            
            // Registrando o objeto remoto Olaimpi no registro com o nome "ola"
            Naming.rebind("rmi://localhost:1099/ola", new Olaimpi());
            
            // Exibindo uma mensagem indicando que o servidor está funcionando
            System.out.println("Servidor está rodando!");
        } catch (RemoteException | MalformedURLException e) {
            // Tratamento de exceção em caso de erro
            e.printStackTrace();
        }
    }
}
