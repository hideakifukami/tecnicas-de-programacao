package projetoMercado;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO code application logic here
        String menu= " Bem vindo ao Sistema Mercadão. \n Escolha a opção desejada. \n 1- Cadastrar Produto. \n 2- Remover Produto. \n 3- Listar Produtos. \n 4- Calcular total da compra. \n 0-Sair.";
        int op,qtd;
        Produto p = new Produto();       
        
        do{
        op= Integer.parseInt(JOptionPane.showInputDialog(null, menu));
        switch(op){
            case 1:
                p.nome=JOptionPane.showInputDialog(null, "Digite o nome do produto");
                p.valorUnitario= Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do produto"));
                break;
            case 2:
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "\n Nome: "+ p.nome + "Valor R$ "+ p.valorUnitario);
                break;
            case 4:
                qtd= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade a ser comprada"));
                JOptionPane.showMessageDialog(null, "Valor Total R$ "+ p.calculaTotal(qtd));
                break;
            case 0:JOptionPane.showMessageDialog(null, "Até Logo!");
                break;
            default: JOptionPane.showMessageDialog(null, "Opção Inválida.");
        }
        }while(op!=0);
       
               
       
               
               
    }
}


