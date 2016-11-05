package br.model;

public class Login {

	private long id;
	private String usuario;
	private String senha;
	
	//++++++++++++++++++++++++++++++++++++++++++
	//METODO GET AND SETTER
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
