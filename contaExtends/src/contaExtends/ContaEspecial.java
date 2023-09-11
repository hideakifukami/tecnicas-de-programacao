package contaExtends;

public class ContaEspecial extends Conta{
	private double limite;

	public ContaEspecial(String titular, double limite) {
		super(titular);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	@Override
	public void imprimirTipoConta() {
		System.out.println("Conta Especial");
	}	
	
}
