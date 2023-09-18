package exercicio10;

public class Gerente extends Funcionario {

	private double bonificacao;

	private Gerente(String nome, String endereco, double salario, double bonificacao) {
		super(nome, endereco, salario);
		this.bonificacao = bonificacao;
	}

	@Override
	public double calculaSalario() {
		double salarioLiquido = super.getSalario() - (super.getSalario() * 0.11) + (super.getSalario() * bonificacao);
		return salarioLiquido;

	}
	
}
