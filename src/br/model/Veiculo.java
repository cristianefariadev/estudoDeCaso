package br.model;

import java.util.Date;
import java.util.List;

public class Veiculo {
	private long id;
	private String placa;
	private String cor;
	private String chassi;
	private Date anoFabricacao;	
	private Modelo modelo;
	private List<Acessorios> acessorios;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public Date getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(Date anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public Modelo getModelo() {
		return modelo;
	}
	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}
	public List<Acessorios> getAcessorios() {
		return acessorios;
	}
	public void setAcessorios(List<Acessorios> acessorios) {
		this.acessorios = acessorios;
	}
	

	
}
