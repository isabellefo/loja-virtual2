package br.com.fatec;

public class DescontoPorcentagem extends Desconto{
	
	public DescontoPorcentagem(double valorDesconto) {
		super(valorDesconto);
	}
	
	@Override
	public double getValorDesconto(double valorProduto) {
		return valorProduto*valorDesconto/100;
	}
}
