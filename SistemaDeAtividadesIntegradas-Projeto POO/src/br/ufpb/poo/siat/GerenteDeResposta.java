package br.ufpb.poo.siat;

import java.util.ArrayList;
import java.util.List;

public class GerenteDeResposta {
	
	private List<Resposta> resposta=new ArrayList<Resposta>();
	
	public void cadastraRespostaDeMultiplaEscolha(String identificador, String respostaMultiplaEscolha){
		Resposta r=new Resposta (identificador, respostaMultiplaEscolha);
		this.resposta.add(r);
	}
			
	public void cadastrarRespostaVouF(String identificador, String respostaVouF){
		Resposta r=new Resposta (identificador,respostaVouF);
		this.resposta.add(r);
	}
	
	public void cadastrarRespostaDissertativa(String identificador,String respostaDissertativa){
		Resposta r=new  Resposta (identificador, respostaDissertativa);
		this.resposta.add(r);
	}
}