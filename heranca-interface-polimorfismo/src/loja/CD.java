package loja;

public class CD extends Produto {

	private int faixas;

	public CD(String nome, double preco, int faixas) {
		super(nome, preco);
		this.faixas = faixas;
	}

	public CD() {
	}

	@Override
	public String toString() {
		return "Nome: " + getNome() + "\nPreço: " + getPreco() + "\nFaixas: " + faixas;
	}
	
}
