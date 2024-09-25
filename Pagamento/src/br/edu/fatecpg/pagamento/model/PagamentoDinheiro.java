package br.edu.fatecpg.pagamento.model;

public class PagamentoDinheiro implements Pagamento {
	private double valor;
	private double taxa=0.10;
	//Construtor
	public PagamentoDinheiro(double vl) {
		this.valor = vl;
	}
	
	@Override
	public double calcularPagamento() {
		
		return valor-(valor*taxa);
	}

	@Override
	public void emitirRecibo() {
		System.out.println("-------------");
		System.out.println("Recibo - Pago em dinheiro");
		System.out.println("-------------");
		System.out.println("Valor inicial: "+valor);
		System.out.println("Valor do desconto: "+(valor*taxa));
		System.out.println("Valor Total: "+calcularPagamento());
		
	}
	
}
