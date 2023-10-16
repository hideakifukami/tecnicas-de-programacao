package lojaComparable;

public class CD extends Produto {

	private int faixas;

	public CD(String nome, double preco, int codigo, int faixas) {
		super(nome, preco, codigo);
		this.faixas = faixas;
	}

	public CD() {
	}
	
	public int getFaixas() {
		return faixas;
	}

	public void setFaixas(int faixas) {
		this.faixas = faixas;
	}

	@Override
	public String toString() {
		return "Nome: " + getNome() + "\nPreço: " + getPreco() + "\nCódigo: " + getCodigo() + "\nFaixas: " + faixas;
	}
	
}
