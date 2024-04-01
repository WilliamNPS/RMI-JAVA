

// Criando uma interface remota - PASSO 1

import java.rmi.Remote;
import java.rmi.RemoteException;


// Declaração de uma interface remota chamada "Ola"
// Esta interface permite que computadores de diferentes lugares se comuniquem entre si pela internet
public interface ola extends Remote {

    // Declaração do método "digaOla" que pode ser invocado remotamente
    // Retorna uma String
    // Pode lançar uma exceção RemoteException ->  Informar se houver problemas durante a comunicação remota
    String digaOla() throws RemoteException;
}
