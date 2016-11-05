package br.negocio;

import br.model.Pagamento;

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
	
	
	
}
