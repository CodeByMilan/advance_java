
import java.rmi.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Milan
 */
public interface RMIExample extends Remote{
    
      public int product(int a , int b) throws RemoteException;
      public String Reverse (String name) throws RemoteException;  
      public String ProvidedPrice(String ModelName) throws RemoteException;
      
          
}

