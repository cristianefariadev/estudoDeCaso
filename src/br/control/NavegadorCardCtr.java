/**
 * <p>
 * <b>Title:</b> NavegadorCardCtr.java
 * </p>
 * 
 * <p>
 * <b>Description:</b>
 * </p>	
 * 	
 * @author Cristiane Faria - cristiane.trc@gmail.com
 * 
 * @version 1.0.0
 */

package br.control;

import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JPanel;

 public class NavegadorCardCtr implements ActionListener{
	private JPanel PanelCardLayout;
	private CardLayout card;
	
	public NavegadorCardCtr(JPanel painelCardLayout, CardLayout card){
		this.PanelCardLayout = painelCardLayout;
		this.card = card;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
		
		if(e.getActionCommand().equals("Home"))
			card.show(this.PanelCardLayout,"cardHome");
		
		if(e.getActionCommand().equals("Cliente"))
			card.show(this.PanelCardLayout,"cardClientes");
		
		if(e.getActionCommand().equals("Veiculo"))
			card.show(this.PanelCardLayout,"cardVeiculos");
		
		if(e.getActionCommand().equals("Loca\u00E7\u00E3o"))
			card.show(this.PanelCardLayout,"cardLocacao");
		
		if(e.getActionCommand().equals("Devolu\u00E7\u00E3o"))
			card.show(this.PanelCardLayout,"cardDevolucao");
		
		if(e.getActionCommand().equals("Caixa"))
			card.show(this.PanelCardLayout,"cardPagamento");
		
		if(e.getActionCommand().equals("Sair"))
			System.exit(0);
		
	}
	


}
