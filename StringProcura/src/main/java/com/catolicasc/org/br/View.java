package com.catolicasc.org.br;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class View {

	private JFrame frmView;
	private JLabel jLTexto;
	private JTextField jTextField;
	private JLabel jLBusca;
	private JTextField jBuscaField;
	private JButton jButtonBuscar;
	private JLabel lblResposta;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View window = new View();
					window.frmView.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public View() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmView = new JFrame();
		frmView.setTitle("View1");
		frmView.setBounds(100, 100, 450, 300);
		frmView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmView.getContentPane().setLayout(null);
		
		jLTexto = new JLabel("Digite o Texto:");
		jLTexto.setBounds(40, 40, 100, 20);
		frmView.getContentPane().add(jLTexto);
		
		jTextField = new JTextField();
		jTextField.setBounds(40,70,100,20);
		frmView.getContentPane().add(jTextField);
		
		jLBusca = new JLabel("Digite o Texto de busca:");
		jLBusca.setBounds(40, 110, 122, 20);
		frmView.getContentPane().add(jLBusca);
		
		jBuscaField = new JTextField();
		jBuscaField.setBounds(40,150,100,20);
		frmView.getContentPane().add(jBuscaField);

		jButtonBuscar = new JButton("Buscar Palavra");
		jButtonBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String texto = jTextField.getText();
				String busca = jBuscaField.getText();
				
				Kmp b = new Kmp(busca,texto,true);
				lblResposta.setText(b.getMsg());
			}
		});
		
		jButtonBuscar.setBounds(40, 180, 150, 25);
		frmView.getContentPane().add(jButtonBuscar);
		
		lblResposta = new JLabel("Resposta");
		lblResposta.setBounds(40, 220,200,20);
		frmView.getContentPane().add(lblResposta);


	}
}
