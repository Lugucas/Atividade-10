package model;

public class candidato {
	private String nome;
	private String cpf;
	private String cargo;
	
	
	public candidato(java.lang.String nome, java.lang.String cpf, java.lang.String cargo, candidato string) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.cargo = cargo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
}
