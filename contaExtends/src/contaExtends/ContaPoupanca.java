package contaExtends;

public class ContaPoupanca extends Conta{
	
	public ContaPoupanca() {
		
	}

	public ContaPoupanca(String titular) {
		super(titular);
	}

	public void reajustar(double percentual) {
		double saldoAtual = this.getSaldo();
		double reajuste = saldoAtual * percentual;
		this.deposita(reajuste);
	}
	
	@Override
	public void imprimirTipoConta() {
		System.out.println("Conta Poupança");
	}
	
}
