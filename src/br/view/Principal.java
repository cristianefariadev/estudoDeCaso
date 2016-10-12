package br.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

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
					Principal frame = new Principal();
					frame.setVisible(true);
					LoginView frameLogin = new LoginView();
					frameLogin.setVisible(false);
					
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
		setIconImage(Toolkit.getDefaultToolkit().getImage(Principal.class.getResource("/image/icons/car.png")));
		getContentPane().setBackground(Color.WHITE);
		setTitle("LoCAR Express - Locadora de Ve\u00EDculos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 605);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnCadastro = new JMenu("Cadastro");
		menuBar.add(mnCadastro);

		JMenuItem mntmCliente = new JMenuItem("Cliente");
		mntmCliente.setIcon(new ImageIcon(Principal.class.getResource("/image/icons/user.png")));
		mnCadastro.add(mntmCliente);

		JMenuItem mntmVeiculo = new JMenuItem("Ve\u00EDculo");
		mntmVeiculo.setIcon(new ImageIcon(Principal.class.getResource("/image/icons/car.png")));
		mnCadastro.add(mntmVeiculo);

		JMenu mnPedido = new JMenu("Pedido");
		menuBar.add(mnPedido);

		JMenuItem mntmPedidoLocacao = new JMenuItem("Loca\u00E7\u00E3o");
		mntmPedidoLocacao.setIcon(new ImageIcon(Principal.class.getResource("/image/icons/page_white_put.png")));
		mnPedido.add(mntmPedidoLocacao);

		JMenuItem mntmPedidoDeDevoluo = new JMenuItem("Devolu\u00E7\u00E3o");
		mntmPedidoDeDevoluo.setIcon(new ImageIcon(Principal.class.getResource("/image/icons/page_white_get.png")));
		mnPedido.add(mntmPedidoDeDevoluo);

		JMenu mnRelatorios = new JMenu("Relat\u00F3rios");
		menuBar.add(mnRelatorios);

		JMenuItem mntmClientes = new JMenuItem("Clientes");
		mntmClientes.setIcon(new ImageIcon(Principal.class.getResource("/image/icons/user.png")));
		mnRelatorios.add(mntmClientes);

		JMenuItem mntmVeiculos = new JMenuItem("Ve\u00EDculos");
		mntmVeiculos.setIcon(new ImageIcon(Principal.class.getResource("/image/icons/car.png")));
		mnRelatorios.add(mntmVeiculos);

		JMenuItem mntmLocacao = new JMenuItem("Loca\u00E7\u00E3o");
		mntmLocacao.setIcon(new ImageIcon(Principal.class.getResource("/image/icons/page_white_put.png")));
		mnRelatorios.add(mntmLocacao);

		JMenuItem mntmDevolucao = new JMenuItem("Devolu\u00E7\u00E3o");
		mntmDevolucao.setIcon(new ImageIcon(Principal.class.getResource("/image/icons/page_white_get.png")));
		mnRelatorios.add(mntmDevolucao);
		getContentPane().setLayout(null);

	}
}
