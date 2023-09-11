package exercicio01;

public class Ingresso {
	private double valor;

	public Ingresso() {
	}

	public Ingresso(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Valor do Ingresso: " + valor + "\n";
	}
	
}
