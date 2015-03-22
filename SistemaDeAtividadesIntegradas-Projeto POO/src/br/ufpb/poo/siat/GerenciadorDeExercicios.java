package br.ufpb.poo.siat;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeExercicios {
	
	List <Pergunta> questao= new ArrayList<Pergunta>();
	List <Resposta> resposta= new ArrayList<Resposta>();
	List <Aluno> aluno= new ArrayList<Aluno>();
	
	public void cadastrarPergunta(Pergunta p){
		questao.add(p);
	}
	
	public void cadastrarResposta(Resposta r){
		resposta.add(r);
	}
	
	public boolean corrigirQuestaoDeMultiplaEscolha(String id, String resposta)throws QuestaoInexistenteException{
		
		for(Pergunta p: questao){
			if(p.getIdentificador().equals(id)){
				if(p.getResposta().equals(resposta)){
					
					System.out.println("Parabéns, você acertou a questão!");
					return true;
		
				}else{
					System.out.println("Você errou a questão. A resposta esperada era "+p.getResposta());
					return false;
				}
			}
			
		}
		throw new QuestaoInexistenteException("Questão não encontrada");
		
	}
	
	public String corrigirQuestaoDissertativa(String id, String resposta)throws QuestaoInexistenteException{
		String feedback="";
		for(Pergunta p: questao){
			if(p.getIdentificador().equals(id)){
				feedback+="Sua resposta será avaliada pelo professor.\n";
				feedback+="Uma base da resposta esperada: "+p.getResposta();
				return feedback;
			}
		}
		throw new QuestaoInexistenteException("Questão não encontrada");
	}
	
	public boolean corrigirQuestaoVouF(String id, String resposta)throws QuestaoInexistenteException{
		
		for(Pergunta p: questao){
			if(p.getIdentificador().equals(id)){
				if(p.getResposta().equals(resposta)){
					return true;
				}
			}else {
				System.out.println("A resposta está errada. A resposta certa é: "+p.getResposta());
				return false;
			}
		}
		throw new QuestaoInexistenteException("Questão não encontrada");
	}

	
}

	