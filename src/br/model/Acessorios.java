package br.model;

/**
 * <p>
 * <b>Title:</b> Acessorios.java
 * </p>
 * 
 * <p>
 * <b>Description:</b>
 * </p>	
 * 	
 * <p>	
 * <b>Company: </b> CristiianeFaria LTDA
 * </p>	
 * 	
 * @author Cristiane Faria - cristiane.trc@gmail.com
 * 
 * @version 1.0.0
 */
public class Acessorios {

	private long id;
	private String nome;
	private String descricao;
	private float taxa;
	
	public Acessorios() {
		
	}
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
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getTaxa() {
		return taxa;
	}
	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}
}
