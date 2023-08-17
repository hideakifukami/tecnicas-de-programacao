package projetoMercado;

public class Funcionario {
	public int id;
    public String nome;
    public String cpf;
    public String email;
    public String celular;
    public String senha;
    public double salarioBruto;
   
    public Funcionario(String nome, String cpf, String email, String celular, double salarioBruto) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.celular = celular;
		this.salarioBruto = salarioBruto;
	}

	public Funcionario(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public Funcionario() {
		
	}

	public String mostrarDados(){
        return ("\n Nome: "+ this.nome + " Celular "+ this.celular + "E-mail: "+ this.email);
    }
    
    public double calculaSalario(double inss){
        double desc= this.salarioBruto* inss/100;
        double sl= this.salarioBruto - desc;
        return sl;
   
    }

	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", celular=" + celular
				+ ", salarioBruto=" + salarioBruto + "]";
	}
    
    
}
