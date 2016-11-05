package br.negocio;

import br.model.Frota;

public class NFrota {
	
	private Frota frota;
	
	public NFrota(){
	
		frota = new Frota();
	}
	
	public void atualizarFrota(){
		frota.setQuantidade(frota.getQuantidade()+1);
	}

	public Frota getFrota() {
		return frota;
	}

	public void setFrota(Frota frota) {
		this.frota = frota;
	}
	
	
	
}
