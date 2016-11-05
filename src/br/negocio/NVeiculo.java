package br.negocio;

import br.model.Acessorios;
import br.model.Veiculo;

public class NVeiculo {

	private Veiculo veiculo;
	
	public NVeiculo(){
		veiculo = new Veiculo();
	}
	
	public boolean adicionarVeiculo(Veiculo veiculo){
		
		//Implementar persistencia , e incluir Objeto veiculo
		
		return true;
	}
	
	public boolean removerVeiculo(Veiculo veiculo){
		
		//Implementar persistencia , e remover Objeto veiculo
		
		return true;
	}
	
	public boolean adicionarAcessorio(Acessorios acessorio){
		
		return this.veiculo.getAcessorio().add(acessorio);
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	
	
	
}
