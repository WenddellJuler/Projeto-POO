package br.ufpb.projetoPoo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GerenteAlunoTest {

	GerenteAluno aluno; 
	
	@Before
	public void setUp() throws Exception {
		aluno=new GerenteAluno();
		aluno.cadastraAluno("Wenddell", "123", "987", "wenddell@dce");
	
	}

	@Test
	public void testPesquisaAlunoPelaMatricula() throws AlunoInexistenteException {
		Aluno a=aluno.pesquisaAlunoPelaMatricula("123");
		assertEquals("123",a.getMatricula());
	}

	@Test
	public void testRemoveAlunoPelaMatricula() {
		Aluno a2=aluno.removeAlunoPelaMatricula("123");
		assertEquals(null, a2.getMatricula());
		
	}
	//Entender esse erro 

}
