package br.com.fatec;

public abstract class Desconto {

	protected double valorDesconto;
	
	public Desconto(double valorDesconto) {
		this.valorDesconto = valorDesconto;
	}
		
	public void setDesconto(double valorDesconto) {
		this.valorDesconto = valorDesconto;
	}
	
	double valorMaximo(double valorProduto) {
		return valorProduto;
	}
	
	public abstract double getValorDesconto(double valorProduto);

}
