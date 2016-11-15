package br.negocio;

import java.util.ArrayList;
import java.util.List;

import br.model.Pagamento;
import br.model.Veiculo;

public class NPagamento {

	Pagamento pagamento;
	
	public NPagamento(){
		pagamento = new Pagamento();
	}
	
	public float calcularTroco(){
		this.pagamento.setValorTroco(this.pagamento.getValorCompra()-this.pagamento.getValorRecebido());

		return this.pagamento.getValorTroco();
	}
	
	public boolean cancelarPagamento(){
		
		//inserir aqui codigo para cancelar pagamento
		
		return true;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
	
	public void salvar(){
		
	}
	
	public void alterar(){
		
	}
	
	public void excluir(int id){
		
	}
	
	public Pagamento consultar(int id){
		return new Pagamento();
	}
	
	public List<Pagamento> listar(String texto){
		
		return new ArrayList<Pagamento>();
	}
	
	
	
}
