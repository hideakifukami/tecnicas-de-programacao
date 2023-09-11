package lista02;

public class Main {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Hideaki", "Rua Lagoa D'anta, 125", "11952119987");
		Pessoa fornecedor = new Fornecedor("Hideaki", "Rua Lagoa D'anta, 125", "11952119987", 5000, 1500);
		Fornecedor fornecedor2 = new Fornecedor("Hideaki", "Rua Lagoa D'anta, 125", "11952119987");
		fornecedor2.setValorCredito(3000);
		System.out.println(fornecedor2);
		fornecedor2.setValorDivida(1000);
		System.out.println(fornecedor2);
		
		System.out.println(pessoa);
		System.out.println(fornecedor);
		
		fornecedor2.setValorDivida(1000);
	}

}
