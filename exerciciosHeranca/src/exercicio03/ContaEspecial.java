package exercicio03;

public class ContaEspecial extends ContaCorrente {
	private double limite;

	public ContaEspecial() {
		super();
	}

	public ContaEspecial(double saldo, double limite) {
		super(saldo);
		this.limite = limite;
	}
	
	@Override
	public boolean sacar(double valor) {
		if ((this.saldo - valor) >= (0 - this.limite)) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "Saldo da Conta: " + this.saldo + "\nLimite: " + this.limite;
	}
	
}
