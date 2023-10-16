package lojaComparable;

public class Produto implements Comparable<Produto> {

	private String nome;
	private double preco;
	private int codigo;
	
	public Produto(String nome, double preco, int codigo) {
		this.nome = nome;
		this.preco = preco;
		this.codigo = codigo;
	}

	public Produto() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\nPreço: " + preco + "\nCódigo: " + codigo;
	}
	
	@Override
	public boolean equals(Object obj) {
		Produto other = (Produto) obj;
		if (codigo == other.getCodigo())
			return true;
		else return false;
	}

	@Override
	public int compareTo(Produto produto) {
		if (this.nome.equals(produto.getNome())) {
			return 1;
		} else return 0;
		
		
	}
		
	
}
