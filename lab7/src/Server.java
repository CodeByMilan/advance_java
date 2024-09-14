
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Milan
 */
public class Server {

    public static void main(String[] args) {
        try {
            RMIImplements obj = new RMIImplements();

            RMIExample skeleton = (RMIExample) UnicastRemoteObject.exportObject(obj, 0);
            Registry registry = LocateRegistry.getRegistry();
            registry.bind("price", skeleton);
            System.out.println("server ready ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
