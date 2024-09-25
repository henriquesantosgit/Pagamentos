package br.edu.fatecpg.pagamento.model;

public interface Pagamento {
	//Crie uma interface chamada Pagamento com os seguintes métodos:
	//calcularPagamento(): Sem parâmetros, deve ser implementado para calcular o valor do pagamento.
	//emitirRecibo(): Retorna um recibo detalhado da transação.
	//Agora, implemente essa interface em duas classes: PagamentoCartao e PagamentoDinheiro.
	//A classe PagamentoCartao deve incluir uma taxa de 5% sobre o valor do pagamento.
	//A classe PagamentoDinheiro deve aplicar um desconto de 10% sobre o valor do pagamento.
	//No final, crie uma classe de teste que simule o pagamento de R$100,00 com as duas formas de pagamento, calculando o valor final e emitindo um recibo.
	public double calcularPagamento();
	public void emitirRecibo();
}
