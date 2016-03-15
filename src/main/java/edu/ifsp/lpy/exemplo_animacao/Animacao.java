/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ifsp.lpy.exemplo_animacao;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Animacao extends JFrame implements KeyListener
{
    private Desenha desenha;
	 public void keyPressed(KeyEvent e) {
                if(e.getKeyCode()== KeyEvent.VK_RIGHT)
            desenha.moveRight();
        else if(e.getKeyCode()== KeyEvent.VK_LEFT)
            desenha.moveLeft();
        else if(e.getKeyCode()== KeyEvent.VK_DOWN)
            desenha.moveDown();
        else if(e.getKeyCode()== KeyEvent.VK_UP)
            desenha.moveUp();
    }
    public void keyReleased(KeyEvent e) {

    }
    public void keyTyped(KeyEvent e) {
    }
	

	public static void main(String args [])
	{	      
	 
	    javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Animacao  frame =  new Animacao ();		
                frame.setTitle("Square Move Practice");
                frame.setResizable(false);
                frame.setSize(600, 600);
                frame.setMinimumSize(new Dimension(600, 600));
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(frame.desenha);
                frame.pack();
                frame.setVisible(true);
            }
        });
	}

	Animacao ()
	{   this.desenha = new Desenha();
            addKeyListener(this);
            setFocusable(true);
            setFocusTraversalKeysEnabled(false);
	    Container container = getContentPane();
	    
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    setSize(400,400);
	    setTitle("Animação com JFrame");
	    setVisible(true);
	}
}
