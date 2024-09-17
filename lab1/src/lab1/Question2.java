package lab1;

/**
 *
 * @author Milan Create a frame as below illustrating the concept of Graphics2D.
 */
import javax.swing.*;
import java.awt.*;

public class Question2 extends JPanel {

    public static void main(String[] args) {
        JFrame f = new JFrame("lab 1");
        f.setSize(250, 250);

        f.getContentPane().setBackground(Color.white);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Question2 obj = new Question2();
        f.add(obj);
        f.setVisible(true);

    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.yellow);
        g2d.fillOval(10, 10, 200, 200);

        g2d.setColor(Color.BLACK);
        g2d.fillOval(55, 65, 30, 30);
        g2d.fillOval(135, 65, 30, 30);

        g2d.fillOval(50, 130, 120, 30);
        g2d.setColor(Color.yellow);
        g2d.fillOval(50, 130, 120, 26);

    }

}
