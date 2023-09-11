package exercicio02;

public class Empregado {
	private String nome;
	protected double salario;
	
	public Empregado(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public Empregado() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empregado [nome=" + nome + ", salario=" + salario + "]";
	}
	

}
