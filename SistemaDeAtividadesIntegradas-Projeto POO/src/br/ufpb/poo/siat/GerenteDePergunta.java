package br.ufpb.poo.siat;

import java.util.ArrayList;
import java.util.List;

public class GerenteDePergunta {
	
	List<Pergunta> pergunta=new ArrayList<Pergunta>();
	
	public void cadastraPerguntaDeMultiplaEscolha(String identificador, String questao, String resposta){
		Pergunta p = new Pergunta (identificador, questao, resposta);
		this.pergunta.add(p);
	}
	
	public void cadastrarPerguntaVouF(String identificador, String questao, String resposta){
		Pergunta p = new Pergunta (identificador, questao, resposta);
		this.pergunta.add(p);
	}
	
	public void cadastrarPerguntaDissertativa(String identificador, String pergunta, String resposta){
		Pergunta p = new Pergunta (identificador, pergunta, resposta);
		this.pergunta.add(p);
	}
	
	public Pergunta pesquisarPergunta(String id) throws QuestaoInexistenteException{
		for(Pergunta p: pergunta){
			if(p.getIdentificador().equals(id)){
				return p;
				
			}
						
		}
		throw new QuestaoInexistenteException("Questão não encontrada");
		
	}
	
}