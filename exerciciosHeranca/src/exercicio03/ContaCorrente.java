package exercicio03;

public class ContaCorrente {
	protected double saldo;
	
	public ContaCorrente() {}
	
	public ContaCorrente(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public boolean sacar(double valor) {
		if (this.saldo - valor >= 0) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "Saldo da Conta: " + this.saldo;
	}
}
