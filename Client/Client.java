import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {
    static public void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Type a: ");
        double a = keyboard.nextDouble();

        System.out.println("Type b: ");
        double b = keyboard.nextDouble();

        System.out.println("Type c: ");
        double c = keyboard.nextDouble();

        System.out.println("");
        keyboard.close();

        try {
            Registry registry = LocateRegistry.getRegistry("192.168.3.75", 10833);
            Bhaskara stub = (Bhaskara) Naming.lookup("rmi://192.168.3.75:10833/Bhaskara");
            System.out.println(stub.calculate(a, b, c));
        } catch (Exception e) {
            System.err.println("Client ERROR: " + e.toString());
            e.printStackTrace();
        }
    }
}
