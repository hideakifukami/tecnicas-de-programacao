package exercicio01;

public class IngressoVIP extends Ingresso {

	private double valorAdicional;

	public IngressoVIP() {
		super();
	}

	public IngressoVIP(double valor) {
		super(valor);
	}

	public IngressoVIP(double valor, double valorAdicional) {
		super(valor);
		this.valorAdicional = valorAdicional;
	}

	public double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}

	@Override
	public String toString() {
		return "Valor do Ingresso: " + (valorAdicional + this.getValor()) + "\n";
	}
	
	
	
	
}
