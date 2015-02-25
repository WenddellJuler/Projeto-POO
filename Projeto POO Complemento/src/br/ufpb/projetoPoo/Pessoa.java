package br.ufpb.projetoPoo;

public abstract class Pessoa {
	String nome;
	String matricula;
	String senha;
	String email;
	
	public Pessoa(String nome, String matricula, String senha, String email){
		this.nome = nome;
		this.matricula = matricula;
		this.senha=senha;
		this.email=email;
	}
	public String getNome(){
		return this.nome;
	}
	public String getMatricula(){
		return this.matricula;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setMatricula(String matricula){
		this.matricula = matricula;
	}
	
	public String getSenha(){
		return this.senha;
	}
	
	public void setSenha(String senha){
		this.senha=senha;
	}
	
	public String getEmail(){
		return this.email;
	}
	
	public void setEmail(String email){
		this.email=email;
	}
	
	public abstract String getDescricao();
	
	
}
