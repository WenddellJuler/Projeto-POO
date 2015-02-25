package br.ufpb.projetoPoo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SistemaRemoveController implements ActionListener{

	GerenteAluno sisFacade;
	JFrame janelaPrincipal;
	
	public SistemaRemoveController(GerenteAluno sisFacade, JFrame janelaPrincipal){
		this.sisFacade=sisFacade;
		this.janelaPrincipal=janelaPrincipal;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String matricula = JOptionPane.showInputDialog(janelaPrincipal,"Informe sua matrícula:");
		try {
			sisFacade.removeAlunoPelaMatricula(matricula);
		} catch (AlunoInexistenteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		JOptionPane.showMessageDialog(janelaPrincipal,"Aluno Removido com sucesso!");
		
	}
	
	
	
	
	
}
