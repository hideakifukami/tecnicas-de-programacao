package loja;

public class DVD extends Produto {

	private int duracao;

	public DVD(String nome, double preco, int duracao) {
		super(nome, preco);
		this.duracao = duracao;
	}

	public DVD() {
	}

	@Override
	public String toString() {
		return "Nome: " + getNome() + "\nPreço: " + getPreco() + "\nDuração: " + duracao;
	}
	
}
