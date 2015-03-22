package br.ufpb.poo.siat;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SistemaSearchContollerParaProfessor implements ActionListener{
	



		GerenteDeProfessor sisFacade;
		JFrame janelaPrincipal;
		
		public SistemaSearchContollerParaProfessor(GerenteDeProfessor sisFacade, JFrame janelaPrincipal){
			this.sisFacade=sisFacade;
			this.janelaPrincipal=janelaPrincipal;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			String matricula = JOptionPane.showInputDialog(janelaPrincipal,"Informe sua matrícula:");
			try {
				sisFacade.pesquisaProfessorPelaMatricula(matricula);
			} catch (ProfessorInexistenteException e1) {
				
				e1.printStackTrace();
			}
			
			try {
				JOptionPane.showMessageDialog(janelaPrincipal,"Dados do Professor: \n NOME: "+sisFacade.pesquisaProfessorPelaMatricula(matricula));
			} catch (HeadlessException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (ProfessorInexistenteException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		

	}
}

