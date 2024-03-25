
// PASSO2
// Iremos implementar a interface remota a classe
//  Sera os nossos objetoS remotoS
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Olaimpi extends UnicastRemoteObject implements ola {
   
    // Construtor
    protected Olaimpi() throws RemoteException {
        super();
    }
    private static final long serialVersionUID = 1L;
    @Override
    public String digaOla() throws RemoteException {
       return "ola, Mundo";
    }
    
}
