package br.negocio;

import br.model.Locacao;
import br.model.Ocorrencia;

public class NLocacao {

	private Locacao locacao;
	
	public NLocacao(){
		locacao = new Locacao();
	}
	
	public float calcularSubTotal(){
		float retorno = 0;
		
		//calculo subTotal
		
		return retorno;
	}
	
	public boolean addOcorrencia(Ocorrencia ocorrencia){
		
		return this.locacao.getOcorrerncia().add(ocorrencia);
	}
	
	public boolean delOcorrencia(Ocorrencia ocorrencia){
		
		return this.locacao.getOcorrerncia().remove(ocorrencia);
	}

	public Locacao getLocacao() {
		return locacao;
	}

	public void setLocacao(Locacao locacao) {
		this.locacao = locacao;
	}
	
	
	
}
