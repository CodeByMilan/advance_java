import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.beans.EventSetDescriptor;
import java.beans.MethodDescriptor;
import java.beans.IntrospectionException;
import java.lang.reflect.Method;

public class BeanIntrospectionExample {
    //basic concept here is just create  mybean class which contains getter,setter,method and eventlistener method 
    //create object in main class and diaplay all methods properties and events
    
    public static void main(String[] args) {
        try {
         
            MyBean myBean = new MyBean();

            
            BeanInfo beanInfo = Introspector.getBeanInfo(MyBean.class);

            
            System.out.println("Properties:");
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor pd : propertyDescriptors) {
                System.out.println("Property Name: " + pd.getName());
                System.out.println("Read Method: " + pd.getReadMethod());
                System.out.println("Write Method: " + pd.getWriteMethod());
                System.out.println();
            }

            
            System.out.println("Events:");
            EventSetDescriptor[] eventSetDescriptors = beanInfo.getEventSetDescriptors();
            for (EventSetDescriptor esd : eventSetDescriptors) {
                System.out.println("Event Set Name: " + esd.getName());
                System.out.println("Event Listener Type: " + esd.getListenerType());
                Method[] listenerMethods = esd.getListenerMethods();
                for (Method method : listenerMethods) {
                    System.out.println("Listener Method: " + method);
                }
                System.out.println();
            }

           
            System.out.println("Methods:");
            MethodDescriptor[] methodDescriptors = beanInfo.getMethodDescriptors();
            for (MethodDescriptor md : methodDescriptors) {
                System.out.println("Method Name: " + md.getName());
                System.out.println("Method: " + md.getMethod());
                System.out.println();
            }

        } catch (IntrospectionException e) {
            e.printStackTrace();
        }
    }
}

class MyBean {
    private String name;
    private int age;

  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

 
    public void doSomething() {
        System.out.println("Doing something...");
    }

    public void addMyBeanListener(MyBeanListener listener) {
        
    }

    public void removeMyBeanListener(MyBeanListener listener) {
        
    }
}

interface MyBeanListener {
    void onEvent();
}
