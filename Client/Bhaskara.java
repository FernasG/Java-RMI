import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Bhaskara extends Remote {
    public String calculate(double a, double b, double c) throws RemoteException;
}