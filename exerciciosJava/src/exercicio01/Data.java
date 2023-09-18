package exercicio01;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public void inicilizaData(int umDia, int umMes, int umAno) {
		if (dataValida(umDia,umMes, umAno)) {
			this.dia = umDia;
			this.mes = umMes;
			this.ano = umAno;
		} else {
			this.dia = 0;
			this.mes = 0;
			this.ano = 0;
		}

	}
	
	private boolean dataValida(int umDia, int umMes, int umAno) {
		if ((umDia >= 1) && (umDia <= 31) && (umMes >= 1) && (umMes <= 12)) {
			return true;
		} else {
			return false;
		}
	}  

	public void mostraData() {
		String mesString = "";
		switch (mes) {
		case 1:
			mesString = "Janeiro";
			break;

		case 2:
			mesString = "Fevereiro";
			break;

		case 3:
			mesString = "Março";
			break;

		case 4:
			mesString = "Abril";
			break;

		case 5:
			mesString = "Maio";
			break;

		case 6:
			mesString = "Junho";
			break;

		case 7:
			mesString = "Julho";
			break;

		case 8:
			mesString = "Agosto";
			break;

		case 9:
			mesString = "Setembro";
			break;

		case 10:
			mesString = "Outurbo";
			break;

		case 11:
			mesString = "Novembro";
			break;

		case 12:
			mesString = "Dezembro";
			break;

		}
		System.out.print(dia + "/" + mesString + "/" + ano);
	}
}
