package projetoMercado;

public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cli = new Cliente("Sirley", "123459");
		Cliente cli1 = new Cliente();
		Cliente cli2 = new Cliente("Sirley");
		
		System.out.println(cli + ", " + cli1 + ", " + cli2);
	}

}
