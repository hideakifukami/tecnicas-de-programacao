package bancoFatecZL;

public class Conta {
	//atributos
    public String titular;
    public double saldo;
    //métodos
    public void deposita(double v) {
        this.saldo += v;
    }
    public boolean saca(double v) {
        if(this.saldo>=v) {
            //deu certo
            this.saldo -= v;
            return true;
        }else {
            return false;
        }
            
              
    }
}
