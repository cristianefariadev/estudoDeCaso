package br.negocio;

import br.model.Caixa;

public class NCaixa {

	private Caixa caixa;
	
	public NCaixa(){
		caixa = new Caixa();
	}
	
	
	public float atualizarSaldo(){
		float retorno = 0;
		
		//inserir aqui codigo que atualiza Saldo
		
		return retorno;
	}

	public Caixa getCaixa() {
		return caixa;
	}
/**
 * 
 * Método responsável por
 *
 * @author Cristiane Faria - cristiane.trc@gmail.com
 *
 * @param caixa
 */
	public void setCaixa(Caixa caixa) {
		this.caixa = caixa;
	}
	
	
	
}
