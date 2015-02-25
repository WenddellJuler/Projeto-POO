package br.ufpb.projetoPoo;

public class Disciplina {
	String nome;
	String codigo;
	
	public Disciplina(String nome, String codigo){
		this.nome = nome;
		this.codigo = codigo;
	}
	
	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getCodigo(){
		return this.codigo;
	}
	public void setCodigo(String codigo){
		this.codigo = codigo;
	}	
	
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
}
