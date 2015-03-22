package br.ufpb.poo.siat;

import java.util.ArrayList;
import java.util.List;

public class GerenteDeAluno {

private List<Aluno> alunos = new ArrayList<Aluno>();

	public Aluno entrarComoAluno(String matricula, String senha)throws AlunoInexistenteException{
		for(Aluno a: alunos){
			if(a.getMatricula().equals(matricula)){
				if(a.getSenha().equals(senha)){
					return a;
				}
			}
		}throw new AlunoInexistenteException("Aluno não encontrado!");
	}
	
	public void cadastraAluno(String nome, String matricula, String senha, String email) throws AlunoJaExisteException{
		boolean jaCadastrou = true;
		for(Aluno a : alunos){
			if(a.getMatricula().equals(matricula)){
				jaCadastrou = false;
				break;
			}
		}
		if(jaCadastrou == true){
			Aluno a = new Aluno(nome, matricula,senha,email);
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
