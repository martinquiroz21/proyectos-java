package interfaz2;

import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener {
	
	private JTextField textField;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JButton boton;
	private String texto = "";
	
	public Formulario() {
		setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 10, 200, 30);
		add(textField);
		
		boton = new JButton("Agregar");
		boton.setBounds(250, 10, 100, 30);
		add(boton);
		boton.addActionListener(this);
		
		textArea = new JTextArea();
		scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(10, 50, 400, 300);
		add(scrollPane);
	}
	
	public void actionPerformed(ActionEvent evento) {
		
		if(evento.getSource() == boton) {
			texto += textField.getText() + "\n";
			textArea.setText(texto);
			textField.setText("");
		}
	}
	
	public static void main(String[] args) {
		
		Formulario form = new Formulario();
		form.setBounds(0, 0, 540, 400);
		form.setVisible(true);
		form.setResizable(false);
		form.setLocationRelativeTo(null);
		
	}

}
