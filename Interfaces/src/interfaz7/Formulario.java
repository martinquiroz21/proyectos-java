package interfaz7;

import javax.swing.*;

import javax.swing.event.*;

import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener, ChangeListener {
	
	private JLabel label;
	private JCheckBox check;
	private JButton boton;
	
	public Formulario() {
		setLayout(null);
		
		label = new JLabel("Aceptar terminos y condiciones");
		label.setBounds(10, 10, 400, 30);
		add(label);
		
		check = new JCheckBox("Acepto");
		check.setBounds(10, 50, 100, 30);
		add(check);
		check.addChangeListener(this);
		
		boton = new JButton("Continuar");
		boton.setBounds(10, 100, 100, 30);
		add(boton);
		boton.addActionListener(this);
		boton.setEnabled(false);
	}
	
	public void stateChanged(ChangeEvent evento) {
		if(check.isSelected() == true) {
			boton.setEnabled(true);
		}
		else {
			boton.setEnabled(false);
		}
	}
	
	public void actionPerformed(ActionEvent evento) {
		
		if(evento.getSource() == boton) {
			System.exit(0);
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
