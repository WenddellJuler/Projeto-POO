package br.ufpb.projetoPoo;

public class Professor extends Pessoa{
	public Professor(String nome, String matricula, String senha, String email){
		super(nome, matricula, senha, email);
	}
	public String getDescricao() {
		return this.nome + this.matricula;
	}
	
	public String toString(){
		return getDescricao();
	}
	
	
}