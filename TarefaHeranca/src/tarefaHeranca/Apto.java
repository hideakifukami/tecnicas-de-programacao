package tarefaHeranca;

public class Apto extends Imovel {
	private int andar;
	private int numApt;

	public Apto() {
	}

	public Apto(String nome, String endereco, String tipo, double valor) {
		super(nome, endereco, tipo, valor);
	}

	public Apto(String nome, String endereco, String tipo, double valor, int andar, int numApt) {
		super(nome, endereco, tipo, valor);
		this.andar = andar;
		this.numApt = numApt;
	}

	public int getAndar() {
		return andar;
	}
	public void setAndar(int andar) {
		this.andar = andar;
	}
	public int getNumApt() {
		return numApt;
	}
	public void setNumApt(int numApt) {
		this.numApt = numApt;
	}
	
	@Override
	public String toString() {
		return "Apto [andar=" + andar + ", numApt=" + numApt + ", getNome()=" + getNome() + ", getEndereco()="
				+ getEndereco() + ", getTipo()=" + getTipo() + ", getValor()=" + getValor() + "]";
	}
	
	
	
}
