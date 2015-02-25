package br.ufpb.projetoPoo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SistemaAddController implements ActionListener{

	GerenteAluno sisFacade;
	JFrame janelaPrincipal;
	
	public SistemaAddController(GerenteAluno sisFacade, JFrame janelaPrincipal){
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
			sisFacade.cadastraAluno(nome, matricula, senha, email);
		} catch (AlunoJaExisteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		JOptionPane.showMessageDialog(janelaPrincipal,"Aluno cadastrado com sucesso");
		// TODO Auto-generated method stub
		
	}
	

}
