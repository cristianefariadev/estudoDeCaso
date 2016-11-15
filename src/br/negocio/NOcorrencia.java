package br.negocio;

import java.util.ArrayList;
import java.util.List;

import br.model.Cliente;
import br.model.Ocorrencia;

public class NOcorrencia {

	private Ocorrencia ocorrencia;
	
	public NOcorrencia(){
		ocorrencia = new Ocorrencia();
	}
	
	public void registrarOcorrencia(Ocorrencia ocorrencia){
		//Implementar persistencia , e incluir Objeto ocorrencia
	}
	

	
	public void alterar(){
		
	}
	
	public void excluir(int id){
		
	}
	
	public Ocorrencia consultar(int id){
		return new Ocorrencia();
	}
	
	public List<Ocorrencia> listar(String texto){
		
		return new ArrayList<Ocorrencia>();
	}

	public Ocorrencia getOcorrencia() {
		return ocorrencia;
	}

	public void setOcorrencia(Ocorrencia ocorrencia) {
		this.ocorrencia = ocorrencia;
	}
	
	
	
}
