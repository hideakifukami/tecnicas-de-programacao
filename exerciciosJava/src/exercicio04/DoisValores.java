package exercicio04;

public class DoisValores {

	int v1, v2;
	
	private int maior() {
		if (v1 > v2) {
			return v1;
		} else return v2;

	}
	
	private int menor() {
		if (v1 < v2) {
			return v1;
		} else return v2;
	}
}
