package br.ufpb.projetoPoo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SistemaSearchController implements ActionListener{

	GerenteAluno sisFacade;
	JFrame janelaPrincipal;
	
	public SistemaSearchController(GerenteAluno sisFacade, JFrame janelaPrincipal){
		this.sisFacade=sisFacade;
		this.janelaPrincipal=janelaPrincipal;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String matricula = JOptionPane.showInputDialog(janelaPrincipal,"Informe sua matrícula:");
		try {
			sisFacade.pesquisaAlunoPelaMatricula(matricula);
		} catch (AlunoInexistenteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		JOptionPane.showMessageDialog(janelaPrincipal,"Dados do Aluno:");
		
	}

}
