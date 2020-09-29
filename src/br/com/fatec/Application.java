package br.com.fatec;

public class Application {

	public static void main(String[] args) {
		
		Produto kindle = FabricaProduto.criarProdutoUnitario("Kindle Paperwhite ", 500);
		String mais_info = "8Gb de armazenamento" +"\n" +"À prova d'água";
		kindle.setDesc("Amazon", "161g", "160 x 113 x 8.7 mm", "2019", mais_info);
		
		Produto echo = FabricaProduto.criarProdutoUnitario("Echo Dot", 300.0);
		String mais_info2 = "Alexa integrada" +"\n" +"Conectividade Wi-Fi";
		echo.setDesc("Amazon", "300g", "43 mm x 99 mm x 99 mm", "3ª Geração", mais_info2);
		
		Produto kit = FabricaProduto.criarProdutoComposto(kindle, echo);

		
		Desconto valor = FabricaDesconto.criarDescontoValor(200);
		Desconto porcentagem = FabricaDesconto.criarDescontoPorcentagem(10);
		Desconto nenhum = FabricaDesconto.criarSemDesconto();
		Desconto composto = FabricaDesconto.criarDescontoComposto(valor, porcentagem);
		
		CalculadorPreco calculador1 = new CalculadorPreco(valor,kit);
		CalculadorPreco calculador2 = new CalculadorPreco(porcentagem,kit);	
		CalculadorPreco calculador3 = new CalculadorPreco(nenhum,kit);
		CalculadorPreco calculador4 = new CalculadorPreco(composto,kit);	
		
		printResultado(calculador1);
		printResultado(calculador2);
		printResultado(calculador3);
		printResultado(calculador4);
	
	}
	
	static void printResultado(CalculadorPreco calc) {
		System.out.println(
				"Nome do produto: " + calc.produto.getNome() + "\n" +
				"Descrição: " + calc.produto.getDesc() + "\n" +
				"Valor original: R$ " + calc.produto.getValorProduto() + "\n" +
				"Valor com desconto: R$ " + calc.calcularPreco() + "\n"
		);	
	}

}
