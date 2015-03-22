package br.ufpb.poo.siat;

public class Resposta {
	
	private String identificador;
	private String resposta;
		
	public Resposta(String id, String resposta){
		this.identificador=id;
		this.resposta=resposta;
		
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

}
