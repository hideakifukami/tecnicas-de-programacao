package exercicio01;

public class IngressoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ingresso ingresso = new Ingresso(200.00);
		Ingresso ingressoVIP = new IngressoVIP(200.00, 50.00);
		
		System.out.println(ingresso);
		System.out.println(ingressoVIP);
	}

}
