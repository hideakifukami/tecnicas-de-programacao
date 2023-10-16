package contaCorrente;

public class ContaEspecial extends ContaCorrente{

	public ContaEspecial() {
		super();
	}

	public ContaEspecial(String titular) {
		super(titular);
	}

	@Override
	public boolean saca(double valor) {
		if((this.saldo >= valor) && (this.saldo - valor >= 0)) {
			this.saldo -= valor * 1.01;
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public void imprimirTipoConta() {
		System.out.println("Conta Especial");
	}	
	
}
