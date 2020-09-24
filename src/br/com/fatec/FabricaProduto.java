package br.com.fatec;

public class FabricaProduto {
	
		public static Produto  criarProdutoUnitario(String nome, double valor) {
			return new ProdutoUnitario(nome, valor);
		}
		
		public static Produto  criarProdutoComposto(Produto ...produtos) {
			return new ProdutoComposto(produtos);
		}
	
}
