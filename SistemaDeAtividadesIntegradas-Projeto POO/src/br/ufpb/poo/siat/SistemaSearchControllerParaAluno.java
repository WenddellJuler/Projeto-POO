package br.ufpb.poo.siat;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SistemaSearchControllerParaAluno implements ActionListener{

	GerenteDeAluno sisFacade;
	JFrame janelaPrincipal;
	
	public SistemaSearchControllerParaAluno(GerenteDeAluno sisFacade, JFrame janelaPrincipal){
		this.sisFacade=sisFacade;
		this.janelaPrincipal=janelaPrincipal;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String matricula = JOptionPane.showInputDialog(janelaPrincipal,"Informe sua matrícula:");
		try {
			sisFacade.pesquisaAlunoPelaMatricula(matricula);
		} catch (AlunoInexistenteException e1) {
			
			e1.printStackTrace();
		}
		
		try {
			JOptionPane.showMessageDialog(janelaPrincipal,"Dados do Aluno: \n NOME: "+sisFacade.pesquisaAlunoPelaMatricula(matricula));
		} catch (HeadlessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (AlunoInexistenteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

}
