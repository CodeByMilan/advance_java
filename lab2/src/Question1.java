import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

public class Question1 {

   
    public static class MouseKeyListener extends JFrame implements MouseListener {

        public MouseKeyListener() {
            this.setTitle("Mouse Event Listener");
            this.setSize(500, 500);
            this.addMouseListener(this);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setVisible(true);
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("Mouse clicked");
        }

        @Override
        public void mousePressed(MouseEvent e) {
            System.out.println("Mouse pressed");
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            System.out.println("Mouse released");
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            System.out.println("Mouse entered");
        }

        @Override
        public void mouseExited(MouseEvent e) {
            System.out.println("Mouse exited");
        }
    }

  
    public static class WindowKeyListener extends JFrame implements WindowListener {

        public WindowKeyListener() {
            this.setTitle("Window Event Listener");
            this.setSize(500, 500);
            this.addWindowListener(this);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setVisible(true);
        }

        @Override
        public void windowOpened(WindowEvent e) {
            System.out.println("Window opened");
        }

        @Override
        public void windowClosing(WindowEvent e) {
            System.out.println("Window is closing");
        }

        @Override
        public void windowClosed(WindowEvent e) {
            System.out.println("Window closed");
        }

        @Override
        public void windowIconified(WindowEvent e) {
            System.out.println("Window iconified");
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            System.out.println("Window deiconified");
        }

        @Override
        public void windowActivated(WindowEvent e) {
            System.out.println("Window activated");
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
            System.out.println("Window deactivated");
        }
    }

 
    public static class KeyEventListener extends JFrame implements KeyListener {

        public KeyEventListener() {
            this.setTitle("Key Event Listener");
            this.setSize(500, 500);
            this.addKeyListener(this);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setVisible(true);
        }

        @Override
        public void keyTyped(KeyEvent e) {
            System.out.println("Key typed");
        }

        @Override
        public void keyPressed(KeyEvent e) {
            System.out.println("Key pressed");
        }

        @Override
        public void keyReleased(KeyEvent e) {
            System.out.println("Key released");
        }
    }

    public static void main(String[] args) {
        /*Note:
        in order to see each event output call one by one and see the changes 
        if you run all at once than you will be only able to see keyeventlistener    
        */
        new MouseKeyListener();
        new WindowKeyListener();
        new KeyEventListener();
    }
}
