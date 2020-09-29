package br.com.fatec;

import java.util.Arrays;
import java.util.List;

public class ProdutoComposto extends Produto{
	public List<Produto> produtos;
	
	public ProdutoComposto(Produto ...produtos) {
		super("", 0);
		this.produtos = Arrays.asList(produtos);
	}

	@Override
	public double getValorProduto() {
		var valorTotal= 0.0;
		for(Produto prod : produtos) {
			valorTotal += prod.getValorProduto();
		}
		return valorTotal;

	}
	
	@Override
	public String getNome() {
		String nomes = "";
		for(Produto prod : produtos) {
			nomes += "\n" +"- "+ prod.getNome() ;
		}
		return nomes;
	}
	
	@Override
	public String getDesc(){
		String desc = "";
		for(Produto prod : produtos) {
			desc += "\n" +"- "+ prod.getDesc() ;
		}
		return desc ;
	}

}
