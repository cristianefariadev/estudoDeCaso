package br.model;

import java.util.Date;
import java.util.List;

public class Locacao {

	private long id;
	private Date dataLocacao;
	private Date dataDevolucao;
	private float kmInicial;
	private float kmFinal;
	private float subTotal;
	
	private List<Ocorrencia> ocorrerncia;
	private Veiculo veiculo;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getDataLocacao() {
		return dataLocacao;
	}
	public void setDataLocacao(Date dataLocacao) {
		this.dataLocacao = dataLocacao;
	}
	public Date getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	public float getKmInicial() {
		return kmInicial;
	}
	public void setKmInicial(float kmInicial) {
		this.kmInicial = kmInicial;
	}
	public float getKmFinal() {
		return kmFinal;
	}
	public void setKmFinal(float kmFinal) {
		this.kmFinal = kmFinal;
	}
	public float getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(float subTotal) {
		this.subTotal = subTotal;
	}

	public List<Ocorrencia> getOcorrerncia() {
		return ocorrerncia;
	}
	public void setOcorrerncia(List<Ocorrencia> ocorrerncia) {
		this.ocorrerncia = ocorrerncia;
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	
	
}
