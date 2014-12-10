public class Professor extends Pessoa{
	public Professor(String nome, String matricula){
		super(nome, matricula);
	}
	public String getDescricao() {
		return this.nome + this.matricula;
	}
	
	public String toString(){
		return getDescricao();
	}
	
	
}