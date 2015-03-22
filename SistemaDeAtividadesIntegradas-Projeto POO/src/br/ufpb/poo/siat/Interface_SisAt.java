package br.ufpb.poo.siat;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interface_SisAt extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	GerenteDeAluno sisFacade = new GerenteDeAluno();
	GerenteDeProfessor sisFacadeProf= new GerenteDeProfessor();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface_SisAt frame = new Interface_SisAt();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Interface_SisAt() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSistemaDeAtividades = new JLabel("Sistema de Atividades Integradas");
		lblSistemaDeAtividades.setBounds(10, 11, 319, 14);
		contentPane.add(lblSistemaDeAtividades);
		
		JLabel lblFazerLogin = new JLabel("FAZER LOGIN");
		lblFazerLogin.setBounds(102, 63, 92, 14);
		contentPane.add(lblFazerLogin);
		
		JLabel lblMatrcula = new JLabel("MATR\u00CDCULA");
		lblMatrcula.setBounds(10, 81, 92, 14);
		contentPane.add(lblMatrcula);
		
		textField = new JTextField();
		textField.setBounds(84, 78, 106, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblSenha = new JLabel("SENHA");
		lblSenha.setBounds(10, 106, 46, 14);
		contentPane.add(lblSenha);
		
		textField_1 = new JTextField();
		textField_1.setBounds(84, 106, 106, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnEntrar = new JButton("ENTRAR");
		btnEntrar.setBounds(84, 133, 106, 23);
		contentPane.add(btnEntrar);
		
		
		JLabel lblNoCadastrado = new JLabel("N\u00C3O \u00C9 CADASTRADO? ");
		lblNoCadastrado.setBounds(93, 186, 132, 14);
		contentPane.add(lblNoCadastrado);
		
		JButton btnCadastroProfessor = new JButton("CADASTRE-SE COMO PROFESSOR");
		btnCadastroProfessor.setBounds(10, 203, 282, 23);
		contentPane.add(btnCadastroProfessor);
		btnCadastroProfessor.addActionListener(new SistemaAddControllerParaProfessor(sisFacadeProf, this));
		
		JButton  btnCadastroAluno= new JButton("CADASTRE-SE COMO ALUNO");
		btnCadastroAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCadastroAluno.setBounds(10, 227, 282, 23);
		contentPane.add(btnCadastroAluno);
		
		btnCadastroAluno.addActionListener(new SistemaAddControllerParaAluno(sisFacade, this));
		
	}

}
