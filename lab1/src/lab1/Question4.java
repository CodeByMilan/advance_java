package lab1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author Milan 
 * 4. WAP in Java to add following components on the frame: a.
 * JLabel displaying “First Swing Application” b. JCheckBox – to select subjects
 * you like c. JRadio Button- to select your favorite Subject d. JComboBox to
 * select your interest e. JButton to submit data
 *
 * Also use actionListener for button and display the selected data using a
 * JOptionPane.
 */
public class Question4 {

    public static void main(String[] args) {
        JCheckBox c1,c2,c3;
        JRadioButton r1,r2,r3;
        JComboBox jc ;
        JButton b;
        
        
        JFrame f = new JFrame("Lab1:form ");
        f.setSize(500, 500);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel l = new JLabel("Normal Java Swing Apllication");
        l.setBounds(100, 0, 500, 20);
        f.add(l);

        JPanel p1 = new JPanel();
        p1.setBounds(10, 20, 500, 40);
        JLabel l1 = new JLabel("Choose Subjects You Like :");
        l1.setBounds(10, 20, 100, 20);
        p1.add(l1);

         c1 = new JCheckBox("Java");
        c1.setBounds(130, 20, 10, 10);
        p1.add(c1);

         c2 = new JCheckBox("DSA");
        c2.setBounds(145, 20, 10, 10);
        p1.add(c2);

        c3 = new JCheckBox("Web Tech");
        c3.setBounds(160, 20, 10, 10);
        p1.add(c3);

        f.add(p1);

        JPanel p2 = new JPanel();
        p2.setBounds(0, 60, 500, 40);
        JLabel l2 = new JLabel("Choose Your Best Subjects:");
        l2.setBounds(10, 100, 100, 20);
        p2.add(l2);

         r1 = new JRadioButton("java");
        r1.setBounds(130, 100, 10, 10);
        p2.add(r1);

         r2 = new JRadioButton("DSA");
        r2.setBounds(145, 100, 10, 10);
        p2.add(r2);

        r3= new JRadioButton("Web Tech");
        r3.setBounds(160, 100, 10, 10);
        p2.add(r3);

        ButtonGroup g = new ButtonGroup();
        g.add(r1);
        g.add(r2);
        g.add(r3);

        f.add(p2);
        JLabel l3 = new JLabel("Select Your Interest:");
        l3.setBounds(50, 110, 150, 50);
        f.add(l3);
        String[] interest= {"Reading" , "Coding" , "Playing" , "Dancing"};
        
        jc = new JComboBox(interest);
        jc.setBounds(190, 110, 100, 50);
        f.add(jc);
         b = new JButton("Submit");
        b.setBounds(240, 200, 50, 20);
        f.add(b);

        f.setVisible(true);
        
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                JOptionPane.showMessageDialog(null, "Details you have choosen:", "Submited Details" , JOptionPane.PLAIN_MESSAGE);
            }
        });

    }

}
