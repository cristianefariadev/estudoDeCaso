package br.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import br.model.Login;

public class LoginCtr implements ActionListener{

	private Login login;
	
	//++++++++++++++++++++++++++++++++++++++++++++++++++++
	// CONSTRUTOR
	public LoginCtr(){
		this.login = new Login();
	}
	
	//++++++++++++++++++++++++++++++++++++++++++++++++++++
	// METODOS QUE TRATA EVENTOS
	@Override
	public void actionPerformed(ActionEvent evento) {

		if(evento.getActionCommand().equals("btnLogar")){
			JOptionPane.showMessageDialog(null, "Botão Logar");
			autenticar();
		}
		if(evento.getActionCommand().equals("btnCancelar")){
			System.exit(0);
		}
	}
	//++++++++++++++++++++++++++++++++++++++++++++++++++++
	//METODOS
	public boolean autenticar(){
		return true;
	}
}
