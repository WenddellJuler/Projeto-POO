package br.ufpb.poo.siat;

public class Pergunta {

	private String perguntaQuestao;
	private String respostaQuestao;
	private String identificador;

	
	public Pergunta(String id,String pergunta, String resposta){
		this.identificador=id;
		this.perguntaQuestao=pergunta;
		this.respostaQuestao=resposta;
		
	}

	public String getPergunta() {
		return perguntaQuestao;
	}

	public void setPergunta(String pergunta) {
		this.perguntaQuestao = pergunta;
	}
	
	public String getResposta(){
		return respostaQuestao;
	}
	
	public void setResposta(String resposta){
		this.respostaQuestao=resposta;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	
	
}