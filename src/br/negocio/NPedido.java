package br.negocio;

import br.model.Locacao;
import br.model.Pedido;

public class NPedido {

	private Pedido pedido;
	
	public NPedido(){
		pedido = new Pedido();
	}
	
	public float calcularTotal(){
		float retorno = 0;
		
		//inserir aqui calculo do total
		
		return retorno;
	}
	
	public boolean fecharPedido(){
		
		//inserir aqui codigo para fechar pedido
		
		return true;
	}
	
	public boolean cancelarPedido(){
		
		//inserir aqui codigo para cancelar pedido
		
		return true;
	}
	
	public boolean abrirPedido(){
		
		//inserir aqui codigo para abrir pedido
		
		return true;
	}
	
	public boolean addLocacao(Locacao locacao){
		
		return this.pedido.getLocacao().add(locacao);
	}
	
	public boolean delLocacao(Locacao locacao){
		
		return this.pedido.getLocacao().remove(locacao);
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	

}
