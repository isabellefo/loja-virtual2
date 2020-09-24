package br.com.fatec;

public class DescontoValor extends Desconto{
	
	public DescontoValor(double valorDesconto) {
		super(valorDesconto);
	}
	
	@Override
	public double getValorDesconto(double valorProduto) {
		double valorMaximo = this.valorMaximo(valorProduto);
		return valorDesconto < valorMaximo ? valorDesconto : valorMaximo;
	}
}
