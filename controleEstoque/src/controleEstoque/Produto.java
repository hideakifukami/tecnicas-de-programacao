package controleEstoque;

public class Produto {
	private String nomeProduto;
	private int qtd;
	private double valorUnitario;
	
	public Produto(String nomeProduto, int qtd, double valorUnitario) {
		this.nomeProduto = nomeProduto;
		this.qtd = qtd;
		this.valorUnitario = valorUnitario;
	}

	public void atualizarEstoque(int qtd) {
		this.qtd += qtd;
	}
	
	public String venda(String nomeProduto, int qtd) {
		if((this.qtd > 0) && (this.qtd - qtd >= 0)) {
			this.qtd -= qtd;
			return "Valor da venda: " + this.valorUnitario * qtd;
		} else {
			return "Produto não disponível em estoque";
		}
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
	@Override
    public String toString() {
        return("\n Produto: "+this.nomeProduto+"\t Estoque: "+this.qtd+
                "\t Preço Unitário R$"+ this.valorUnitario);
    }
	
}
