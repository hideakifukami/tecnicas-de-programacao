package lista02;

public class Fornecedor extends Pessoa {

	private double valorCredito;
	private double valorDivida;
	
	public Fornecedor() {
	}

	public Fornecedor(String nome) {
		super(nome);
	}

	public Fornecedor(String nome, String telefone) {
		super(nome, telefone);
	}

	public Fornecedor(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
	}

	public Fornecedor(String nome, double valorCredito, double valorDivida) {
		super(nome);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	
	public Fornecedor(String nome, String telefone, double valorCredito, double valorDivida) {
		super(nome, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	
	public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
		super(nome, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	public double getSaldo() {
		return this.valorCredito - this.valorDivida;
	}

	@Override
	public String toString() {
		return "Fornecedor [valorCredito=" + valorCredito + ", valorDivida=" + valorDivida + ", getSaldo()="
				+ getSaldo() + ", getNome()=" + getNome() + ", getEndereco()=" + getEndereco() + ", getTelefone()="
				+ getTelefone() + "]";
	}
	
	
	
}
