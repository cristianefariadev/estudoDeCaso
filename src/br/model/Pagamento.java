package br.model;

import java.util.Date;

public class Pagamento {

	private long id;
	private Date data;
	private float valorRecebido;
	private float valorCompra;
	private float valorTroco;
	private Enum<TipoPagamento> tipoPagamento;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public float getValorRecebido() {
		return valorRecebido;
	}
	public void setValorRecebido(float valorRecebido) {
		this.valorRecebido = valorRecebido;
	}
	public float getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(float valorCompra) {
		this.valorCompra = valorCompra;
	}
	public float getValorTroco() {
		return valorTroco;
	}
	public void setValorTroco(float valorTroco) {
		this.valorTroco = valorTroco;
	}
	
	fpublic Enum<TipoPagamento> getTipoPagamento() {
		return tipoPagamento;
	}
	public void setTipoPagamento(Enum<TipoPagamento> tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

}
