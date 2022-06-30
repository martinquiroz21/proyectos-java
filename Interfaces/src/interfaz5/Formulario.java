package interfaz5;

import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener {
	
	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem menuItem1, menuItem2, menuItem3;
	
	public Formulario() {
		setLayout(null);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		menu = new JMenu("Opciones");
		menuBar.add(menu);
		
		menuItem1 = new JMenuItem("Rojo");
		menuItem1.addActionListener(this);
		menu.add(menuItem1);
		
		menuItem2 = new JMenuItem("Verde");
		menuItem2.addActionListener(this);
		menu.add(menuItem2);
		
		menuItem3 = new JMenuItem("Azul");
		menuItem3.addActionListener(this);
		menu.add(menuItem3);
	}
	
	public void actionPerformed(ActionEvent evento) {
		Container fondo = this.getContentPane();
		
		if(evento.getSource() == menuItem1) {
			fondo.setBackground(new Color(255, 0, 0));
		}
		if(evento.getSource() == menuItem2) {
			fondo.setBackground(new Color(0, 255, 0));
		}
		if(evento.getSource() == menuItem3) {
			fondo.setBackground(new Color(0, 0, 255));
		}
	}
	
	public static void main(String[] args) {
		
		Formulario form = new Formulario();
		form.setBounds(0, 0, 400, 300);
		form.setVisible(true);
		form.setLocationRelativeTo(null);
	}

}
