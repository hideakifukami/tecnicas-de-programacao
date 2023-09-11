package exercicio02;

public class Gerente extends Empregado {

	private String departamento;

	public Gerente() {
		super();
	}

	public Gerente(String nome, double salario, String departamento) {
		super(nome, salario);
		this.departamento = departamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Gerente [departamento=" + departamento + ", salario=" + salario + ", nome=" + getNome() + "]";
	}
	
}
