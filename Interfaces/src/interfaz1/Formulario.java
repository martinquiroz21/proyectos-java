package interfaz1;

import javax.swing.*;

import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener {
	
	private JButton boton1, boton2, boton3;
	private JLabel label;
	
	public Formulario() {
		setLayout(null);
		// Boton1
		boton1 = new JButton("1");
		boton1.setBounds(10, 100, 90, 30);
		add(boton1);
		boton1.addActionListener(this);
		// Boton2
		boton2 = new JButton("2");
		boton2.setBounds(110, 100, 90, 30);
		add(boton2);
		boton2.addActionListener(this);
		// Boton3
		boton3 = new JButton("3");
		boton3.setBounds(210, 100, 90, 30);
		add(boton3);
		boton3.addActionListener(this);
		// Label
		label = new JLabel("En espera..");
		label.setBounds(10, 10, 300, 30);
		add(label);
	}
	
	public void actionPerformed(ActionEvent evento) {
		
		if(evento.getSource() == boton1) {
			label.setText("Has presionado el botón 1");
		}
		if(evento.getSource() == boton2) {
			label.setText("Has presionado el botón 2");
		}
		if(evento.getSource() == boton3) {
			label.setText("Has presionado el botón 3");
		}
	}
	
	public static void main(String[] args) {
		
		Formulario form = new Formulario();
		form.setBounds(0, 0, 350, 200);
		form.setVisible(true);
		form.setResizable(false);
		form.setLocationRelativeTo(null);
	}

}
