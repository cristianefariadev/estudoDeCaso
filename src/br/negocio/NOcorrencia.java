package br.negocio;

import br.model.Ocorrencia;

public class NOcorrencia {

	private Ocorrencia ocorrencia;
	
	public NOcorrencia(){
		ocorrencia = new Ocorrencia();
	}
	
	public void registrarOcorrencia(Ocorrencia ocorrencia){
		//Implementar persistencia , e incluir Objeto ocorrencia
	}

	public Ocorrencia getOcorrencia() {
		return ocorrencia;
	}

	public void setOcorrencia(Ocorrencia ocorrencia) {
		this.ocorrencia = ocorrencia;
	}
	
	
	
}
