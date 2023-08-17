package projetoMercado;

public class Cliente {
	
	public int id;
    public String nome;
    public String cpf;
    public String email;
    public String celular;
	
    
    public Cliente() {
	}

    
	public Cliente(String nome) {
		super();
		this.nome = nome;
	}


	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}


	@Override
	public String toString() {
		return "\n Nome: " + this.nome + "\n CPF: " + this.cpf;
	}
    
	
}
