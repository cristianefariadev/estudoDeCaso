package br.model;

public class Itinerario {

	private long id;
	private Localizacao locOrigim;
	private Localizacao locDestino;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Localizacao getLocOrigim() {
		return locOrigim;
	}
	public void setLocOrigim(Localizacao locOrigim) {
		this.locOrigim = locOrigim;
	}
	public Localizacao getLocDestino() {
		return locDestino;
	}
	public void setLocDestino(Localizacao locDestino) {
		this.locDestino = locDestino;
	}

	
}
