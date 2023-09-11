package contaExtends;

public class Conta {
	private int numero;
	private double saldo;
	private String titular;
	
	public Conta(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
	}

	public Conta() {
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
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	@Override
    public String toString() {
        return ("\nConta Corrente: "+ this.numero+ " \nTitular: " + this.titular +"\nSaldo: R$" + this.saldo);
    }
}
