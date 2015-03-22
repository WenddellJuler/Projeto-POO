package br.ufpb.poo.siat;

public class SistemaFacade {
	
	private GerenteDeAluno aluno;
	private GerenteDeProfessor professor;
	private GerenciadorDeExercicios exercicios;
	private GerenteDePergunta pergunta;
	private GerenteDeResposta resposta;
	
	public SistemaFacade(){
		aluno=new GerenteDeAluno();
		professor=new GerenteDeProfessor();
		exercicios=new GerenciadorDeExercicios();
		pergunta=new GerenteDePergunta();
		resposta=new GerenteDeResposta();
	}
	
	public void cadastraAluno(String nome, String matricula, String senha, String email) throws AlunoJaExisteException{
		this.aluno.cadastraAluno(nome, matricula, senha, email);
	}
	
	public Aluno pesquisaAlunoPelaMatricula(String matricula) throws AlunoInexistenteException{
		return this.aluno.pesquisaAlunoPelaMatricula(matricula);
	}
	
	public void removeAlunoPelaMatricula(String matricula) throws AlunoInexistenteException{
		this.aluno.removeAlunoPelaMatricula(matricula);
	}
	
	public void cadastraProfessor(String nome, String matricula, String senha, String email) throws ProfessorJaExisteException{
		this.professor.cadastraProfessor(nome, matricula, senha, email);
	}
	
	public Professor pesquisaProfessorPelaMatricula(String matricula) throws ProfessorInexistenteException{
		return this.professor.pesquisaProfessorPelaMatricula(matricula);
	}
	
	public void removeProfessorPelaMatricula(String matricula) throws ProfessorInexistenteException{
		this.professor.removeProfessorPelaMatricula(matricula);
	}
	
	public void cadastraPerguntaDeMultiplaEscolha(String identificador, String questao, String resposta){
		this.pergunta.cadastraPerguntaDeMultiplaEscolha(identificador, questao, resposta);
	}
	
	public void cadastrarPerguntaVouF(String identificador, String questao, String resposta){
		this.pergunta.cadastrarPerguntaVouF(identificador, questao, resposta);
	}
	
	public void cadastrarPerguntaDissertativa(String identificador, String pergunta, String resposta){
		this.pergunta.cadastrarPerguntaDissertativa(identificador, pergunta, resposta);
	}
	
	public Pergunta pesquisarPergunta(String id) throws QuestaoInexistenteException{
		return pergunta.pesquisarPergunta(id);
	}
	
	public void cadastraRespostaDeMultiplaEscolha(String identificador, String respostaMultiplaEscolha){
		this.resposta.cadastraRespostaDeMultiplaEscolha(identificador, respostaMultiplaEscolha);
	}
	
	public void cadastrarRespostaVouF(String identificador, String respostaVouF){
		this.resposta.cadastrarRespostaVouF(identificador, respostaVouF);
	}
	
	public void cadastrarRespostaDissertativa(String identificador,String respostaDissertativa){
		this.resposta.cadastrarRespostaDissertativa(identificador, respostaDissertativa);
	}
	
	public boolean corrigirQuestaoDeMultiplaEscolha(String id, String resposta)throws QuestaoInexistenteException{
		return exercicios.corrigirQuestaoDeMultiplaEscolha(id, resposta);
	}
	
	public String corrigirQuestaoDissertativa(String id, String resposta)throws QuestaoInexistenteException{
		return exercicios.corrigirQuestaoDissertativa(id, resposta);
	}
	
	public boolean corrigirQuestaoVouF(String id, String resposta)throws QuestaoInexistenteException{
		return exercicios.corrigirQuestaoVouF(id, resposta);
	}
}
