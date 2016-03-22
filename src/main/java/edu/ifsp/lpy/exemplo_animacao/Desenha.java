/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ifsp.lpy.exemplo_animacao;

/**
 *
 * @author andreani
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;
import javax.swing.Timer;

public class Desenha extends JComponent {

    Mesa mesa = new Mesa();
    Raquete r1= new Raquete();
    Raquete r2= new Raquete();
    Bola bola=new Bola(r1,r2,mesa);
    
    public int x = 50;
    public int y = 50;
    public int f 	= 1;	//Start Drawing from X=10	
    public int delay 	= 50; 	//milliseconds
    public void paintComponent(  Graphics g) {
        super.paintComponent(g);

        
                
                bola.move();
                bola.desenha(g);
        
                
        ActionListener counter = new ActionListener() {
        public void actionPerformed(ActionEvent evt) 
        {
//       g.drawRect((int)x,(int)y, 50, 50);
//        g.fillRect((int)x, (int)y, 50, 50);
//        
              
              repaint();
              f++;
        }};
         new Timer(delay, counter).start();
    }

    public void moveRight() {
        x = x + 5;
        repaint();
    }

    public void moveLeft() {
        x = x - 5;
        repaint();
    }

    public void moveDown() {
        y = y + 5;
        repaint();
    }

    public void moveUp() {
        y = y - 5;
        repaint();
    }
}