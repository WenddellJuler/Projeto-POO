package br.ufpb.poo.siat;

import java.util.ArrayList;
import java.util.List;

public class GerenteDeProfessor {
	
List<Professor> professores = new ArrayList<Professor>();
	
	public void cadastraProfessor(String nome, String matricula, String senha, String email) throws ProfessorJaExisteException{
		boolean jaCadastrou = true;
		for(Professor p : professores){
			if(p.getMatricula().equals(matricula)){
				jaCadastrou = false;
				break;
			}
		}
		
		if(jaCadastrou == true){
			Professor p = new Professor(nome, matricula,senha,email);
			this.professores.add(p);
		}else{
			throw new ProfessorJaExisteException("Professor j� cadastrado");	
		}
	}
	
	public void removeProfessorPelaMatricula(String matricula) throws ProfessorInexistenteException{
		boolean remover = false;
		for(Professor p: professores){
			if(p.getMatricula().equals(matricula)){
				professores.remove(p);
				remover = true;
				break;
			}
		}
		if(remover == false){
			throw new ProfessorInexistenteException("Professor n�o cadastrado");
		}
	}
	
	public Professor pesquisaProfessorPelaMatricula(String matricula) throws ProfessorInexistenteException{
		for(Professor p : professores){
			if(p.getMatricula().equals(matricula)){
				return p;
			}
		}throw new ProfessorInexistenteException("Professor n�o cadastrado");
	}

}
