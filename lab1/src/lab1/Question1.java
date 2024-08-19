
package lab1;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Milan
 */
public class Question1 {
   public static void main(String[] args) {
        /* Write a Java swing program to display a frame.
        Set the background color of frame to CYAN and use setdefaultCloseOperation() method.
*/
        JFrame f = new JFrame("lab 1");
        f.setSize(500, 500);

        f.getContentPane().setBackground(Color.CYAN);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }
    
}
