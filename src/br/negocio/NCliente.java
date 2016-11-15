package br.negocio;

import java.util.ArrayList;
import java.util.List;

import br.model.Cliente;

public class NCliente {
	private Cliente Cliente;
	
	public NCliente(Cliente cliente){
		Cliente = new Cliente();
	}
	
	
	public void salvar(){
		
	}
	
	public void alterar(){
		
	}
	
	public void excluir(int id){
		
	}
	
	public Cliente consultar(int id){
		return new Cliente();
	}
	
	public List<Cliente> listar(String texto){
		
		return new ArrayList<Cliente>();
	}
}
