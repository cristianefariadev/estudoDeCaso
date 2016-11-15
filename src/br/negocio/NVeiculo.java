package br.negocio;

import java.util.ArrayList;
import java.util.List;

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
		
		return this.veiculo.getAcessorios().add(acessorio);
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	
	public void salvar(){
		
	}
	
	public void alterar(){
		
	}
	
	public void excluir(int id){
		
	}
	
	public Veiculo consultar(int id){
		return new Veiculo();
	}
	
	public List<Veiculo> listar(String texto){
		
		return new ArrayList<Veiculo>();
	}
	
	
	
}
