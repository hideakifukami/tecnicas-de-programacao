package tarefaHeranca;

public class Imovel {
	private String nome;
	private String endereco;
	private String tipo;
	private double valor;
	protected static int count;
	
	public Imovel(String nome, String endereco, String tipo, double valor) {
		this.nome = nome;
		this.endereco = endereco;
		this.tipo = tipo;
		this.valor = valor;
		count++;
		}

	public Imovel() {
		count++;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double valorFinal() {
		return this.valor * 1.06;
	}
	
	@Override
	public String toString() {
		return "Imovel [nome=" + nome + ", endereco=" + endereco + ", tipo=" + tipo + ", valor=" + valor + "]";
	}
	
	
}
