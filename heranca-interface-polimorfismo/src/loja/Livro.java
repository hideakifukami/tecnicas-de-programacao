package loja;

public class Livro extends Produto {
	
	private String autor;

	public Livro(String nome, double preco, String autor) {
		super(nome, preco);
		this.autor = autor;
	}

	public Livro() {
	}

	@Override
	public String toString() {
		return "Nome: " + getNome() + "\nPre�o: " + getPreco() + "\nAutor: " + autor;
	}
	
}
