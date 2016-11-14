package br.control;



import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class ListLocacaoCtr implements ActionListener {

	JPanel Root;
	
	public ListLocacaoCtr(JPanel painelRoot){
		this.Root = painelRoot;
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		
		CardLayout card = (CardLayout)Root.getLayout();
		if(evento.getActionCommand().equals("Associado"))
			card.show(this.Root,"cardAssociado");
		if(evento.getActionCommand().equals("Vendas"))
			card.show(this.Root,"cardVendas");
		
	}
	

}
