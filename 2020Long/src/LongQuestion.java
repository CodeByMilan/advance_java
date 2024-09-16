
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Milan
 */
public class LongQuestion  extends JFrame implements MouseListener{
JTextField t1, t2, t3;
    public LongQuestion(){
        
        JFrame f = new JFrame("exam Question");
        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout(FlowLayout.LEFT, 100, 10));

        t1 = new JTextField("20",30);
        t2 = new JTextField("10",30);
        t3 = new JTextField(30);
        
       

        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.addMouseListener(this);
        f.setVisible(true);

    }
    
    @Override
    public void mousePressed(MouseEvent e) {
       int num1 = Integer.parseInt(t1.getText()); 
       int num2 =Integer.parseInt(t2.getText());
       
      int sum = num1 + num2;
      t3.setText(""+sum);
      
    }

    @Override
    public void mouseReleased(MouseEvent e) {
         int num1 = Integer.parseInt(t1.getText()); 
       int num2 =Integer.parseInt(t2.getText());
       
      int diff = num1 - num2;
      t3.setText(""+diff); 
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 public static void main (String [] args){
     new LongQuestion();
 }

}
