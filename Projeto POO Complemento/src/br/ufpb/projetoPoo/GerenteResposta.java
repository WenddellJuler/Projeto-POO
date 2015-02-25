package br.ufpb.projetoPoo;

import java.util.ArrayList;
import java.util.List;

public class GerenteResposta {
		
		private List<Resposta> resposta=new ArrayList<Resposta>();
		
		public void cadastraRespostaDeMultiplaEscolha(Resposta respostaMultiplaEscolha){
			this.resposta.add(respostaMultiplaEscolha);
		}
		
		public void cadastrarRespostaVouF(Resposta respostaVouF){
			this.resposta.add(respostaVouF);
		}
		
		public void cadastrarRespostaDissertativa(Resposta respostaDissertativa){
			this.resposta.add(respostaDissertativa);
		}
}
