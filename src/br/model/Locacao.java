package br.model;

import java.util.Date;
import java.util.List;

public class Locacao {

	private long id;
	private float subTotal;
	private Date dataLocacao;
	private Date dataDevolucao;
	private List<Ocorrencia> ocorrerncia;
	private Veiculo veiculo;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public float getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(float subTotal) {
		this.subTotal = subTotal;
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
