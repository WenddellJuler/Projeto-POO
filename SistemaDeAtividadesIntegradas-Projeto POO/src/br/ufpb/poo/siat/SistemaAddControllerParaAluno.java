package br.ufpb.poo.siat;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SistemaAddControllerParaAluno implements ActionListener{

	GerenteDeAluno sisFacadeParaAluno;
	
	JFrame janelaPrincipal;
	
	public SistemaAddControllerParaAluno(GerenteDeAluno sisFacade, JFrame janelaPrincipal){
		this.sisFacadeParaAluno=sisFacade;
		this.janelaPrincipal=janelaPrincipal;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String nome = JOptionPane.showInputDialog(janelaPrincipal,"Informe seu nome:");
		String matricula = JOptionPane.showInputDialog(janelaPrincipal,"Informe sua matr�cula:");
		String senha = JOptionPane.showInputDialog(janelaPrincipal,"Informe uma senha:");
		String email = JOptionPane.showInputDialog(janelaPrincipal,"Informe um email v�lido:");
		try {
			sisFacadeParaAluno.cadastraAluno(nome, matricula, senha, email);
		} catch (AlunoJaExisteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		JOptionPane.showMessageDialog(janelaPrincipal,"Aluno cadastrado com sucesso");
		// TODO Auto-generated method stub
		
	}
	

}

