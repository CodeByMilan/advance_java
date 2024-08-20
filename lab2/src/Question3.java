


import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class Question3 extends MouseMotionAdapter{
    JFrame f;
    
   public Question3(){
    f= new JFrame("Draw Anything by Dragging Mouse");
    
    f.setSize(1000, 1000);
    f.setLayout(null);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.addMouseMotionListener(this);
    f.setVisible(true);
    
   }

   @Override
   public void mouseDragged(MouseEvent e){
       Graphics g=f.getGraphics();
       g.setColor(Color.red);
       g.fillOval(e.getX(),e.getY(),20,20);
   }
   
    public static void main(String[] args) {
       Question3 ax = new Question3();
    }
    
}
