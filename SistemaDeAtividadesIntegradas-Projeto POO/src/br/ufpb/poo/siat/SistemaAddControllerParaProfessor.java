package br.ufpb.poo.siat;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SistemaAddControllerParaProfessor implements ActionListener{

	GerenteDeProfessor sisFacade;
	
	JFrame janelaPrincipal;
	
	public SistemaAddControllerParaProfessor(GerenteDeProfessor sisFacade, JFrame janelaPrincipal){
		this.sisFacade=sisFacade;
		this.janelaPrincipal=janelaPrincipal;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String nome = JOptionPane.showInputDialog(janelaPrincipal,"Informe seu nome:");
		String matricula = JOptionPane.showInputDialog(janelaPrincipal,"Informe sua matrícula:");
		String senha = JOptionPane.showInputDialog(janelaPrincipal,"Informe uma senha:");
		String email = JOptionPane.showInputDialog(janelaPrincipal,"Informe um email válido:");
		try {
			sisFacade.cadastraProfessor(nome, matricula, senha, email);
		} catch (ProfessorJaExisteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		JOptionPane.showMessageDialog(janelaPrincipal,"Professor cadastrado com sucesso");
		// TODO Auto-generated method stub
		
	}
	

}


