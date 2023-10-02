package tarefaHeranca;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Imovel> lista = new ArrayList<>();
		lista.add(new Apto("Henrique", "Rua das Flores, 16", "Venda", 500_000, 3, 37));
		lista.add(new Apto("Jonhy", "Rua das Aguas, 27", "Venda", 450_000, 4, 42));
		lista.add(new Apto("Claudio", "Rua das Flores, 16", "Aluguel", 3_000, 7, 71));
		lista.add(new Apto("Luciana", "Rua das Aguas, 27", "Aluguel", 2_000, 9, 92));
		lista.add(new Casa("Robson", "Rua das Palmas, 32", "Aluguel", 2_000, true));
		lista.add(new Casa("Sirley", "Rua das Laranjeiras, 14", "Venda", 600_000, true));
		lista.add(new Casa("Jefferson", "Rua das Pedras, 594", "Venda", 550_000, false));
		lista.add(new Casa("Danillo", "Rua das Ondas, 125", "Venda", 650_000, false));
		lista.add(new Casa("Claudia", "Rua das Nuvens, 402", "Aluguel", 5_000, false));
		lista.add(new Casa("Helena", "Rua das Flores, 503", "Aluguel", 1_000, false));
				
		System.out.println("QUANTIDADE DE IMOVEIS: " + Imovel.count);
		
		ArrayList<Imovel> venda = new ArrayList<>();
		ArrayList<Imovel> aluguel = new ArrayList<>();
		
		for(Imovel imovel: lista) {
			if(imovel.getTipo().equalsIgnoreCase("Aluguel")) {
				aluguel.add(imovel);
			} else if(imovel.getTipo().equalsIgnoreCase("Venda")) {
				venda.add(imovel);
			} else {
				System.out.println(imovel + " com tipo incorreto.");
			}
		}
		
		System.out.println("\nIMOVEIS VENDA: " + venda.size());
		for(Imovel imovel: venda) {
			System.out.println(imovel);
		}
		
		System.out.println("\nIMOVEIS ALUGUEL: " + aluguel.size());
		for(Imovel imovel: aluguel) {
			System.out.println(imovel);
		}
		
		
	}
}
