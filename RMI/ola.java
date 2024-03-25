/*
 A RMI é uma tecnologia Java que permite a comunicação entre diferentes processos Java em máquinas distintas, 
 permitindo que um objeto em uma máquina seja invocado por outro objeto em uma máquina remota. Isso é feito de
  uma maneira que faz com que a chamada de método remoto pareça uma chamada de método local para o programador. 
 */


//  Passo 1 - Definir a interface remota 
//  Passo 2 - Definir a implementação da interface remota 
              // Estender UnicastRemoteObjtect
              // Criar construtor
              // Implementar métodos (todos devem lançar a remoteException)

//  Passo 3 - Criar um servidor 
              // Criar uma instância de registory
              // Vincular(rebind) a implementação da intaface no registory usando Naming
//  Passo 4 - Criar Cliente 
              // Procurar pelo objeto remotono registry e devolver o stub
              // Executar o método remoto 

//  Compilar o servidor na linha de comando e rodar   javac *.java
//  Compilar o cliente na linha de comando e rodar              








// Criando uma interface remota - PASSO 1
import java.rmi.Remote;
import java.rmi.RemoteException;
public interface ola extends Remote {
  String digaOla () throws RemoteException;
    
}
