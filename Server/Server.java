import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class Server {
    static public void main(String args[]) {
        try {
            System.setProperty("java.rmi.server.hostname", "192.168.3.75");

            BhaskaraImpl object = new BhaskaraImpl();
            Bhaskara stub = (Bhaskara) UnicastRemoteObject.exportObject(object, 0);

            Registry registry = LocateRegistry.createRegistry(10833);
            registry.rebind("Bhaskara", stub);

            System.err.println("Server ready");
        } catch (Exception e) {
            System.out.println("Server ERROR: " + e.toString());
            e.printStackTrace();
        }
    }
}