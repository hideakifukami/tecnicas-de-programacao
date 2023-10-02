package ex01;

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
	
	public boolean dataValida(int umDia, int umMes, int umAno) {
		if ((umDia >= 1) && (umDia <= 31) && (umMes >= 1) && (umMes <= 12)) {
			return true;
		} else {
			return false;
		}
	}  	
	

}
