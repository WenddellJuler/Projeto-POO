package br.ufpb.poo.siat;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SistemaFacadeTest {

	GerenteDeAluno aluno;
	GerenteDeProfessor professor;
	GerenteDePergunta pergunta;
	GerenteDeResposta resposta;
	GerenciadorDeExercicios exercicios;
	
	@Before
	public void setUp() throws Exception {
		
		aluno= new GerenteDeAluno();
		aluno.cadastraAluno("Wenddell", "123", "abc", "wenddell@dce");
		professor= new GerenteDeProfessor();
		professor.cadastraProfessor("Ayla", "333", "qwe", "ayla@dxe");
		pergunta= new GerenteDePergunta();
		pergunta.cadastraPerguntaDeMultiplaEscolha("01", "Ola, tudo bem? Sim ou Não?", "Sim");
		pergunta.cadastrarPerguntaDissertativa("02", "Disserte sobre você", "A resposta é pessoal");
		pergunta.cadastrarPerguntaVouF("03", "O sol é a única estrela no universo? Verdadeiro ou falso", "F");
		resposta= new GerenteDeResposta();
		resposta.cadastraRespostaDeMultiplaEscolha("01", "Sim");
		resposta.cadastrarRespostaDissertativa("02", "Eu sou paraibano");
		resposta.cadastrarRespostaVouF("03", "F");
		exercicios= new GerenciadorDeExercicios();
		exercicios.cadastrarPergunta(pergunta.pesquisarPergunta("01"));
		//GerenciadorDeExercicios exerciciosVouF= new GerenciadorDeExercicios();
		//exerciciosVouF.cadastrarPergunta(pergunta.pesquisarPergunta("03"));
		
	}

	@Test
	public void testCadastraAluno() {
		Aluno a1=new Aluno("Wenddell", "123", "abc", "wenddell@dce");
		assertEquals("Wenddell",a1.getNome());
	}

	@Test
	public void testPesquisaAlunoPelaMatricula() throws AlunoInexistenteException {
		Aluno a2=aluno.pesquisaAlunoPelaMatricula("123");
		assertEquals("123",a2.getMatricula());
	}

	@Test
	public void testRemoveAlunoPelaMatricula()  {
		try {
			aluno.removeAlunoPelaMatricula("123");
			Aluno a2=aluno.pesquisaAlunoPelaMatricula("123");
			fail("Não deveria encontrar o aluno");
		} catch (AlunoInexistenteException e) {
			System.out.println("Exceção esperada");
		}
		
	}

	@Test
	public void testCadastraProfessor() {
		Professor p1= new Professor("Ayla","333","qwe","ayla@dxe");
		assertEquals("Ayla",p1.getNome());
	}
	
	@Test
	public void testPesquisaProfessorPelaMatricula() throws ProfessorInexistenteException{
		Professor p2=professor.pesquisaProfessorPelaMatricula("333");
		assertEquals("333",p2.getMatricula());
	}

	@Test
	public void testRemoveProfessorPelaMatricula() {
		try {
			professor.removeProfessorPelaMatricula("333");
			Professor p2=professor.pesquisaProfessorPelaMatricula("333");
			fail("Não deveria encontrar o professor");
		} catch (ProfessorInexistenteException e) {
			System.out.println("Exceção esperada");
		}
	}
	
	@Test
	public void testCadastraPerguntaDeMultiplaEscolha() {
		Pergunta p=new Pergunta("01", "Ola, tudo bem? Sim ou Não?", "Sim");
		assertEquals("01",p.getIdentificador());
	}

	@Test
	public void testCadastrarPerguntaVouF() {
		Pergunta per2=new Pergunta("03", "O sol é a única estrela no universo? Verdadeiro ou falso", "Falso");
		assertEquals("03",per2.getIdentificador());
	}

	@Test
	public void testCadastrarPerguntaDissertativa() {
		Pergunta per3= new Pergunta("02", "Disserte sobre você", "A resposta é pessoal");
		assertEquals("02",per3.getIdentificador());
	}
	
	@Test
	public void testPesquisarPergunta() throws QuestaoInexistenteException {
		Pergunta per4=pergunta.pesquisarPergunta("02");
		assertEquals("Disserte sobre você",per4.getPergunta());
	}

	@Test
	public void testCadastraRespostaDeMultiplaEscolha() {
		Resposta r1= new Resposta("01", "Sim");
		assertEquals("Sim",r1.getResposta());
	}
	
	@Test
	public void testCadastrarRespostaVouF() {
		Resposta r2= new Resposta("03","F");
		assertEquals("F",r2.getResposta());
	}

	@Test
	public void testCadastrarRespostaDissertativa() {
		Resposta r3= new Resposta("02", "Eu sou paraibano");
		assertEquals("02",r3.getIdentificador());
	}

	@Test
	public void testCorrigirQuestaoDeMultiplaEscolha() throws QuestaoInexistenteException {
		boolean acertou=exercicios.corrigirQuestaoDeMultiplaEscolha("01", "Sim");
		assertTrue(acertou);		
	}
	
}
