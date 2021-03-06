package com.catolicasc.org.br.view;

import java.io.File;
import javax.swing.JTextField;

import com.catolicasc.org.br.KmpA;
import com.catolicasc.org.br.LeituraDeLinhas;
import com.catolicasc.org.br.NaiveA;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JComboBox;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author israel.cadorin
 */
public class BrowserView extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public BrowserView() {
    	setTitle("Browser View");
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabelTesxtoBusca = new javax.swing.JLabel();
        jTextFieldTextoBusca = new javax.swing.JTextField();
        jButtonBusca = new javax.swing.JButton();
        jLabelLocalArquivo = new javax.swing.JLabel();
        jTextFieldLocalArquivo = new javax.swing.JTextField();
        jButtonBrowser = new javax.swing.JButton();
        jLabelResposta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTesxtoBusca.setText("Digite o texto de busca:");
        jLabelTesxtoBusca.setToolTipText("");

        jTextFieldTextoBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTextoBuscaActionPerformed(evt);
            }
        });

        jButtonBusca.setText("Buscar Por Padrão");
        jButtonBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscaActionPerformed(evt);
            }
        });

        jLabelLocalArquivo.setText("Local do Arquivo:");

        jButtonBrowser.setText("Browser...");
        jButtonBrowser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBrowserActionPerformed(evt);
            }
        });
        
        comboBox = new JComboBox();
        comboBox.setModel(new DefaultComboBoxModel(new String[] {"Naive", "Kmp"}));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addGap(137)
        							.addComponent(jLabelTesxtoBusca, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addGap(7))
        						.addGroup(layout.createSequentialGroup()
        							.addContainerGap()
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jTextFieldLocalArquivo, GroupLayout.PREFERRED_SIZE, 295, GroupLayout.PREFERRED_SIZE)
        								.addComponent(jLabelLocalArquivo))))
        					.addGap(12)
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(jButtonBrowser)
        						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jTextFieldTextoBusca, 411, 411, 411)
        						.addComponent(jButtonBusca, GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
        						.addComponent(jLabelResposta, GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE))))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabelTesxtoBusca, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jTextFieldTextoBusca, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(jLabelLocalArquivo, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(3)
        					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(jButtonBrowser, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        				.addComponent(jTextFieldLocalArquivo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18, 18, Short.MAX_VALUE)
        			.addComponent(jButtonBusca)
        			.addGap(43)
        			.addComponent(jLabelResposta, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>                        

    private void jTextFieldTextoBuscaActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
    }                                                    

    private void jButtonBrowserActionPerformed(java.awt.event.ActionEvent evt) {                                               

        JFileChooser file = new JFileChooser();
        file.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int i = file.showSaveDialog(null);
        
        if(i == 1) {
            jTextFieldLocalArquivo.setText(" ");
        }else {
            File arquivo = file.getSelectedFile();
            jTextFieldLocalArquivo.setText(arquivo.getPath());
        }
    }                                              

    private void jButtonBuscaActionPerformed(java.awt.event.ActionEvent evt) {                                             
    	String busca = jTextFieldTextoBusca.getText();
    	String caminhoDoArquivo = jTextFieldLocalArquivo.getText();
    	String resposta = "Problema não encontrado!";
    	
    	if(busca.isEmpty() == false) {
    		resposta = "Tem texto!";
    		if(caminhoDoArquivo.isEmpty() == false) {
    			int metodo = comboBox.getSelectedIndex();
    			resposta = "Tem diretório do arquivo!";
    			LeituraDeLinhas arquivo = new LeituraDeLinhas(caminhoDoArquivo);
    			arquivo.readerFile();
    			String conteudoDoArquivo = arquivo.getText();
    			    	    	
    			if(metodo == 1) {
    				KmpA kmp = new KmpA(busca, conteudoDoArquivo);
        			kmp.buscar();
        			resposta = kmp.getResposta();
        			
        			if( resposta == null ) {
        				kmp.setResposta("Padrão não encontrado!");
        				resposta = kmp.getResposta();
        			}	
    			}else if(metodo == 0) {
    				NaiveA naive= new NaiveA(busca, conteudoDoArquivo);
    				naive.buscar();
        			resposta = naive.getResposta();
        			
        			if( resposta == null ) {
        				naive.setResposta("Padrão não encontrado!");
        				resposta = naive.getResposta();
        			}
    			}
    		    			
    		}else {
    			resposta = "Não tem diretório do arquivo!";
    		}
    	}else {
    		resposta = "Texto de Busca não foi inserido!";
    	}
    	jLabelResposta.setText(resposta);
    }                                            

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BrowserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BrowserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BrowserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BrowserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BrowserView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButtonBrowser;
    private javax.swing.JButton jButtonBusca;
    private javax.swing.JLabel jLabelLocalArquivo;
    private javax.swing.JLabel jLabelResposta;
    private javax.swing.JLabel jLabelTesxtoBusca;
    private javax.swing.JTextField jTextFieldLocalArquivo;
    private javax.swing.JTextField jTextFieldTextoBusca;
    private JComboBox comboBox;
    // End of variables declaration                   
}