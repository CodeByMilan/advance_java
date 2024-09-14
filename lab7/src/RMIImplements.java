
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Milan
 */
public class RMIImplements implements RMIExample{
     private Map<String,String> prices ;
    public RMIImplements(){
        prices=new HashMap<>();
        prices.put("DEll","1000000");
        prices.put("HP","1200000");
        prices.put("Mac","1300000");
    }

    @Override
    public String ProvidedPrice(String ModelName) throws RemoteException {
        return prices.get(ModelName);
    }

    @Override
    public int product(int a, int b) throws RemoteException {
       return a*b;  
    }

    @Override
    public String Reverse(String name) throws RemoteException {
        StringBuilder sb = new StringBuilder(name);
        sb.reverse();
        return sb.toString();
    }
    
    
}
