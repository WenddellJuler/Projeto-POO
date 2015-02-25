package br.ufpb.projetoPoo;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class SistemaGUI extends JFrame {
	JLabel linha1,linha2;
	JButton botaoAddAluno, botaoPesquisarAluno, botaoRemoverAluno;
	GerenteAluno sisFacade = new GerenteAluno();
	public SistemaGUI(){
		setTitle("Sistema de Exercícios");
		setSize(600,400);
		setLocation(400,150);
		setResizable(true);
		getContentPane().setBackground(Color.DARK_GRAY);
		linha1 = new JLabel ("Sistema de Exercícios",JLabel.CENTER);
		linha1.setForeground(Color.orange);
		linha1.setFont(new Font("Serif", Font.BOLD,24));
		botaoAddAluno=new JButton("Adicionar Aluno");
		botaoAddAluno.addActionListener(new SistemaAddController(sisFacade, this));
		botaoPesquisarAluno=new JButton("Pesquisar Aluno");
		botaoPesquisarAluno.addActionListener(new SistemaSearchController(sisFacade, this));
		botaoRemoverAluno=new JButton("Remover Aluno");
		botaoRemoverAluno.addActionListener(new SistemaRemoveController(sisFacade, this));
		getContentPane().setLayout(new GridLayout(4,1));
		getContentPane().add(linha1);
		getContentPane().add(botaoAddAluno);
		getContentPane().add(botaoPesquisarAluno);
		//getContentPane().add(new JLabel());
		getContentPane().add(botaoRemoverAluno);
		
	
		
		
		
	}
	
	public static void main (String args[]){
		JFrame janela = new SistemaGUI();
		janela.setVisible(true);
		WindowListener fechadorDeJanelaPrincipal=new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		};
		janela.addWindowListener(fechadorDeJanelaPrincipal);
	}
}