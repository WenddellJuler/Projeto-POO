package br.ufpb.projetoPoo;


public class Aluno extends Pessoa{
	public Aluno(String nome, String matricula, String senha, String email){
		super(nome, matricula, senha, email);
	}
	public String getDescricao() {
		return this.nome + this.matricula;
	}
	
	public String toString(){
		return getDescricao();
	}
}
