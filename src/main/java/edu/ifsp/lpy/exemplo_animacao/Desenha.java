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

    public int x = 50;
    public int y = 50;
    public int f 	= 10;	//Start Drawing from X=10	
    public int delay 	= 50; 	//milliseconds
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(x, y, 50, 50);
        g.fillRect(x, y, 50, 50);
        g.setColor(Color.BLACK);
        ActionListener counter = new ActionListener() {
        public void actionPerformed(ActionEvent evt) 
        { 
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