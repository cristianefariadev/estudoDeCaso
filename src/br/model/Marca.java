package br.model;

import java.util.List;

public class Marca {

	private long id;
	private String nome;
	private List<Modelo> modelo;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Modelo> getModelo() {
		return modelo;
	}
	public void setModelo(List<Modelo> modelo) {
		this.modelo = modelo;
	}
	
	

}
