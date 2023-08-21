package solucoesAmbientais;

public class IndustriaCliente {

	public int id;
	public String nomeResponsável;
	public String nomeEmpresa;
	public String cnpj;
	public String nomeFantasia;
	public String telefone;
	public Endereco endereco;
	public String email;
	public String dataAbertura;
	
	
	public IndustriaCliente(String nomeResponsável, String nomeEmpresa, String cnpj, String nomeFantasia, String telefone,
			Endereco endereco, String email, String dataAbertura) {
		this.nomeResponsável = nomeResponsável;
		this.nomeEmpresa = nomeEmpresa;
		this.cnpj = cnpj;
		this.nomeFantasia = nomeFantasia;
		this.telefone = telefone;
		this.endereco = endereco;
		this.email = email;
		this.dataAbertura = dataAbertura;
	}


	public IndustriaCliente(String nomeEmpresa, String cnpj, String telefone) {
		this.nomeEmpresa = nomeEmpresa;
		this.cnpj = cnpj;
		this.telefone = telefone;
	}


	public IndustriaCliente() {
	}


	@Override
	public String toString() {
		return "\nNome da Empresa: " + nomeEmpresa + "\nResponsável: " + nomeResponsável + "\nCNPJ: "
				+ cnpj + "\nNome Fantasia: " + nomeFantasia + "\nTelefone: " + telefone + "\nEndereço: " + endereco
				+ "\nEmail: " + email + "\nData de Abertura: " + dataAbertura + "\n";
	}
	
	
	
}
