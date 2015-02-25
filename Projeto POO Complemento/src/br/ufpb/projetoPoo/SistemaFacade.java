package br.ufpb.projetoPoo;

import java.util.ArrayList;
import java.util.List;

public class SistemaFacade {
	
	private GerenteAluno aluno;
	private GerenteProfessor professor;
	private List<GerenteExercicio> exercicio;
	
	public SistemaFacade(){
		this.aluno=new GerenteAluno();
		this.professor=new GerenteProfessor();
		this.exercicio=new ArrayList<GerenteExercicio>();
	}
	
	public void cadastraAluno(String nome, String matricula, String senha, String email) throws AlunoJaExisteException{
		this.aluno.cadastraAluno(nome, matricula, senha, email);
	}
	
	public Aluno pesquisaAlunoPelaMatricula(String matricula) throws AlunoInexistenteException{
		return aluno.pesquisaAlunoPelaMatricula(matricula);
	}
	
	public void removeAlunoPelaMatricula(String matricula) throws AlunoInexistenteException{
		this.aluno.removeAlunoPelaMatricula(matricula);
	}
	
	public void cadastraProfessor(String nome, String matricula, String senha, String email) throws ProfessorJaExisteException{
		this.professor.cadastraProfessor(nome, matricula, senha, email);
	}
	
	public void removeProfessorPelaMatricula(String matricula) throws ProfessorInexistenteException{
		this.professor.removeProfessorPelaMatricula(matricula);
	}
	

}
