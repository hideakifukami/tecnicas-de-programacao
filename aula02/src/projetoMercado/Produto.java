package projetoMercado;

public class Produto {
	public int id;
    public String nome;
    public double valorUnitario;
    
    public Produto(String nome, double valorUnitario) {
		this.nome = nome;
		this.valorUnitario = valorUnitario;
	}

	public Produto() {
	}

	public double calculaTotal(int qtd){
        return (qtd * this.valorUnitario);
    }

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", valorUnitario=" + valorUnitario + "]";
	}
	
	
}
