/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ifsp.lpy.exemplo_animacao;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author andreani
 */
public class Bola implements Desenho{
    
    Raquete r1;
    Raquete r2;
    Mesa mesa;
    float x=0,y=50;
    int direcaoY=1;
    int direcaoX=1;
    
    public Bola(Raquete r1, Raquete r2,Mesa mesa){
        this.r1=r1;
        this.r2=r2;
        this.mesa = mesa;
    }

    @Override
    public void desenha(Graphics g) {
        g.setColor(Color.BLACK); 
       g.drawRect((int)x,(int)y, 50, 50);
        g.fillRect((int)x, (int)y, 50, 50);
         
       
    }
    
    
    void move(){
    
        if (y>mesa.maxY)
           direcaoY=-1;
                    
        
        if (y<mesa.minY)
            direcaoY=1;
    
        
        
        
        
        if (x>mesa.maxX)
           direcaoX=-1;
                    
        
        if (x<mesa.minX)
            direcaoX=1;
    
        y+=direcaoY;
        x+=direcaoX;
        
    }
   
}
