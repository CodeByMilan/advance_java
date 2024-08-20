package lab1;

/**
 *
 * @author Milan 
 * 3. Ilustrate the concept of Layout Management in Java Swing.
 * Hint: Add components in a frame with different layouts
 */
import javax.swing.*;
import java.awt.*;

public class Question3 {

    public static void main(String[] args) {
      
        JFrame f = new JFrame("Lab 1");
       f.setSize(800, 600);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       //this is for the whole frame layout
       f.setLayout(new BorderLayout(10, 10)); 

        // BorderLayout Panel
        JPanel p = new JPanel(new BorderLayout(5, 5));
        p.setBorder(BorderFactory.createTitledBorder("BorderLayout"));
        p.add(new JButton("North"), BorderLayout.NORTH);
        p.add(new JButton("South"), BorderLayout.SOUTH);
        p.add(new JButton("East"), BorderLayout.EAST);
        p.add(new JButton("West"), BorderLayout.WEST);
        p.add(new JButton("Center"), BorderLayout.CENTER);

        // FlowLayout Panel
        JPanel fp = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        fp.setBorder(BorderFactory.createTitledBorder("FlowLayout"));
        fp.add(new JButton("Button 1"));
        fp.add(new JButton("Button 2"));
        fp.add(new JButton("Button 3"));
        fp.add(new JButton("Button 4"));

        // BoxLayout Panel 
        JPanel bp = new JPanel();
        bp.setLayout(new BoxLayout(bp, BoxLayout.Y_AXIS));
        bp.setBorder(BorderFactory.createTitledBorder("BoxLayout"));
        bp.add(new JButton("Button A"));
        bp.add(new JButton("Button B"));
        bp.add(new JButton("Button C"));

        // GridLayout Panel
        JPanel gp = new JPanel(new GridLayout(2, 2, 10, 10));
        gp.setBorder(BorderFactory.createTitledBorder("GridLayout"));
        gp.add(new JButton("Button 1"));
        gp.add(new JButton("Button 2"));
        gp.add(new JButton("Button 3"));
        gp.add(new JButton("Button 4"));

        //adding every layout in the boder main layout in frame 
       f.add(p, BorderLayout.NORTH);
       f.add(fp, BorderLayout.WEST);
       f.add(bp, BorderLayout.CENTER);
       f.add(gp, BorderLayout.SOUTH);

        
       f.setVisible(true);
    }

}
