package br.negocio;

import java.util.ArrayList;
import java.util.List;

import br.model.Locacao;
import br.model.Ocorrencia;
import br.model.Veiculo;

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
	
	public void salvar(){
		
	}
	
	public void alterar(){
		
	}
	
	public void excluir(int id){
		
	}
	
	public Locacao consultar(int id){
		return new Locacao();
	}
	
	public List<Locacao> listar(String texto){
		
		return new ArrayList<Locacao>();
	}
	
	
	
}
