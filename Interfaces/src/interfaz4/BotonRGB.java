package interfaz4;

import javax.swing.*;

import java.awt.event.*;

import java.awt.*;

public class BotonRGB extends JFrame implements ActionListener {
	
	private JLabel label1, label2, label3;
	private JComboBox combo1, combo2, combo3;
	private JButton boton;
	
	public BotonRGB() {
		setLayout(null);
		// 1.
		label1 = new JLabel("RoJo:");
		label1.setBounds(10, 10, 100, 10);
		add(label1);
		
		combo1 = new JComboBox();
		combo1.setBounds(120, 10, 50, 30);
		for (int i = 0; i <= 255; i++) {
			combo1.addItem(String.valueOf(i));
		}
		add(combo1);
		// 2.
		label2 = new JLabel("Verde:");
		label2.setBounds(10, 50, 100, 10);
		add(label2);
		
		combo2 = new JComboBox();
		combo2.setBounds(120, 50, 50, 30);
		for (int i = 0; i <= 255; i++) {
			combo2.addItem(String.valueOf(i));
		}
		add(combo2);
		// 3.
		label3 = new JLabel("Azul:");
		label3.setBounds(10, 90, 100, 10);
		add(label3);
		
		combo3 = new JComboBox();
		combo3.setBounds(120, 90, 50, 30);
		for (int i = 0; i <= 255; i++) {
			combo3.addItem(String.valueOf(i));
		}
		add(combo3);
		// Boton
		boton = new JButton("Fijar color");
		boton.setBounds(10, 130, 100, 30);
		add(boton);
		boton.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent evento) {
		
		if(evento.getSource() == boton) {
			String cadena1 = combo1.getSelectedItem().toString();
			String cadena2 = combo2.getSelectedItem().toString();
			String cadena3 = combo3.getSelectedItem().toString();
			
			int rojo = Integer.parseInt(cadena1);
			int verde = Integer.parseInt(cadena2);
			int azul = Integer.parseInt(cadena3);
			
			Color color = new Color(rojo, verde, azul);
			boton.setBackground(color);
		}
	}
	
	public static void main(String[] args) {
		
		BotonRGB botonRGB = new BotonRGB();
		botonRGB.setBounds(0, 0, 200, 220);
		botonRGB.setVisible(true);
		botonRGB.setResizable(false);
		botonRGB.setLocationRelativeTo(null);
	}

}
