package controleEstoque;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Produto produto = new Produto("Papel Sulfite", 10, 20.50);
		ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
		int op, qtd;
		String nome;
		boolean aux = false;
		double valor;
		
		listaProdutos.add(produto);
	    listaProdutos.add(new Produto("Caneta Bic",5,2.50));
        listaProdutos.add(new Produto("Borracha",6,1.50));
        listaProdutos.add(new Produto("Caderno",2,22.50));
		
        String menu= "\nDigite a opção desejada: "
        		+ "\n"
        		+ "\n1-Cadastrar novo Produto. "
        		+ "\n2-Listar. "
        		+ "\n3-Vender. "
        		+ "\n4-Atualizar Estoque."
        		+ "\n5-Atualizar Cadastro "
        		+ "\n0-Sair.";
        
        do {
        	 op= Integer.parseInt(JOptionPane.showInputDialog(null,menu));
        	 
        	 switch (op) {
			case 1:
				nome=JOptionPane.showInputDialog("Digite o nome do produto");
                qtd= Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade em estoque"));
                valor= Double.parseDouble(JOptionPane.showInputDialog("Digite o valor unitário"));
                listaProdutos.add(new Produto(nome,qtd,valor));
                 
				break;

			case 2:
				JOptionPane.showMessageDialog(null, listaProdutos);
				
				break;

			case 3:
				nome=JOptionPane.showInputDialog("Digite o nome do produto");

                for(Produto item:listaProdutos){
                    if(nome.equalsIgnoreCase(item.getNomeProduto())){
                       qtd= Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade a ser comprada"));                  
                       JOptionPane.showMessageDialog(null, item.venda(nome, qtd));
                       aux=true;	                   
                    }
                }
                
                if(!aux) {
                	JOptionPane.showMessageDialog(null, "Produto não encontrado!");	             
                }
                
                aux = false;
				
				break;

			case 4:
				nome=JOptionPane.showInputDialog("Digite o nome do produto");
                for(Produto item:listaProdutos){
                    if(nome.equalsIgnoreCase(item.getNomeProduto())){
                       qtd= Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade a ser acrescentada"));
                       item.atualizarEstoque(qtd);
                       JOptionPane.showMessageDialog(null, "Estoque atualizado "+item);
                       aux=true;	                   
                    }
                }
                
                if(!aux) {
                	JOptionPane.showMessageDialog(null, "Produto não encontrado!");	             
                }
                
                aux = false;
	                
				break;

			case 5:
				nome=JOptionPane.showInputDialog("Digite o nome do produto a ser atualizado");
                for(Produto item:listaProdutos){
                    if(nome.equalsIgnoreCase(item.getNomeProduto())){
                       item.setNomeProduto(nome);                     
                       qtd= Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade em estoque"));
                       item.setQtd(qtd);
                       valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto"));
                       item.setValorUnitario(valor);
                       JOptionPane.showMessageDialog(null, "Produto atualizado "+item);
                       aux=true;	                   
                    }
                }
                
                if(!aux) {
                	JOptionPane.showMessageDialog(null, "Produto não encontrado!");	             
                }
                
                aux = false;
	                
				break;

			case 0:
				
				JOptionPane.showMessageDialog(null, "Até Logo!");
				
				break;

			default:
				break;
			}
        	 
        	
		} while (op!=0);
	}
}
