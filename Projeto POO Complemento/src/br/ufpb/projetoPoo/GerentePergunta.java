package br.ufpb.projetoPoo;

import java.util.ArrayList;
import java.util.List;

public class GerentePergunta {
	
	List<Pergunta> pergunta=new ArrayList<Pergunta>();
	
	public void cadastraPerguntaDeMultiplaEscolha(Pergunta perguntaMultiplaEscolha){
		this.pergunta.add(perguntaMultiplaEscolha);
	}
	
	public void cadastrarPerguntaVouF(Pergunta perguntaVouF){
		this.pergunta.add(perguntaVouF);
	}
	
	public void cadastrarPerguntaDissertativa(Pergunta perguntaDissertativa){
		this.pergunta.add(perguntaDissertativa);
	}
	
}
