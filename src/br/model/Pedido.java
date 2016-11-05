package br.model;

import java.util.Date;
import java.util.List;

public class Pedido {

	private long id;
	private Date data;
	private Enum status;
	private float caucao;
	private float total;
	private List<Locacao> locacao;
	private Cliente cliente;
	private List<Pagamento> pagamento;
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
	public Enum getStatus() {
		return status;
	}
	public void setStatus(Enum status) {
		this.status = status;
	}
	public float getCaucao() {
		return caucao;
	}
	public void setCaucao(float caucao) {
		this.caucao = caucao;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public List<Locacao> getLocacao() {
		return locacao;
	}
	public void setLocacao(List<Locacao> locacao) {
		this.locacao = locacao;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<Pagamento> getPagamento() {
		return pagamento;
	}
	public void setPagamento(List<Pagamento> pagamento) {
		this.pagamento = pagamento;
	}
	
	
	
	
}
