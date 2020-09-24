package br.com.fatec;

public class ProdutoUnitario extends Produto{

	public ProdutoUnitario(String nome, double valor) {
		super(nome, valor);
	}

	@Override
	public double getValorProduto() {
		return valor;
	}

}
