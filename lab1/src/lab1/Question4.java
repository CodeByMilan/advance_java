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
public class Question4 extends JFrame implements ActionListener {

    JCheckBox c1, c2, c3;
    JRadioButton r1, r2, r3;
    JComboBox jc;
    JButton b;
    ButtonGroup g;

    public Question4() {
        JFrame f = new JFrame("Lab1:form ");
        f.setSize(500, 500);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel l = new JLabel("Normal Java Swing Apllication");
        l.setBounds(100, 0, 500, 20);
        f.add(l);
//panel 1
        JPanel p1 = new JPanel();
        p1.setBounds(10, 20, 500, 40);
        JLabel l1 = new JLabel("Choose Subjects You Like :");
        l1.setBounds(10, 20, 100, 20);
        p1.add(l1);
//checkbox
        c1 = new JCheckBox("Java");
        c1.setBounds(130, 20, 10, 10);
        c1.addActionListener(this);
        p1.add(c1);

        c2 = new JCheckBox("DSA");
        c2.setBounds(145, 20, 10, 10);
        c2.addActionListener(this);
        p1.add(c2);

        c3 = new JCheckBox("Web Tech");
        c3.setBounds(160, 20, 10, 10);
        c3.addActionListener(this);
        p1.add(c3);

        f.add(p1);

        //panel 2
        JPanel p2 = new JPanel();
        p2.setBounds(0, 60, 500, 40);
        JLabel l2 = new JLabel("Choose Your Best Subjects:");
        l2.setBounds(10, 100, 100, 20);
        p2.add(l2);
//radio buttons
        r1 = new JRadioButton("java");
        r1.setBounds(130, 100, 10, 10);
        r1.addActionListener(this);
        p2.add(r1);

        r2 = new JRadioButton("DSA");
        r2.setBounds(145, 100, 10, 10);
        r2.addActionListener(this);
        p2.add(r2);

        r3 = new JRadioButton("Web Tech");
        r3.setBounds(160, 100, 10, 10);
        r3.addActionListener(this);
        p2.add(r3);

        ButtonGroup g = new ButtonGroup();
        g.add(r1);
        g.add(r2);
        g.add(r3);

        f.add(p2);
        JLabel l3 = new JLabel("Select Your Interest:");
        l3.setBounds(50, 110, 150, 50);
        f.add(l3);

        //jcombobox
        String[] interest = {"Reading", "Coding", "Playing", "Dancing"};

        jc = new JComboBox(interest);
        jc.setBounds(190, 110, 100, 50);
        jc.addActionListener(this);
        f.add(jc);

        //button
        b = new JButton("Submit");
        b.setBounds(240, 200, 50, 20);
        b.addActionListener(this);
        f.add(b);

        f.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {

            StringBuilder LikedSubject = new StringBuilder();
            if (c1.isSelected()) {
                LikedSubject.append("Java ");
            }
            if (c2.isSelected()) {
                LikedSubject.append("DSA ");
            }
            if (c3.isSelected()) {
                LikedSubject.append("Web Tech ");
            }
            String LikedSubjects = LikedSubject.toString().trim();

            String MostLikedSubject = "Not selected";

            if (r1.isSelected()) {
                MostLikedSubject = "java";
            } else if (r2.isSelected()) {
                MostLikedSubject = "DSA";

            } else if (r3.isSelected()) {
                MostLikedSubject = "Web Tech";
            }

            String Interested = jc.getSelectedItem().toString();

            JOptionPane.showMessageDialog(this,
                    "Subjects liked By User: " + LikedSubjects + "\n"
                    + "Subject Most Liked By User: " + MostLikedSubject + "\n"
                    + "User is Interested In: " + Interested,
                    "Details Submited ",
                    JOptionPane.PLAIN_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new Question4();

    }
}
