package exercicio02;

public class Vendedor extends Empregado {
	private double comissao;

	public Vendedor() {
		super();
	}

	public Vendedor(String nome, double salario, double comissao) {
		super(nome, salario);
		this.comissao = comissao;
	}
	
	public double calcularSalario() {
		return salario + (comissao * salario);
	}

	@Override
	public String toString() {
		return "Vendedor [comissao=" + comissao + ", salario=" + salario + ", salario com comissao=" + calcularSalario()
				+ ", nome=" + getNome() + "]";
	}
	
	
}
