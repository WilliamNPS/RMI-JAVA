
// passo 4 - Criar Cliente

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class client {
    public static void main(String[] args){
        try {
            // Procurando o objeto remoto registrado com o nome "ola" no endereço rmi://localhost:1099
            ola stub = (ola) Naming.lookup("rmi://localhost:1099/ola");
            
            // Chamando o método remoto digaOla() e imprimindo a mensagem retornada
            System.out.println(stub.digaOla());
        } catch (NotBoundException | RemoteException | MalformedURLException e) {
            // Tratamento de exceção em caso de erro
            e.printStackTrace();
        } 
    }
}
