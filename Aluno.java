public class Aluno extends Pessoa{
	
	public Aluno(String nome, String matricula){
		super(nome, matricula);
	}
	public String getDescricao() {
		return this.nome + this.matricula;
	}
	
	public String toString(){
		return getDescricao();
	}
	
}