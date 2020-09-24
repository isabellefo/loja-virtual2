package br.com.fatec;

public class Application {

	public static void main(String[] args) {
		//Produto p1 = new Produto("Computador", 1000.0);
		Produto computador = FabricaProduto.criarProdutoUnitario("Computador", 1000.0);
		Produto celular = FabricaProduto.criarProdutoUnitario("Celular", 500.0);
		Produto kit = FabricaProduto.criarProdutoComposto(computador, celular);
		
		Desconto valor = FabricaDesconto.criarDescontoValor(200);
		Desconto porcentagem = FabricaDesconto.criarDescontoPorcentagem(10);
		Desconto nenhum = FabricaDesconto.criarSemDesconto();
		Desconto composto = FabricaDesconto.criarDescontoComposto(valor, porcentagem);
		
		CalculadorPreco calculador1 = new CalculadorPreco(valor,kit);
		//CalculadorPreco calculador2 = new CalculadorPreco(porcentagem,p1);	
		//CalculadorPreco calculador3 = new CalculadorPreco(nenhum,p1);
		//CalculadorPreco calculador4 = new CalculadorPreco(composto,p1);	
		
		printResultado(calculador1);
		//printResultado(calculador2);
		//printResultado(calculador3);
		//printResultado(calculador4);
	
	}
	
	static void printResultado(CalculadorPreco calc) {
		System.out.println(
				"Nome do produto: " + calc.produto.getNome() + "\n" +
				"Valor original: R$ " + calc.produto.getValorProduto() + "\n" +
				"Valor com desconto: R$ " + calc.calcularPreco() + "\n"
		);	
	}

}
