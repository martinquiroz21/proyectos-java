package interfaz3;

import javax.swing.*;

import java.awt.event.*;

public class Calculadora extends JFrame implements ActionListener {
	
	private JTextField textField1, textField2;
	private JLabel label1, label2, label3;
	private JButton boton1, boton2, boton3, boton4;
	
	public Calculadora() {
		setLayout(null);
		setTitle("Calculadora");
		
		label1 = new JLabel("Valor 1:");
		label1.setBounds(50, 5, 60, 30);
		add(label1);
		
		label2 = new JLabel("Valor 2:");
		label2.setBounds(210, 5, 60, 30);
		add(label2);
		
		label3 = new JLabel("Resultado:");
		label3.setBounds(30, 130, 300, 30);
		add(label3);
		
		textField1 = new JTextField();
		textField1.setBounds(110, 10, 70, 20);
		add(textField1);
		
		textField2 = new JTextField();
		textField2.setBounds(270, 10, 70, 20);
		add(textField2);
		
		boton1 = new JButton("Sumar");
		boton1.setBounds(10, 70, 90, 30);
		add(boton1);
		boton1.addActionListener(this);
		
		boton2 = new JButton("Restar");
		boton2.setBounds(110, 70, 90, 30);
		add(boton2);
		boton2.addActionListener(this);
		
		boton3 = new JButton("Multiplicar");
		boton3.setBounds(210, 70, 90, 30);
		add(boton3);
		boton3.addActionListener(this);
		
		boton4 = new JButton("Dividir");
		boton4.setBounds(310, 70, 90, 30);
		add(boton4);
		boton4.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent evento) {
		int valor1 = 0, valor2 = 0, resultado = 0;
		
		if(evento.getSource() == boton1) {
			valor1 = Integer.parseInt(textField1.getText());
			valor2 = Integer.parseInt(textField2.getText());
			
			resultado = valor1 + valor2;
			
			label3.setText("Resultado: " + resultado);
		}
		if(evento.getSource() == boton2) {
			valor1 = Integer.parseInt(textField1.getText());
			valor2 = Integer.parseInt(textField2.getText());
			
			resultado = valor1 - valor2;
			
			label3.setText("Resultado: " + resultado);
		}
		if(evento.getSource() == boton3) {
			valor1 = Integer.parseInt(textField1.getText());
			valor2 = Integer.parseInt(textField2.getText());
			
			resultado = valor1 * valor2;
			
			label3.setText("Resultado: " + resultado);
		}
		if(evento.getSource() == boton4) {
			valor1 = Integer.parseInt(textField1.getText());
			valor2 = Integer.parseInt(textField2.getText());
			
			resultado = valor1 / valor2;
			
			label3.setText("Resultado: " + resultado);
		}
	}
	
	public static void main(String[] args) {
		
		Calculadora form = new Calculadora();
		form.setBounds(0, 0, 430, 220);
		form.setVisible(true);
		form.setResizable(false);
		form.setLocationRelativeTo(null);
	}

}
