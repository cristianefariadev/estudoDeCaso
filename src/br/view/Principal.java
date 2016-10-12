package br.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;

public class Principal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

SplashView splash = new SplashView();
					splash.setVisible(true);
					//Principal frame = new Principal();
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
			setTitle("Locação de veículos");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 675, 594);
			
			JMenuBar menuBar = new JMenuBar();
			setJMenuBar(menuBar);
			
			JMenu mnCadastro = new JMenu("Cadastro");
			menuBar.add(mnCadastro);
			
			JMenuItem mntmManterCliente = new JMenuItem("Manter Cliente");
			mnCadastro.add(mntmManterCliente);
			
			JMenu mnPedidoLocacao = new JMenu("Pedido de Loca\u00E7\u00E3o");
			menuBar.add(mnPedidoLocacao);
			
			JMenuItem mnAbrirPedidoLocacao = new JMenuItem("Abri Pedido Locacao");
			mnPedidoLocacao.add(mnAbrirPedidoLocacao);
			
			JMenu mnRelatorios = new JMenu("Relat\u00F3rios");
			menuBar.add(mnRelatorios);
			
			JMenuItem mntmManterOcorrencia = new JMenuItem("Manter Ocorrencia");
			mnRelatorios.add(mntmManterOcorrencia);
			getContentPane().setLayout(null);
			
			
		}
	}
