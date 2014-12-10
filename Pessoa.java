public abstract class Pessoa {
	String nome;
	String matricula;
	
	public Pessoa(String nome, String matricula){
		this.nome = nome;
		this.matricula = matricula;
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
	public abstract String getDescricao();
}