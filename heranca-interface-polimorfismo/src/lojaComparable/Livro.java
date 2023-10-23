package lojaComparable;

public class Livro extends Produto {
	
	private String autor;

	public Livro(String nome, double preco, int codigo, String autor) {
		super(nome, preco, codigo);
		this.autor = autor;
	}

	public Livro() {
	}
	

	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Nome: " + getNome() + "\nPreço: " + getPreco() + "\nCódigo: " + getCodigo() + "\nAutor: " + autor;
	}
	
}
