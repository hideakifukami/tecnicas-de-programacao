package lojaComparable;

public class DVD extends Produto {

	private int duracao;

	public DVD(String nome, double preco, int codigo, int duracao) {
		super(nome, preco, codigo);
		this.duracao = duracao;
	}

	public DVD() {
	}

	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	@Override
	public String toString() {
		return "Nome: " + getNome() + "\nPreço: " + getPreco() + "\nCódigo: " + getCodigo() + "\nDuração: " + duracao;
	}
	
}
