package tarefaHeranca;

public class Casa extends Imovel {
	private boolean piscina;

	public Casa(String nome, String endereco, String tipo, double valor, boolean piscina) {
		super(nome, endereco, tipo, valor);
		this.piscina = piscina;
	}

	public Casa(String nome, String endereco, String tipo, double valor) {
		super(nome, endereco, tipo, valor);
	}

	public Casa() {
	}

	public boolean isPiscina() {
		return piscina;
	}
	public void setPiscina(boolean piscina) {
		this.piscina = piscina;
	}

	@Override
	public String toString() {
		return "Casa [piscina=" + piscina + ", getNome()=" + getNome() + ", getEndereco()=" + getEndereco()
				+ ", getTipo()=" + getTipo() + ", getValor()=" + getValor() + "]";
	}
	
}
