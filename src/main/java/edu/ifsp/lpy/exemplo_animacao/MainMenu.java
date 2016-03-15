package edu.ifsp.lpy.exemplo_animacao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainMenu{

	public static void main(String[] args){

	final JFrame frame = new JFrame();
	frame.setPreferredSize(new Dimension(600,400));
	Container pane = frame.getContentPane();	
	pane.setLayout(new BoxLayout(pane,BoxLayout.Y_AXIS));
	final JButton btn = new JButton("ok");
	btn.setAlignmentX(Component.CENTER_ALIGNMENT);
	pane.add(btn);
	btn.addMouseListener(new MouseAdapter(){

	public void mousePressed(MouseEvent e){
	Animacao.main(null);
}});
	frame.pack();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLocationRelativeTo(null);
	frame.setVisible(true);

}};
