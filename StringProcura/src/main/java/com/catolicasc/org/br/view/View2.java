package com.catolicasc.org.br.view;

import com.catolicasc.org.br.Kmp;
import com.catolicasc.org.br.LeituraDeLinhas;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class View2 {

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
					View2 window = new View2();
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
	public View2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmView = new JFrame();
		frmView.setTitle("Ler Arquivo");
		frmView.setBounds(100, 100, 450, 300);
		frmView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmView.getContentPane().setLayout(null);
		
		jLTexto = new JLabel("Digite o nome do arquivo:");
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
				String textoBusca = jBuscaField.getText();
				String nomeArquivo = jTextField.getText();
				
				nomeArquivo = "C:\\Users\\Dayan\\Desktop\\"+nomeArquivo;
				System.out.println(nomeArquivo);
				
				LeituraDeLinhas arquivo = new LeituraDeLinhas(nomeArquivo);
				System.out.println(arquivo.getText());
				arquivo.readerFile();
				System.out.println(arquivo.getText());
				
				Kmp busca = new Kmp(textoBusca,arquivo.getText(),true);
				lblResposta.setText(busca.getMsg());
			}
		});
		
		jButtonBuscar.setBounds(40, 180, 150, 25);
		frmView.getContentPane().add(jButtonBuscar);
		
		lblResposta = new JLabel("Resposta");
		lblResposta.setBounds(40, 220,200,20);
		frmView.getContentPane().add(lblResposta);


	}
}
