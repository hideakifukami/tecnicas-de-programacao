package exercicio10;

public class Funcionario {

	private String nome;
	private String endereco;
	private double salario;
	
	
	public Funcionario() {
	}


	public Funcionario(String nome, String endereco, double salario) {
		this.nome = nome;
		this.endereco = endereco;
		this.salario = salario;
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


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double calculaSalario() {
		double salarioLiquido = salario - (salario * 0.11);
		return salarioLiquido;

	}
	
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", endereco=" + endereco + ", salario=" + salario + "]";
	}
	
	
}
