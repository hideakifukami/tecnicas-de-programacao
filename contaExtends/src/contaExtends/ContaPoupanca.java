package contaExtends;

public class ContaPoupanca extends Conta{
	
	
	
	public void reajustar(double percentual) {
		double saldoAtual = this.getSaldo();
		double reajuste = saldoAtual * percentual;
		this.deposita(reajuste);
	}
	
	
}
