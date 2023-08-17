package projetoMercado;

public class Produto {
	 public int id;
	    public String nome;
	    public double valorUnitario;
	    
	    public double calculaTotal(int qtd){
	        return (qtd * this.valorUnitario);
	    }
}
