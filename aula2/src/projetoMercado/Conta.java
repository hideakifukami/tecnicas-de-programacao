package projetoMercado;

public class Conta {
	
	public int id;
    public String titular;
    public double saldo;
    
    public Conta(String titular, double saldo) {
    	this.titular = titular;
    	this.saldo = saldo;
    }
    
    public Conta() {
	}

	public void deposita(double v) {
        this.saldo += v;
    }
    
    public boolean saca(double v) {
        if(this.saldo>=v) {
            this.saldo -= v;
            return true;
        }else {
            return false;
        }
    }
    
    @Override
    public String toString() {
    	return "Titular: " + this.titular + "\n Saldo: " + this.saldo;
    }
}
