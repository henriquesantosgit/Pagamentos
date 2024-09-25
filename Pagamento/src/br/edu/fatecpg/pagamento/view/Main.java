package br.edu.fatecpg.pagamento.view;

import br.edu.fatecpg.pagamento.model.PagamentoCartao;
import br.edu.fatecpg.pagamento.model.PagamentoDinheiro;

public class Main {

	public static void main(String[] args) {
		double valor = 100;
		
		PagamentoCartao Cart = new PagamentoCartao(valor);
		PagamentoDinheiro Din = new PagamentoDinheiro(valor);
		
		Cart.emitirRecibo();
		Din.emitirRecibo();
		
	}

}
