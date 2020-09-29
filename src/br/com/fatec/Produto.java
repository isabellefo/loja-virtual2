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
	
	public void setDesc(String marca, String peso, String tamanho, String modelo, String outros) {
		marca = "Marca: "+marca+"\n";
		peso= "Peso: "+peso+"\n";
		tamanho = "Tamanho: "+tamanho+"\n";
		modelo = "Modelo: " + modelo +"\n";
		outros = "Informações adicionais: "+ outros +"\n";
		this.desc = marca + peso + tamanho + modelo + outros;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public abstract double getValorProduto();

}
