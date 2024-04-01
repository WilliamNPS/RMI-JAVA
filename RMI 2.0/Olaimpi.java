import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

// Passo 2: Implementar a interface remota

// A classe Olaimpi implementa a interface remota "ola"
public class Olaimpi extends UnicastRemoteObject implements ola {

    // UnicastRemoteObject torna este objeto acessível remotamente
    // "implements" indica que Olaimpi promete fornecer implementações para a interface "ola"

   
    // Ele chama o construtor da superclasse UnicastRemoteObject
    // Isso é necessário para configurar corretamente o objeto Olaimpi para ser acessível remotamente
    protected Olaimpi() throws RemoteException {
        super(); // Chamada ao construtor da superclasse
    }
    
    // Número de versão usado para garantir compatibilidade ao enviar e receber objetos pela internet
    private static final long serialVersionUID = 1L;
    
    // Implementação do método remoto "digaOla" definido na interface "ola"
    @Override
    public String digaOla() throws RemoteException {
       return "Olá, Mundo"; // Retorna uma mensagem de saudação
    }
}
