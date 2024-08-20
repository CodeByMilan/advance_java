/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Milan
 */
import java.awt.*;
import javax.swing.*;

public class Question4 {
    public static void main (String[]args){
        JButton[] buttons;

        JFrame j = new JFrame("Calculator");
        j.setLayout(null); 
       
        JPanel p = new JPanel();
        p.setBounds(0, 0, 550, 80);
        JTextArea area = new JTextArea();
        area.setBounds(0, 0, 550, 100);
        j.add(area);

        JPanel jp1 = new JPanel();
        jp1.setBounds(0, 100, 550, 420);
        String[] button = {"7", "8", "9", "C", "4", "5", "6", "+", "3", "2", "1", "*", "0", "%", "/","="};
         buttons = new JButton[button.length];
        for (int i = 0; i < button.length; i++) {
            buttons[i] = new JButton(button[i]);
            jp1.add(buttons[i]);
        }
        
        jp1.setLayout(new GridLayout(4, 4));
        j.add(jp1);

        j.setSize(550, 550);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setVisible(true);
        
        
    }

}

    

