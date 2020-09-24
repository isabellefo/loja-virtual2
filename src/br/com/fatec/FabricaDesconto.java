package br.com.fatec;

public class FabricaDesconto {
	public static Desconto  criarDescontoValor(double descontoValor) {
		return new DescontoValor(descontoValor);
	}
	
	public static Desconto  criarDescontoPorcentagem(double descontoValor) {
		return new DescontoPorcentagem(descontoValor);
	}
	
	public static Desconto criarSemDesconto() {
		return new DescontoValor(0);
	}
	
	public static Desconto criarDescontoComposto(Desconto ...descontos) {
		return new DescontoComposto(descontos);
	}
}
