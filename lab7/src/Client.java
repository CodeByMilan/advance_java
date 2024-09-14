
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Milan
 */
public class Client {

    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry();

            RMIExample stub = (RMIExample) registry.lookup("price");

            String price = stub.ProvidedPrice("Mac");
            int result = stub.product(10, 10);
            String reverseString = stub.Reverse("Milan");

            System.out.println("price =" + price);
            System.out.println("the product of two number is :" + result);
            System.out.println("the reverse string of the provide string is :" + reverseString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
