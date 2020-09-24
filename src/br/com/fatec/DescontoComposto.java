package br.com.fatec;

import java.util.Arrays;
import java.util.List;

public class DescontoComposto extends Desconto {
	public List<Desconto> descontos;
	public DescontoComposto(Desconto ...descontos) {
		super(0);
		this.descontos = Arrays.asList(descontos);
	}
	
	public double getValorDesconto(double valorProduto) {
		var valorDesconto = 0.0;
		double valorMaximo = this.valorMaximo(valorProduto);
		for(Desconto desc : descontos) {
			valorDesconto += desc.getValorDesconto(valorProduto);
		}
		return valorDesconto < valorMaximo ? valorDesconto: valorMaximo;
	}
	
	
}
