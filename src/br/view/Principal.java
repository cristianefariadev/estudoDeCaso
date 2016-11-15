package br.view;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import br.control.ClienteCtr;
import br.control.NavegadorCardCtr;

public class Principal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtCep;
	private JTextField txtRegistroCnh;
	private JTextField txtNomeCompleto;
	private JTextField txtRg;
	private JTextField txtTelefone;
	private JTextField txtEmail;
	private JTextField txtCpf;
	private JTextField txtBairro;
	private JTextField txtRegistroCnhLocacao;
	private JTextField txtCpfLocacao;
	private JTextField txtDtLocacao;
	private JTextField txtDtDevolucao;
	private JTextField txtQuantidadeDiasLocado;
	private JTextField txtQuantidadeKm;
	private JTextField txtValorApagar;
	private JTextField txtValorCaucao;
	private JTextField txtEndereco_1;
	private JTextField txtValorCobrado;
	private JTextField txtValorAtualizado;
	private JTextField txtValorArever;
	private JTextField txtValorcaucao;
	private JTextField txtPlaca;
	private JTextField txtChassi;
	private JTextField txtCor;
	private JTextField txtValortotal;
	private JTextField txtDatapagamento;
	private JTextField txtValorrecebido;
	private JTextField txtTroco;
	private JPanel panelCardLayout;
	private JPanel cardClientes;
	private JPanel cardHome;
	private NavegadorCardCtr navegadorCard;

	private CardLayout card;
	private JTextField txtValorapagar;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField txtPesquisarcodigolocacao;
	private JTextField txtSaldoCaixa;
	private JTextField txtDataCaixa;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);;  
					frame.setSize(800, 605);  
					frame.setDefaultCloseOperation(EXIT_ON_CLOSE); 
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
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 812, 605);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		card = new CardLayout();
		panelCardLayout = new JPanel();
		panelCardLayout.setLayout(card);
		navegadorCard = new NavegadorCardCtr(panelCardLayout,card);
		
		panelCardLayout.setBounds(0, 68, 794, 486);
		contentPane.add(panelCardLayout);
		
	

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 794, 21);
		contentPane.add(menuBar);

			JMenu mnCadastro = new JMenu("Cadastro");
			menuBar.add(mnCadastro);
	
				JMenuItem mntmCliente = new JMenuItem("Cliente");
				mntmCliente.setIcon(new ImageIcon(Principal.class.getResource("/image/icons/user.png")));
				mntmCliente.addActionListener(navegadorCard);
				mnCadastro.add(mntmCliente);
		
				JMenuItem mntmVeiculo = new JMenuItem("Veiculo");
				mntmVeiculo.setIcon(new ImageIcon(Principal.class.getResource("/image/icons/car.png")));
				mntmVeiculo.addActionListener(navegadorCard);
				mnCadastro.add(mntmVeiculo);
	
			JMenu mnPedido = new JMenu("Pedido");
			menuBar.add(mnPedido);
	
				JMenuItem mntmPedidoLocacao = new JMenuItem("Loca\u00E7\u00E3o");
				mntmPedidoLocacao.setIcon(new ImageIcon(Principal.class.getResource("/image/icons/page_white_put.png")));
				mntmPedidoLocacao.addActionListener(navegadorCard);
				mnPedido.add(mntmPedidoLocacao);
	
				JMenuItem mntmPedidoDeDevolucao = new JMenuItem("Devolu\u00E7\u00E3o");
				mntmPedidoDeDevolucao.setIcon(new ImageIcon(Principal.class.getResource("/image/icons/page_white_get.png")));
				mntmPedidoDeDevolucao.addActionListener(navegadorCard);
				mnPedido.add(mntmPedidoDeDevolucao);
	
			JMenu mnFinanceiro = new JMenu("Financeiro");
			menuBar.add(mnFinanceiro);
	
				JMenuItem mntmCaixa = new JMenuItem("Caixa");
				mntmCaixa.setIcon(new ImageIcon(Principal.class.getResource("/image/icons/calculator.png")));
				mntmCaixa.addActionListener(navegadorCard);
				mnFinanceiro.add(mntmCaixa);
	
			JMenu mnAjuda = new JMenu("Ajuda");
			menuBar.add(mnAjuda);
			
			JMenuItem mntmDocumentação = new JMenuItem("Documenta\u00E7\u00E3o");
			mntmDocumentação.setIcon(new ImageIcon(Principal.class.getResource("/image/icons/application_error.png")));
			mnAjuda.add(mntmDocumentação);
	
			
		

		JPanel panelMenus = new JPanel();
		panelMenus.setBounds(0, 22, 794, 45);
		contentPane.add(panelMenus);
		panelMenus.setLayout(null);
		
		
		
			JButton btnInicioMenu = new JButton("Home");
			btnInicioMenu.addActionListener(navegadorCard);
			btnInicioMenu.setIcon(new ImageIcon(Principal.class.getResource("/image/icons/house.png")));
			btnInicioMenu.setBounds(49, 11, 98, 23);
			panelMenus.add(btnInicioMenu);

			JButton btnClienteMenu = new JButton("Cliente");
			btnClienteMenu.addActionListener(navegadorCard);
			btnClienteMenu.setIcon(new ImageIcon(Principal.class.getResource("/image/icons/user.png")));
			btnClienteMenu.setBounds(157, 10, 120, 24);
			panelMenus.add(btnClienteMenu);
	
			JButton btnLocacaoMenu = new JButton("Loca\u00E7\u00E3o");
			btnLocacaoMenu.addActionListener(navegadorCard);
			btnLocacaoMenu.setIcon(new ImageIcon(Principal.class.getResource("/image/icons/page_white_get.png")));
			btnLocacaoMenu.setBounds(287, 11, 117, 23);
			panelMenus.add(btnLocacaoMenu);
	
			JButton btnDevolucaoMenu = new JButton("Devolu\u00E7\u00E3o");
			btnDevolucaoMenu.addActionListener(navegadorCard);
			btnDevolucaoMenu.setIcon(new	ImageIcon(Principal.class.getResource("/image/icons/page_white_put.png")));
			btnDevolucaoMenu.setBounds(414, 11, 117, 23);
			panelMenus.add(btnDevolucaoMenu);
	
			JButton btnPagamentoMenu = new JButton("Caixa");
			btnPagamentoMenu.addActionListener(navegadorCard);
			btnPagamentoMenu.setIcon(new ImageIcon(Principal.class.getResource("/image/icons/calculator.png")));
			btnPagamentoMenu.setBounds(541, 11, 120, 23);
			panelMenus.add(btnPagamentoMenu);
	
			JButton btnSairMenu = new JButton("Sair");
			btnSairMenu.addActionListener(navegadorCard);
			btnSairMenu.setIcon(new ImageIcon(Principal.class.getResource("/image/icons/cross.png")));
			btnSairMenu.setBounds(671, 11, 78, 23);
			panelMenus.add(btnSairMenu);

		
		
				cardHome = new JPanel();
				cardHome.setBackground(Color.WHITE);
				panelCardLayout.add(cardHome, "cardHome");
					cardHome.setLayout(null);
		
					JLabel lblNewLabel = new JLabel("");
					lblNewLabel.setBounds(266, 200, 262, 85);
					lblNewLabel.setIcon(new ImageIcon(Principal.class.getResource("/image/logo.png")));
					cardHome.add(lblNewLabel);
		
				cardClientes = new JPanel();
				panelCardLayout.add(cardClientes, "cardClientes");
				cardClientes.setBackground(Color.WHITE);
				cardClientes.setLayout(null);
			
					JPanel panelConteudoCliente = new JPanel();
					panelConteudoCliente.setBackground(Color.WHITE);
					panelConteudoCliente.setLayout(null);
					panelConteudoCliente.setBorder(new TitledBorder(new CompoundBorder(), "CADASTRAR CLIENTE", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
					panelConteudoCliente.setBounds(32, 47, 737, 396);
					cardClientes.add(panelConteudoCliente);
			
					JLabel label = new JLabel("Nome Completo:");
					label.setBounds(195, 37, 94, 14);
					panelConteudoCliente.add(label);
			
					JLabel label_1 = new JLabel("Telefone:");
					label_1.setBounds(324, 90, 57, 14);
					panelConteudoCliente.add(label_1);
			
					txtCodigo = new JTextField();
					txtCodigo.setEnabled(false);
					txtCodigo.setColumns(10);
					txtCodigo.setBounds(10, 55, 160, 20);
					panelConteudoCliente.add(txtCodigo);
			
					JButton btnSalvarCliente = new JButton("Salvar");
					btnSalvarCliente.setIcon(new ImageIcon(Principal.class.getResource("/image/icons/accept.png")));
					btnSalvarCliente.setBounds(583, 299, 94, 20);
					panelConteudoCliente.add(btnSalvarCliente);
			
					JButton btnLimparCliente = new JButton("Limpar");
					btnLimparCliente.setIcon(new ImageIcon(Principal.class.getResource("/image/icons/cancel.png")));
					btnLimparCliente.setBounds(463, 299, 110, 20);
					panelConteudoCliente.add(btnLimparCliente);
			
					JLabel label_2 = new JLabel("RG:");
					label_2.setBounds(195, 90, 89, 14);
					panelConteudoCliente.add(label_2);
			
					JLabel lblNRegistroCnh = new JLabel("N\u00BA Registro CNH:");
					lblNRegistroCnh.setHorizontalAlignment(SwingConstants.LEFT);
					lblNRegistroCnh.setBounds(467, 37, 139, 14);
					panelConteudoCliente.add(lblNRegistroCnh);
			
					JLabel label_4 = new JLabel("C\u00F3digo de Registro");
					label_4.setBounds(10, 37, 160, 14);
					panelConteudoCliente.add(label_4);
			
					JLabel label_5 = new JLabel("CPF:");
					label_5.setBounds(10, 90, 128, 14);
					panelConteudoCliente.add(label_5);
			
					JLabel label_6 = new JLabel("Sexo:");
					label_6.setBounds(614, 37, 46, 14);
					panelConteudoCliente.add(label_6);
			
					JComboBox cbSexo = new JComboBox();
					cbSexo.setModel(new DefaultComboBoxModel(new String[] {"F", "M"}));
					cbSexo.setBounds(612, 55, 65, 20);
					panelConteudoCliente.add(cbSexo);
			
					JLabel label_7 = new JLabel("Endere\u00E7o:");
					label_7.setBounds(195, 154, 65, 14);
					panelConteudoCliente.add(label_7);
			
					JLabel label_8 = new JLabel("CEP:");
					label_8.setBounds(10, 154, 46, 14);
					panelConteudoCliente.add(label_8);
			
					txtCep = new JTextField();
					txtCep.setColumns(10);
					txtCep.setBounds(10, 171, 128, 20);
					panelConteudoCliente.add(txtCep);
			
					JComboBox cbEstado = new JComboBox();
					cbEstado.setModel(new DefaultComboBoxModel(new String[] {"GO\u00CDAS"}));
					cbEstado.setBounds(467, 234, 210, 20);
					panelConteudoCliente.add(cbEstado);
			
					JComboBox cbCidade = new JComboBox();
					cbCidade.setModel(new DefaultComboBoxModel(new String[] {"GOI\u00C2NIA", "AN\u00C1POLIS", "NER\u00D3POLIS"}));
					cbCidade.setBounds(195, 234, 245, 20);
					panelConteudoCliente.add(cbCidade);
			
					JLabel label_9 = new JLabel("Estado:");
					label_9.setBounds(467, 216, 46, 14);
					panelConteudoCliente.add(label_9);
			
					JLabel label_10 = new JLabel("Cidade:");
					label_10.setBounds(195, 216, 46, 14);
					panelConteudoCliente.add(label_10);
			
					JLabel label_11 = new JLabel("Bairro:");
					label_11.setBounds(10, 216, 46, 14);
					panelConteudoCliente.add(label_11);
			
					JButton btnPesquisarCep = new JButton("");
					btnPesquisarCep.setIcon(new ImageIcon(Principal.class.getResource("/image/icons/zoom.png")));
					btnPesquisarCep.setBounds(145, 168, 25, 23);
					panelConteudoCliente.add(btnPesquisarCep);
			
					JLabel label_12 = new JLabel("E-mail:");
					label_12.setBounds(467, 90, 46, 14);
					panelConteudoCliente.add(label_12);
			
					txtRegistroCnh = new JTextField();
					txtRegistroCnh.setColumns(10);
					txtRegistroCnh.setBounds(464, 55, 123, 20);
					panelConteudoCliente.add(txtRegistroCnh);
			
					txtNomeCompleto = new JTextField();
					txtNomeCompleto.setColumns(10);
					txtNomeCompleto.setBounds(195, 55, 245, 20);
					panelConteudoCliente.add(txtNomeCompleto);
			
					txtRg = new JTextField();
					txtRg.setColumns(10);
					txtRg.setBounds(195, 109, 100, 20);
					panelConteudoCliente.add(txtRg);
			
					txtTelefone = new JTextField();
					txtTelefone.setColumns(10);
					txtTelefone.setBounds(324, 109, 116, 20);
					panelConteudoCliente.add(txtTelefone);
			
					txtEmail = new JTextField();
					txtEmail.setColumns(10);
					txtEmail.setBounds(468, 109, 209, 20);
					panelConteudoCliente.add(txtEmail);
			
					txtCpf = new JTextField();
					txtCpf.setColumns(10);
					txtCpf.setBounds(10, 109, 160, 20);
					panelConteudoCliente.add(txtCpf);
			
					txtBairro = new JTextField();
					txtBairro.setColumns(10);
					txtBairro.setBounds(10, 234, 157, 20);
					panelConteudoCliente.add(txtBairro);
			
					JButton btnNovoCliente = new JButton("Novo Cliente");
					btnNovoCliente.setIcon(new ImageIcon(Principal.class.getResource("/image/icons/add.png")));
					btnNovoCliente.setBounds(324, 299, 129, 20);
					panelConteudoCliente.add(btnNovoCliente);
			
					txtEndereco_1 = new JTextField();
					txtEndereco_1.setBounds(195, 171, 481, 20);
					panelConteudoCliente.add(txtEndereco_1);
					txtEndereco_1.setColumns(10);
					
		
						JButton btnPesquisarCliente = new JButton("Pesquisar Cliente");
						btnPesquisarCliente.setIcon(new ImageIcon(Principal.class.getResource("/image/icons/zoom.png")));
						btnPesquisarCliente.setBounds(549, 11, 164, 25);
						cardClientes.add(btnPesquisarCliente);
						
					
					

			JPanel cardVeiculos = new JPanel();
			cardVeiculos.setBackground(Color.WHITE);
			panelCardLayout.add(cardVeiculos, "cardVeiculos");
				cardVeiculos.setLayout(null);
			
				JButton btnPesquisarVeiculo = new JButton("Pesquisar Veiculo");
				btnPesquisarVeiculo.setIcon(new ImageIcon(Principal.class.getResource("/image/icons/zoom.png")));
				btnPesquisarVeiculo.setBounds(578, 11, 166, 23);
				cardVeiculos.add(btnPesquisarVeiculo);
		
				JPanel panelConteudoVeiculos = new JPanel();
				panelConteudoVeiculos.setBackground(Color.WHITE);
				panelConteudoVeiculos.setBorder(
						new TitledBorder(UIManager.getBorder("TitledBorder.border"), "CADASTRAR VE\u00CDCULO", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				panelConteudoVeiculos.setBounds(34, 65, 710, 369);
				cardVeiculos.add(panelConteudoVeiculos);
				panelConteudoVeiculos.setLayout(null);
		
				JLabel lblModelo = new JLabel("Modelo:");
				lblModelo.setBounds(207, 27, 46, 14);
				panelConteudoVeiculos.add(lblModelo);
		
				JComboBox cbModeloVeiculo = new JComboBox();
				cbModeloVeiculo.setModel(new DefaultComboBoxModel(new String[] {"FORD"}));
				cbModeloVeiculo.setBounds(207, 45, 180, 20);
				panelConteudoVeiculos.add(cbModeloVeiculo);
		
				JComboBox cbMarcaVeiculo = new JComboBox();
				cbMarcaVeiculo.setModel(new DefaultComboBoxModel(new String[] {"FUSION"}));
				cbMarcaVeiculo.setBounds(437, 45, 196, 20);
				panelConteudoVeiculos.add(cbMarcaVeiculo);
		
				JLabel lblMarca = new JLabel("Marca:");
				lblMarca.setBounds(437, 27, 46, 14);
				panelConteudoVeiculos.add(lblMarca);
		
				JLabel lblAnoDeFabricao = new JLabel("Ano de Fabrica\u00E7\u00E3o:");
				lblAnoDeFabricao.setBounds(26, 27, 109, 14);
				panelConteudoVeiculos.add(lblAnoDeFabricao);
		
				JComboBox cbAnoFabricacao = new JComboBox();
				cbAnoFabricacao.setModel(new DefaultComboBoxModel(new String[] {"2016"}));
				cbAnoFabricacao.setBounds(26, 45, 129, 20);
				panelConteudoVeiculos.add(cbAnoFabricacao);
		
				JLabel lblPlaca = new JLabel("Placa:");
				lblPlaca.setBounds(207, 76, 46, 14);
				panelConteudoVeiculos.add(lblPlaca);
		
				txtPlaca = new JTextField();
				txtPlaca.setBounds(207, 93, 180, 20);
				panelConteudoVeiculos.add(txtPlaca);
				txtPlaca.setColumns(10);
		
				JLabel lblChassi = new JLabel("Chassi:");
				lblChassi.setBounds(437, 76, 46, 14);
				panelConteudoVeiculos.add(lblChassi);
		
				txtChassi = new JTextField();
				txtChassi.setBounds(437, 93, 196, 20);
				panelConteudoVeiculos.add(txtChassi);
				txtChassi.setColumns(10);
		
				JLabel lblCor = new JLabel("Cor:");
				lblCor.setBounds(26, 78, 46, 14);
				panelConteudoVeiculos.add(lblCor);
		
				txtCor = new JTextField();
				txtCor.setBounds(26, 93, 129, 20);
				panelConteudoVeiculos.add(txtCor);
				txtCor.setColumns(10);
		
				JCheckBox checkBox_6 = new JCheckBox("DVD Player");
				checkBox_6.setBounds(207, 175, 97, 23);
				panelConteudoVeiculos.add(checkBox_6);
		
				JCheckBox checkBox_7 = new JCheckBox("C\u00E2mbio Autom\u00E1tico");
				checkBox_7.setSelected(true);
				checkBox_7.setBounds(26, 175, 129, 23);
				panelConteudoVeiculos.add(checkBox_7);
		
				JCheckBox checkBox_8 = new JCheckBox("Ar Condicionado");
				checkBox_8.setSelected(true);
				checkBox_8.setBounds(26, 149, 129, 23);
				panelConteudoVeiculos.add(checkBox_8);
		
				JCheckBox checkBox_9 = new JCheckBox("Dire\u00E7\u00E3o El\u00E9trica");
				checkBox_9.setSelected(true);
				checkBox_9.setBounds(207, 149, 125, 23);
				panelConteudoVeiculos.add(checkBox_9);
		
				JCheckBox checkBox_10 = new JCheckBox("Dire\u00E7\u00E3o Assistida");
				checkBox_10.setBounds(437, 149, 125, 23);
				panelConteudoVeiculos.add(checkBox_10);
		
				JCheckBox checkBox_11 = new JCheckBox("Flex");
				checkBox_11.setSelected(true);
				checkBox_11.setBounds(437, 175, 125, 23);
				panelConteudoVeiculos.add(checkBox_11);
		
				JLabel lblAcessorios = new JLabel("Acess\u00F3rios:\r\n");
				lblAcessorios.setBounds(26, 128, 86, 14);
				panelConteudoVeiculos.add(lblAcessorios);
		
				JButton btnSalvar = new JButton("Salvar");
				btnSalvar.setIcon(new ImageIcon(Principal.class.getResource("/image/icons/tick.png")));
				btnSalvar.setBounds(525, 245, 106, 23);
				panelConteudoVeiculos.add(btnSalvar);
		
				JButton btnLimpar_1 = new JButton("Limpar");
				btnLimpar_1.setIcon(new ImageIcon(Principal.class.getResource("/image/icons/cancel.png")));
				btnLimpar_1.setBounds(418, 245, 97, 23);
				panelConteudoVeiculos.add(btnLimpar_1);
		
				JButton btnNovoVeiculo = new JButton("Novo Veiculo");
				btnNovoVeiculo.setIcon(new ImageIcon(Principal.class.getResource("/image/icons/add.png")));
				btnNovoVeiculo.setBounds(279, 245, 129, 23);
				panelConteudoVeiculos.add(btnNovoVeiculo);

			JPanel cardlLocacao = new JPanel();
			panelCardLayout.add(cardlLocacao, "cardLocacao");
			cardlLocacao.setBackground(Color.WHITE);
			cardlLocacao.setLayout(null);
	
				JPanel panelConteudoLocacao = new JPanel();
				panelConteudoLocacao.setBackground(Color.WHITE);
				panelConteudoLocacao.setLayout(null);
				panelConteudoLocacao.setBorder(new EmptyBorder(5, 5, 5, 5));
				panelConteudoLocacao.setBounds(10, 36, 766, 445);
				cardlLocacao.add(panelConteudoLocacao);
		
				JPanel panel_3 = new JPanel();
				panel_3.setBackground(Color.WHITE);
				panel_3.setLayout(null);
				panel_3.setBorder(
						new TitledBorder(UIManager.getBorder("TitledBorder.border"), "DADOS DO VE\u00CDCULO", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				panel_3.setBounds(10, 180, 355, 249);
				panelConteudoLocacao.add(panel_3);
		
				JLabel label_17 = new JLabel("Modelo:");
				label_17.setBounds(187, 33, 46, 14);
				panel_3.add(label_17);
		
				JComboBox cbMarca = new JComboBox();
				cbMarca.setModel(new DefaultComboBoxModel(new String[] {"FORD"}));
				cbMarca.setBounds(10, 51, 147, 20);
				panel_3.add(cbMarca);
		
				JLabel label_18 = new JLabel("Marca:");
				label_18.setBounds(10, 33, 46, 14);
				panel_3.add(label_18);
		
				JComboBox cbModelo = new JComboBox();
				cbModelo.setModel(new DefaultComboBoxModel(new String[] {"FUSION"}));
				cbModelo.setBounds(187, 51, 148, 20);
				panel_3.add(cbModelo);
		
				JCheckBox checkBox = new JCheckBox("Ar Condicionado");
				checkBox.setBounds(10, 91, 147, 23);
				panel_3.add(checkBox);
		
				JCheckBox checkBox_1 = new JCheckBox("C\u00E2mbio Autom\u00E1tico");
				checkBox_1.setBounds(10, 117, 147, 23);
				panel_3.add(checkBox_1);
		
				JCheckBox checkBox_2 = new JCheckBox("DVD Player");
				checkBox_2.setBounds(10, 143, 147, 23);
				panel_3.add(checkBox_2);
		
				JCheckBox checkBox_3 = new JCheckBox("Dire\u00E7\u00E3o El\u00E9trica");
				checkBox_3.setBounds(187, 91, 148, 23);
				panel_3.add(checkBox_3);
		
				JCheckBox checkBox_4 = new JCheckBox("Dire\u00E7\u00E3o Assistida");
				checkBox_4.setBounds(187, 117, 148, 23);
				panel_3.add(checkBox_4);
		
				JCheckBox checkBox_5 = new JCheckBox("Flex");
				checkBox_5.setBounds(187, 143, 148, 23);
				panel_3.add(checkBox_5);
		
				JButton btnFiltrarVeiculos = new JButton("Filtrar Ve\u00EDculos");
				btnFiltrarVeiculos.setBounds(209, 190, 125, 28);
				panel_3.add(btnFiltrarVeiculos);
		
				JPanel panel_4 = new JPanel();
				panel_4.setBackground(Color.WHITE);
				panel_4.setLayout(null);
				panel_4.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "DADOS DA LOCA\u00C7\u00C3O", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				panel_4.setBounds(395, 11, 371, 418);
				panelConteudoLocacao.add(panel_4);
		
				JLabel label_19 = new JLabel("Data Loca\u00E7\u00E3o:");
				label_19.setBounds(11, 30, 86, 14);
				panel_4.add(label_19);
		
				txtDtLocacao = new JTextField();
				txtDtLocacao.setColumns(10);
				txtDtLocacao.setBounds(10, 47, 123, 20);
				panel_4.add(txtDtLocacao);
		
				JLabel label_20 = new JLabel("Data Devolu\u00E7\u00E3o:");
				label_20.setBounds(10, 82, 98, 14);
				panel_4.add(label_20);
		
				txtDtDevolucao = new JTextField();
				txtDtDevolucao.setColumns(10);
				txtDtDevolucao.setBounds(10, 99, 123, 20);
				panel_4.add(txtDtDevolucao);
		
				JLabel lblTotalDeDias = new JLabel("Total de dias:");
				lblTotalDeDias.setBounds(10, 135, 113, 14);
				panel_4.add(lblTotalDeDias);
		
				txtQuantidadeDiasLocado = new JTextField();
				txtQuantidadeDiasLocado.setColumns(10);
				txtQuantidadeDiasLocado.setBounds(10, 154, 123, 20);
				panel_4.add(txtQuantidadeDiasLocado);
		
				txtQuantidadeKm = new JTextField();
				txtQuantidadeKm.setColumns(10);
				txtQuantidadeKm.setBounds(160, 154, 128, 20);
				panel_4.add(txtQuantidadeKm);
		
				JLabel label_22 = new JLabel("Local de origem:");
				label_22.setBounds(159, 30, 113, 14);
				panel_4.add(label_22);
		
				JComboBox cbUfOrigem = new JComboBox();
				cbUfOrigem.setModel(new DefaultComboBoxModel(new String[] {"GO", "AC", "SP"}));
				cbUfOrigem.setBounds(159, 47, 53, 20);
				panel_4.add(cbUfOrigem);
		
				JComboBox cbCidadeOrigem = new JComboBox();
				cbCidadeOrigem.setModel(new DefaultComboBoxModel(new String[] {"GOI\u00C2NIA"}));
				cbCidadeOrigem.setBounds(221, 47, 137, 20);
				panel_4.add(cbCidadeOrigem);
		
				JLabel label_23 = new JLabel("Local de destino:");
				label_23.setBounds(159, 82, 113, 14);
				panel_4.add(label_23);
		
				JComboBox cbUfDestino = new JComboBox();
				cbUfDestino.setModel(new DefaultComboBoxModel(new String[] {"GO"}));
				cbUfDestino.setBounds(159, 99, 53, 20);
				panel_4.add(cbUfDestino);
		
				JComboBox cbCidadeDestino = new JComboBox();
				cbCidadeDestino.setModel(new DefaultComboBoxModel(new String[] {"AN\u00C1POLIS"}));
				cbCidadeDestino.setBounds(221, 99, 137, 20);
				panel_4.add(cbCidadeDestino);
		
				JLabel lblTotalDeKm = new JLabel("Total de km:");
				lblTotalDeKm.setBounds(159, 135, 113, 14);
				panel_4.add(lblTotalDeKm);
				
						JLabel lblValorTotal_1 = new JLabel("Valor Total:");
						lblValorTotal_1.setBounds(11, 189, 76, 14);
						panel_4.add(lblValorTotal_1);
						
								txtValorApagar = new JTextField();
								txtValorApagar.setBounds(11, 206, 123, 20);
								panel_4.add(txtValorApagar);
								txtValorApagar.setColumns(10);
								
										JLabel label_26 = new JLabel("Valor Cau\u00E7\u00E3o:");
										label_26.setBounds(160, 190, 86, 14);
										panel_4.add(label_26);
										
												txtValorCaucao = new JTextField();
												txtValorCaucao.setBounds(160, 206, 128, 20);
												panel_4.add(txtValorCaucao);
												txtValorCaucao.setColumns(10);
												
														JButton btnEfetuarPagamento = new JButton("Efetuar Pagamento");
														btnEfetuarPagamento.setIcon(new ImageIcon(Principal.class.getResource("/image/icons/tick.png")));
														btnEfetuarPagamento.setBounds(87, 305, 185, 23);
														panel_4.add(btnEfetuarPagamento);
														
														JLabel lblValorAPagar = new JLabel("VALOR A PAGAR:");
														lblValorAPagar.setFont(lblValorAPagar.getFont().deriveFont(lblValorAPagar.getFont().getStyle() | Font.BOLD));
														lblValorAPagar.setHorizontalAlignment(SwingConstants.LEFT);
														lblValorAPagar.setBackground(Color.BLUE);
														lblValorAPagar.setBounds(10, 237, 123, 20);
														panel_4.add(lblValorAPagar);
														
														txtValorapagar = new JTextField();
														txtValorapagar.setBounds(10, 258, 123, 20);
														panel_4.add(txtValorapagar);
														txtValorapagar.setColumns(10);
		
				JButton btnSair = new JButton("Cancelar");
				btnSair.setIcon(new ImageIcon(Principal.class.getResource("/image/icons/cancel.png")));
				btnSair.setBounds(246, 373, 112, 23);
				panel_4.add(btnSair);
				
						JPanel panelDadosCliente = new JPanel();
						panelDadosCliente.setBounds(10, 11, 355, 144);
						panelConteudoLocacao.add(panelDadosCliente);
						panelDadosCliente.setBackground(Color.WHITE);
						panelDadosCliente.setLayout(null);
						panelDadosCliente.setBorder(
								new TitledBorder(UIManager.getBorder("TitledBorder.border"), "DADOS DO CLIENTE", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
						
								JLabel lblCliente = new JLabel("Cliente:");
								lblCliente.setBounds(10, 30, 57, 14);
								panelDadosCliente.add(lblCliente);
								
										JComboBox cbCliente = new JComboBox();
										cbCliente.setModel(new DefaultComboBoxModel(new String[] {"CRISTIANE FARIA", "BRUNO RODRIGUES"}));
										cbCliente.setBounds(10, 47, 325, 20);
										panelDadosCliente.add(cbCliente);
										
												JLabel lbnCnh = new JLabel("N\u00BA de Registro CNH:");
												lbnCnh.setBounds(10, 82, 128, 14);
												panelDadosCliente.add(lbnCnh);
												
														txtRegistroCnhLocacao = new JTextField();
														txtRegistroCnhLocacao.setColumns(10);
														txtRegistroCnhLocacao.setBounds(10, 99, 146, 20);
														panelDadosCliente.add(txtRegistroCnhLocacao);
														
																JLabel lblCpf = new JLabel("CPF:");
																lblCpf.setBounds(187, 82, 86, 14);
																panelDadosCliente.add(lblCpf);
																
																		txtCpfLocacao = new JTextField();
																		txtCpfLocacao.setColumns(10);
																		txtCpfLocacao.setBounds(187, 99, 148, 20);
																		panelDadosCliente.add(txtCpfLocacao);
																		
																				JSeparator separator = new JSeparator();
																				separator.setBounds(375, -36, 4, 517);
																				panelConteudoLocacao.add(separator);
																				separator.setOrientation(SwingConstants.VERTICAL);
		
				JButton btnPesquisarLocacao = new JButton("Pesquisar Loca\u00E7\u00E3o");
				btnPesquisarLocacao.setIcon(new ImageIcon(Principal.class.getResource("/image/icons/zoom.png")));
				btnPesquisarLocacao.setBounds(607, 11, 169, 23);
				cardlLocacao.add(btnPesquisarLocacao);
			
			
			JPanel cardDevolucao = new JPanel();
			cardDevolucao.setBackground(Color.WHITE);
			panelCardLayout.add(cardDevolucao, "cardDevolucao");
				cardDevolucao.setLayout(null);
		

				JPanel panelConteudoDevolucao = new JPanel();
				panelConteudoDevolucao.setBackground(Color.WHITE);
				panelConteudoDevolucao.setLayout(null);
				panelConteudoDevolucao.setBorder(
						new TitledBorder(UIManager.getBorder("TitledBorder.border"), "DADOS DA DEVOLU\u00C7\u00C3O", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				panelConteudoDevolucao.setBounds(25, 45, 747, 429);
				cardDevolucao.add(panelConteudoDevolucao);
		
				JLabel label_13 = new JLabel("Cliente:");
				label_13.setBounds(20, 122, 46, 14);
				panelConteudoDevolucao.add(label_13);
		
				JComboBox cbClienteDevolucao = new JComboBox();
				cbClienteDevolucao.setModel(new DefaultComboBoxModel(new String[] {"CRISTIANE FARIA"}));
				cbClienteDevolucao.setBounds(20, 138, 294, 20);
				panelConteudoDevolucao.add(cbClienteDevolucao);
		
				JLabel label_14 = new JLabel("Ve\u00EDculo Locado:");
				label_14.setBounds(20, 75, 128, 14);
				panelConteudoDevolucao.add(label_14);
		
				JLabel label_15 = new JLabel("Ocorr\u00EAncias:");
				label_15.setBounds(387, 28, 90, 14);
				panelConteudoDevolucao.add(label_15);
		
				JRadioButton radioButton = new JRadioButton("Sim");
				radioButton.setBounds(456, 49, 52, 23);
				panelConteudoDevolucao.add(radioButton);
		
				JRadioButton radioButton_1 = new JRadioButton("N\u00E3o");
				radioButton_1.setBounds(387, 49, 58, 23);
				panelConteudoDevolucao.add(radioButton_1);
		
				JLabel label_16 = new JLabel("Qual?");
				label_16.setBounds(387, 76, 46, 14);
				panelConteudoDevolucao.add(label_16);
		
				JComboBox cbOcorrencias = new JComboBox();
				cbOcorrencias.setEnabled(false);
				cbOcorrencias.setBounds(387, 94, 238, 20);
				panelConteudoDevolucao.add(cbOcorrencias);
		
				JButton btnAdicionarOcorrencias = new JButton("+");
				btnAdicionarOcorrencias.setEnabled(false);
				btnAdicionarOcorrencias.setBounds(635, 93, 46, 23);
				panelConteudoDevolucao.add(btnAdicionarOcorrencias);
		
				JLabel label_28 = new JLabel("Valor Cobrado:");
				label_28.setBounds(187, 224, 91, 14);
				panelConteudoDevolucao.add(label_28);
		
				txtValorCobrado = new JTextField();
				txtValorCobrado.setColumns(10);
				txtValorCobrado.setBounds(187, 241, 127, 20);
				panelConteudoDevolucao.add(txtValorCobrado);
		
				JLabel label_29 = new JLabel("Valor Cau\u00E7\u00E3o");
				label_29.setBounds(20, 224, 90, 14);
				panelConteudoDevolucao.add(label_29);
		
				JLabel label_30 = new JLabel("Valor Atualizado:");
				label_30.setFont(label_30.getFont().deriveFont(label_30.getFont().getStyle() | Font.BOLD));
				label_30.setBounds(388, 236, 108, 14);
				panelConteudoDevolucao.add(label_30);
		
				txtValorAtualizado = new JTextField();
				txtValorAtualizado.setColumns(10);
				txtValorAtualizado.setBounds(388, 253, 109, 20);
				panelConteudoDevolucao.add(txtValorAtualizado);
		
				JLabel label_31 = new JLabel("Valor a rever:");
				label_31.setFont(label_31.getFont().deriveFont(label_31.getFont().getStyle() | Font.BOLD));
				label_31.setBounds(540, 236, 102, 14);
				panelConteudoDevolucao.add(label_31);
		
				txtValorArever = new JTextField();
				txtValorArever.setColumns(10);
				txtValorArever.setBounds(539, 253, 142, 20);
				panelConteudoDevolucao.add(txtValorArever);
		
				JComboBox cbVeiculoLocado = new JComboBox();
				cbVeiculoLocado.setModel(new DefaultComboBoxModel(new String[] {"FORD FUSION 2016"}));
				cbVeiculoLocado.setBounds(20, 90, 294, 20);
				panelConteudoDevolucao.add(cbVeiculoLocado);
		
				txtValorcaucao = new JTextField();
				txtValorcaucao.setBounds(21, 242, 127, 20);
				panelConteudoDevolucao.add(txtValorcaucao);
				txtValorcaucao.setColumns(10);
				
				JSeparator separator_1 = new JSeparator();
				separator_1.setOrientation(SwingConstants.VERTICAL);
				separator_1.setBounds(371, 11, 2, 390);
				panelConteudoDevolucao.add(separator_1);
				
				JComboBox comboBox = new JComboBox();
				comboBox.setEnabled(false);
				comboBox.setBounds(388, 126, 238, 20);
				panelConteudoDevolucao.add(comboBox);
				
				JButton button = new JButton("+");
				button.setEnabled(false);
				button.setBounds(636, 125, 46, 23);
				panelConteudoDevolucao.add(button);
				
				JComboBox comboBox_1 = new JComboBox();
				comboBox_1.setEnabled(false);
				comboBox_1.setBounds(387, 156, 238, 20);
				panelConteudoDevolucao.add(comboBox_1);
				
				JButton button_1 = new JButton("+");
				button_1.setEnabled(false);
				button_1.setBounds(635, 155, 46, 23);
				panelConteudoDevolucao.add(button_1);
				
				JComboBox comboBox_2 = new JComboBox();
				comboBox_2.setEnabled(false);
				comboBox_2.setBounds(387, 188, 238, 20);
				panelConteudoDevolucao.add(comboBox_2);
				
				textField_1 = new JTextField();
				textField_1.setBounds(20, 44, 127, 20);
				panelConteudoDevolucao.add(textField_1);
				textField_1.setColumns(10);
				
				JLabel label_24 = new JLabel("Data Devolu\u00E7\u00E3o:");
				label_24.setBounds(20, 27, 98, 14);
				panelConteudoDevolucao.add(label_24);
				
				textField_2 = new JTextField();
				textField_2.setBounds(187, 188, 127, 20);
				panelConteudoDevolucao.add(textField_2);
				textField_2.setColumns(10);
				
				JLabel label_25 = new JLabel("Total de dias:");
				label_25.setBounds(187, 169, 113, 14);
				panelConteudoDevolucao.add(label_25);
				
				textField_3 = new JTextField();
				textField_3.setBounds(21, 188, 127, 20);
				panelConteudoDevolucao.add(textField_3);
				textField_3.setColumns(10);
				
				JLabel label_34 = new JLabel("Total de km:");
				label_34.setBounds(20, 169, 113, 14);
				panelConteudoDevolucao.add(label_34);
				
				JButton btnCancelardevolucao = new JButton("Cancelar");
				btnCancelardevolucao.setIcon(new ImageIcon(Principal.class.getResource("/image/icons/cancel.png")));
				btnCancelardevolucao.setBounds(571, 349, 113, 23);
				panelConteudoDevolucao.add(btnCancelardevolucao);
				
				JButton btnCaixa = new JButton("Caixa");
				btnCaixa.setIcon(new ImageIcon(Principal.class.getResource("/image/icons/calculator.png")));
				btnCaixa.setBounds(444, 349, 117, 23);
				panelConteudoDevolucao.add(btnCaixa);
		
				JButton btnPesquisarDevoluo = new JButton("Pesquisar Devolu\u00E7\u00E3o");
				btnPesquisarDevoluo.setIcon(new ImageIcon(Principal.class.getResource("/image/icons/zoom.png")));
				btnPesquisarDevoluo.setBounds(587, 11, 185, 23);
				cardDevolucao.add(btnPesquisarDevoluo);

			JPanel cardPagamento = new JPanel();
			cardPagamento.setBackground(Color.WHITE);
			panelCardLayout.add(cardPagamento, "cardPagamento");
				cardPagamento.setLayout(null);
				
				JPanel panel = new JPanel();
				panel.setBackground(Color.WHITE);
				panel.setBounds(10, 11, 774, 464);
				cardPagamento.add(panel);
				panel.setLayout(null);
				

						JPanel panelConteudoPagamento = new JPanel();
						panelConteudoPagamento.setBounds(21, 15, 346, 433);
						panel.add(panelConteudoPagamento);
						panelConteudoPagamento.setBackground(Color.WHITE);
						panelConteudoPagamento.setBorder(
								new TitledBorder(UIManager.getBorder("TitledBorder.border"), "EFETUAR PAGAMENTO", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
						panelConteudoPagamento.setLayout(null);
						
								JLabel lblCdigoDaLocao = new JLabel("C\u00F3digo da Loca\u00E7\u00E3o:");
								lblCdigoDaLocao.setBounds(156, 31, 123, 14);
								panelConteudoPagamento.add(lblCdigoDaLocao);
								
										JLabel lblFormaDePagamento = new JLabel("Forma de pagamento:");
										lblFormaDePagamento.setBounds(14, 190, 196, 14);
										panelConteudoPagamento.add(lblFormaDePagamento);
										
												JComboBox cbTipoPagamento = new JComboBox();
												cbTipoPagamento.setModel(new DefaultComboBoxModel(new String[] {"\u00C0 VISTA", "CART\u00C3O DE CR\u00C9DITO"}));
												cbTipoPagamento.setBounds(10, 152, 173, 20);
												panelConteudoPagamento.add(cbTipoPagamento);
												
														JRadioButton rdbtnAVista = new JRadioButton("A vista");
														rdbtnAVista.setBounds(10, 206, 66, 23);
														panelConteudoPagamento.add(rdbtnAVista);
														
																JRadioButton rdbtnParcelado = new JRadioButton("Parcelado");
																rdbtnParcelado.setBounds(101, 206, 109, 23);
																panelConteudoPagamento.add(rdbtnParcelado);
																
																		JLabel lblValorRecebido = new JLabel("Valor Recebido:\r\n\r\n");
																		lblValorRecebido.setFont(lblValorRecebido.getFont().deriveFont(lblValorRecebido.getFont().getStyle() | Font.BOLD));
																		lblValorRecebido.setBounds(115, 250, 103, 14);
																		panelConteudoPagamento.add(lblValorRecebido);
																		
																				JLabel lblValorTotal = new JLabel("Valor Total:");
																				lblValorTotal.setFont(lblValorTotal.getFont().deriveFont(lblValorTotal.getFont().getStyle() | Font.BOLD));
																				lblValorTotal.setBounds(15, 248, 99, 14);
																				panelConteudoPagamento.add(lblValorTotal);
																				
																						JLabel lblTipoDePagamento = new JLabel("Tipo de Pagamento:");
																						lblTipoDePagamento.setBounds(10, 132, 159, 14);
																						panelConteudoPagamento.add(lblTipoDePagamento);
																						
																								txtValortotal = new JTextField();
																								txtValortotal.setBounds(14, 265, 79, 20);
																								panelConteudoPagamento.add(txtValortotal);
																								txtValortotal.setColumns(10);
																								
																										JLabel lblTroco = new JLabel("Troco:");
																										lblTroco.setFont(lblTroco.getFont().deriveFont(lblTroco.getFont().getStyle() | Font.BOLD));
																										lblTroco.setBounds(241, 250, 38, 14);
																										panelConteudoPagamento.add(lblTroco);
																										
																												JLabel lblDataDoPagamento = new JLabel("Data do Pagamento:");
																												lblDataDoPagamento.setBounds(10, 31, 115, 14);
																												panelConteudoPagamento.add(lblDataDoPagamento);
																												
																														txtDatapagamento = new JTextField();
																														txtDatapagamento.setBounds(10, 49, 115, 20);
																														panelConteudoPagamento.add(txtDatapagamento);
																														txtDatapagamento.setColumns(10);
																														
																																txtValorrecebido = new JTextField();
																																txtValorrecebido.setBounds(115, 265, 95, 20);
																																panelConteudoPagamento.add(txtValorrecebido);
																																txtValorrecebido.setColumns(10);
																																
																																		txtTroco = new JTextField();
																																		txtTroco.setBounds(241, 265, 86, 20);
																																		panelConteudoPagamento.add(txtTroco);
																																		txtTroco.setColumns(10);
																																		
																																				JButton btnEfetuarPagamento_2 = new JButton("Efetuar Pagamento");
																																				btnEfetuarPagamento_2.setIcon(new ImageIcon(Principal.class.getResource("/image/icons/accept.png")));
																																				btnEfetuarPagamento_2.setBounds(156, 324, 171, 23);
																																				panelConteudoPagamento.add(btnEfetuarPagamento_2);
																																				
																																						JButton btnCancelarPagamento = new JButton("Cancelar");
																																						btnCancelarPagamento.setIcon(new ImageIcon(Principal.class.getResource("/image/icons/cancel.png")));
																																						btnCancelarPagamento.setBounds(32, 324, 115, 23);
																																						panelConteudoPagamento.add(btnCancelarPagamento);
																																						
																																						txtPesquisarcodigolocacao = new JTextField();
																																						txtPesquisarcodigolocacao.setBounds(156, 49, 100, 20);
																																						panelConteudoPagamento.add(txtPesquisarcodigolocacao);
																																						txtPesquisarcodigolocacao.setColumns(10);
																																						
																																						JButton btnPesquisar = new JButton("");
																																						btnPesquisar.setIcon(new ImageIcon(Principal.class.getResource("/image/icons/zoom.png")));
																																						btnPesquisar.setBounds(266, 46, 61, 23);
																																						panelConteudoPagamento.add(btnPesquisar);
																																						
																																						JLabel lblCliente_1 = new JLabel("Cliente:");
																																						lblCliente_1.setBounds(10, 85, 46, 14);
																																						panelConteudoPagamento.add(lblCliente_1);
																																						
																																						JComboBox comboBox_3 = new JComboBox();
																																						comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"CRISTIANE FARIA"}));
																																						comboBox_3.setBounds(10, 101, 317, 20);
																																						panelConteudoPagamento.add(comboBox_3);
																																						
																																						JButton btnNovoPagamento = new JButton("Novo Pagamento");
																																						btnNovoPagamento.setIcon(new ImageIcon(Principal.class.getResource("/image/icons/add.png")));
																																						btnNovoPagamento.setBounds(158, 382, 169, 23);
																																						panelConteudoPagamento.add(btnNovoPagamento);
																																						
																																						JSeparator separator_2 = new JSeparator();
																																						separator_2.setOrientation(SwingConstants.VERTICAL);
																																						separator_2.setBounds(386, 11, 2, 442);
																																						panel.add(separator_2);
																																						
																																						JPanel panel_1 = new JPanel();
																																						panel_1.setBackground(Color.WHITE);
																																						panel_1.setBorder(new TitledBorder(null, "CAIXA", TitledBorder.LEADING, TitledBorder.TOP, null, null));
																																						panel_1.setBounds(408, 15, 356, 433);
																																						panel.add(panel_1);
																																						panel_1.setLayout(null);
																																						
																																						JLabel lblSaldoAnterior = new JLabel("Saldo:");
																																						lblSaldoAnterior.setBounds(177, 31, 83, 14);
																																						panel_1.add(lblSaldoAnterior);
																																						
																																						txtSaldoCaixa = new JTextField();
																																						txtSaldoCaixa.setBounds(174, 49, 146, 20);
																																						panel_1.add(txtSaldoCaixa);
																																						txtSaldoCaixa.setColumns(10);
																																						
																																						JLabel lblData_1 = new JLabel("Data:");
																																						lblData_1.setBounds(10, 31, 46, 14);
																																						panel_1.add(lblData_1);
																																						
																																						txtDataCaixa = new JTextField();
																																						txtDataCaixa.setBounds(10, 49, 118, 20);
																																						panel_1.add(txtDataCaixa);
																																						txtDataCaixa.setColumns(10);
																																						
																																						JScrollPane scrollPane = new JScrollPane();
																																						scrollPane.setBounds(10, 108, 325, 283);
																																						panel_1.add(scrollPane);
																																						
																																						table_1 = new JTable();
																																						scrollPane.setColumnHeaderView(table_1);

		JPanel panelFooter = new JPanel();
		panelFooter.setBounds(0, 555, 794, 21);
		contentPane.add(panelFooter);
		panelFooter.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Usu\u00E1rio logado:");
		lblNewLabel_1.setBounds(10, 3, 88, 14);
		panelFooter.add(lblNewLabel_1);

		JLabel lblCristiane = new JLabel("Cristiane");
		lblCristiane.setBounds(104, 3, 61, 14);
		panelFooter.add(lblCristiane);
		
				JLabel label_3 = new JLabel("11/11/2016");
				label_3.setBounds(714, 3, 70, 14);
				panelFooter.add(label_3);
				label_3.setVerticalAlignment(SwingConstants.BOTTOM);

		setTitle("LoCAR Express - Locadora de Ve\u00EDculos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 605);

	
 
    }
}
