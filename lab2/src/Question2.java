
/**
 *
 * @author Milan
 */
import java.awt.*;
import javax.swing.*;

public class Question2 {

    public static void main(String[] args) {
        JFrame jf = new JFrame("Menu Example ");
        jf.setSize(500, 500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);
        JMenuBar m = new JMenuBar();
        m.setBounds(0, 0, 500, 20);
        JMenu m1 = new JMenu("file");
        JMenu m2 = new JMenu("tools");

        JMenuItem jm1 = new JMenuItem("open");
        JMenuItem jm2 = new JMenuItem("save");
        JMenuItem jm3 = new JMenuItem("exit");
        JMenu jm4 = new JMenu("load");
        JMenuItem jm11 = new JMenuItem("load from site");
        JMenuItem jm12 = new JMenuItem("load from device");

        m1.add(jm1);
        m1.add(jm2);
        m1.add(jm3);
        m1.add(jm4);
        jm4.add(jm11);
        jm4.add(jm12);

        m.add(m1);
        m.add(m2);
        jf.add(m);

        jf.setResizable(false);
        jf.setVisible(true);

        /*
         jm1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(jf, "You clicked 'Open'");
            }
        });
        
         */
        // next way of handiling simple actions using lamda expression
        jm1.addActionListener(e -> JOptionPane.showMessageDialog(jf, "You clicked 'Open'"));
        jm2.addActionListener(e -> JOptionPane.showMessageDialog(jf, "You clicked 'Save'"));
        jm3.addActionListener(e -> {
            JOptionPane.showMessageDialog(jf, "You clicked 'Exit'");
            System.exit(0);
        });
        jm11.addActionListener(e -> JOptionPane.showMessageDialog(jf, "You clicked 'Load from Site'"));
        jm12.addActionListener(e -> JOptionPane.showMessageDialog(jf, "You clicked 'Load from Device'"));

    }
}
