package br.negocio;

import br.model.Itinerario;

public class NItinerario {

	private Itinerario itinerario;
	
	public NItinerario(){
		itinerario = new Itinerario();
	}
	
	private float calcularDistancia(){
		
		//Adicionar uma API que calcula distancia
		
		return this.itinerario.getDistancia();
		
	}

	public Itinerario getItinerario() {
		return itinerario;
	}

	public void setItinerario(Itinerario itinerario) {
		this.itinerario = itinerario;
	}
	
	
	
}
