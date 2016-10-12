package br.model;

import java.util.Date;
import java.util.List;

public class Veiculo {
	private long id;
	private String numPlaca;
	private String cor;
	private String quilometragem;
	private Date ano;	
	private Modelo modelo;
	private List<Acessorios> acessorio;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNumPlaca() {
		return numPlaca;
	}
	public void setNumPlaca(String numPlaca) {
		this.numPlaca = numPlaca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getQuilometragem() {
		return quilometragem;
	}
	public void setQuilometragem(String quilometragem) {
		this.quilometragem = quilometragem;
	}
	public Date getAno() {
		return ano;
	}
	public void setAno(Date ano) {
		this.ano = ano;
	}
	public Modelo getModelo() {
		return modelo;
	}
	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}
	public List<Acessorios> getAcessorio() {
		return acessorio;
	}
	public void setAcessorio(List<Acessorios> acessorio) {
		this.acessorio = acessorio;
	}
	
	
}
