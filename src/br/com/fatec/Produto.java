package br.com.fatec;

public abstract class Produto {
	protected String nome;
	protected double valor;
	protected String desc;

	public Produto(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public abstract double getValorProduto();

}
