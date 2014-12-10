import java.util.ArrayList;
import java.util.List;

public class GerenteAluno {
	
	private List<Aluno> alunos = new ArrayList<Aluno>();
	
	public void cadastraAluno(String nome, String matricula) throws AlunoJaExisteException{
		boolean jaCadastrou = true;
		for(Aluno a : alunos){
			if(a.getMatricula().equals(matricula)){
				jaCadastrou = false;
				break;
			}
		}
		if(jaCadastrou == true){
			Aluno a = new Aluno(nome, matricula);
			this.alunos.add(a);
		}else{
			throw new AlunoJaExisteException("Aluno já cadastrado");	
		}
	}
	
	public Aluno pesquisaAlunoPelaMatricula(String matricula) throws AlunoInexistenteException{
		for(Aluno a : alunos){
			if(a.getMatricula().equals(matricula)){
				return a;
			}
		}throw new AlunoInexistenteException("Aluno não cadastrado");
	}
	
	public void removeAlunoPelaMatricula(String matricula) throws AlunoInexistenteException{
		boolean remover = false;
		for(Aluno a: alunos){
			if(a.getMatricula().equals(matricula)){
				alunos.remove(a);
				remover = true;
				break;
			}
		}
		if(remover == false){
			throw new AlunoInexistenteException("Aluno não cadastrado");
		}
	}
}
