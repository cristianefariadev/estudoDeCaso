package br.negocio;

import br.model.Caixa;

/**
 * <p>
 * <b>Title:</b> NCaixa.java
 * </p>
 * 
 * <p>
 * <b>Description:</b>
 * </p>	
 * 	
 * <p>	
 * <b>Company: </b> CristiianeFaria LTDA
 * </p>	
 * 	
 * @author Cristiane Faria - cristiane.trc@gmail.com
 * 
 * @version 1.0.0
 */
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

	public void setCaixa(Caixa caixa) {
		this.caixa = caixa;
	}
	
	
	
}
