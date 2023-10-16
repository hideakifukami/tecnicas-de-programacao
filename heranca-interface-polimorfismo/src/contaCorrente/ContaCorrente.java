package contaCorrente;

public class ContaCorrente {
	private int numero;
	protected double saldo;
	private String titular;
	private static int sequence = 1000;
	
	public ContaCorrente(String titular) {
		this.numero = sequence++;
		this.titular = titular;
	}

	public ContaCorrente() {
		this.numero = sequence++;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public boolean saca(double valor) {
		if((this.saldo >= valor) && (this.saldo - valor >= 0)) {
			this.saldo -= valor * 1.05;
			return true;
		} else {
			return false;
		}
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public void imprimirTipoConta() {
		System.out.println("Conta Comum");
	}
	
	@Override
    public String toString() {
        return ("\nConta Corrente: "+ this.numero+ " \nTitular: " + this.titular +"\nSaldo: R$" + this.saldo + "\n");
    }
}
