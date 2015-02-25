package br.ufpb.projetoPoo;

import java.util.ArrayList;
import java.util.List;

public class GerenteExercicio {
	
	List<Exercicio> gerenteExercicio=new ArrayList<Exercicio>();
	
	public void cadastraPerguntaRespostaMultiplaEscolha(Exercicio perguntaMultiplaEscolha, Exercicio respostaMultiplhaEscolha){
		this.gerenteExercicio.add(perguntaMultiplaEscolha);
		this.gerenteExercicio.add(respostaMultiplhaEscolha);
	}
	
	public void cadastrarPerguntaRespostaVouF(Exercicio perguntaVouF, Exercicio respostaVouF){
		this.gerenteExercicio.add(perguntaVouF);
		this.gerenteExercicio.add(respostaVouF);
	}
	
	public void cadastrarPerguntaRespostaDissertativa(Exercicio perguntaDissertativa, Exercicio respostaDissertativa){
		this.gerenteExercicio.add(perguntaDissertativa);
		this.gerenteExercicio.add(respostaDissertativa);
	}

}

//OBSERVAÇÃO:
//Perguntar o porquê da criação das classes Pergunta, GerentePergunta, Resposta, GerenteResposta