package br.ufpb.poo.siat;

public abstract class Pessoa {
	
	String nome;
	String matricula;
	String senha;
	String email;
	
	public Pessoa(String nome, String matricula, String senha, String email){
		this.nome=nome;
		this.matricula=matricula;
		this.senha=senha;
		this.email=email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public abstract String getDescricao();

}
