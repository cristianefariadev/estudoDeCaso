package br.view;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.border.CompoundBorder;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class Principal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtEndereco;
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
	private JTable tbListarVeiculos;
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
	private JTextField txtDataatual;
	private JTextField txtSaldo;
	private JTable table;
	private JTextField txtStatusdopedido;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelMenus = new JPanel();
		panelMenus.setBounds(0, 0, 784, 45);
		contentPane.add(panelMenus);
		panelMenus.setLayout(null);
		
		JButton btnCliente = new JButton("Cliente");
		btnCliente.setBounds(10, 11, 89, 23);
		panelMenus.add(btnCliente);
		
		JButton btnVeculos = new JButton("Ve\u00EDculos");
		btnVeculos.setBounds(104, 11, 89, 23);
		panelMenus.add(btnVeculos);
		
		JButton btnLocao = new JButton("Loca\u00E7\u00E3o");
		btnLocao.setBounds(204, 11, 89, 23);
		panelMenus.add(btnLocao);
		
		JButton btnDevoluo = new JButton("Devolu\u00E7\u00E3o");
		btnDevoluo.setBounds(303, 11, 89, 23);
		panelMenus.add(btnDevoluo);
		
		JButton btnPagamento = new JButton("Pagamento");
		btnPagamento.setBounds(402, 11, 89, 23);
		panelMenus.add(btnPagamento);
		
		JButton btnCaixa = new JButton("Caixa");
		btnCaixa.setBounds(503, 11, 89, 23);
		panelMenus.add(btnCaixa);
		
		JButton btnSair_1 = new JButton("Sair");
		btnSair_1.setBounds(602, 11, 89, 23);
		panelMenus.add(btnSair_1);
		
		JPanel panelCardLayout = new JPanel();
		panelCardLayout.setBounds(0, 47, 784, 498);
		contentPane.add(panelCardLayout);
		panelCardLayout.setLayout(new CardLayout(0, 0));
		
		JPanel panelClientes = new JPanel();
		panelCardLayout.add(panelClientes, "name_23041503687358");
		panelClientes.setBackground(Color.LIGHT_GRAY);
		panelClientes.setLayout(null);
		
		JButton btnPesquisarCliente = new JButton("Pesquisar Cliente");
		btnPesquisarCliente.setBounds(549, 26, 129, 23);
		panelClientes.add(btnPesquisarCliente);
		
		JPanel panelConteudoCliente = new JPanel();
		panelConteudoCliente.setBackground(Color.WHITE);
		panelConteudoCliente.setLayout(null);
		panelConteudoCliente.setBorder(new TitledBorder(new CompoundBorder(), "Cadastro de Clientes", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelConteudoCliente.setBounds(28, 71, 706, 382);
		panelClientes.add(panelConteudoCliente);
		
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
		btnSalvarCliente.setBounds(604, 299, 73, 20);
		panelConteudoCliente.add(btnSalvarCliente);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(523, 299, 75, 20);
		panelConteudoCliente.add(btnLimpar);
		
		JLabel label_2 = new JLabel("RG:");
		label_2.setBounds(195, 90, 89, 14);
		panelConteudoCliente.add(label_2);
		
		JLabel label_3 = new JLabel("N\u00FAmero de Registro CNH:");
		label_3.setHorizontalAlignment(SwingConstants.LEFT);
		label_3.setBounds(467, 37, 139, 14);
		panelConteudoCliente.add(label_3);
		
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
		txtCep.setBounds(10, 171, 122, 20);
		panelConteudoCliente.add(txtCep);
		
		JComboBox cbEstado = new JComboBox();
		cbEstado.setBounds(467, 234, 210, 20);
		panelConteudoCliente.add(cbEstado);
		
		JComboBox cbCidade = new JComboBox();
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
		txtTelefone.setBounds(324, 109, 120, 20);
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
		
		JButton btnNovoCliente = new JButton("Novo");
		btnNovoCliente.setBounds(436, 299, 81, 20);
		panelConteudoCliente.add(btnNovoCliente);
		
		txtEndereco_1 = new JTextField();
		txtEndereco_1.setBounds(195, 171, 481, 20);
		panelConteudoCliente.add(txtEndereco_1);
		txtEndereco_1.setColumns(10);
		
		JButton button_3 = new JButton(">");
		button_3.setBounds(686, 26, 51, 23);
		panelClientes.add(button_3);
		
		JButton button_4 = new JButton("<");
		button_4.setBounds(487, 26, 51, 23);
		panelClientes.add(button_4);
		panelClientes.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{panelConteudoCliente, label, label_1, txtCodigo, btnSalvarCliente, btnLimpar, label_2, label_3, label_4, label_5, label_6, cbSexo, label_7, label_8, txtCep, cbEstado, btnPesquisarCliente, cbCidade, label_9, label_10, label_11, btnPesquisarCep, label_12, txtRegistroCnh, txtNomeCompleto, txtRg, txtTelefone, txtEmail, txtCpf, txtBairro, button_3, button_4}));
		
		JPanel panelDevolucao = new JPanel();
		panelCardLayout.add(panelDevolucao, "name_23041519743646");
		panelDevolucao.setLayout(null);
		
		JPanel panelConteudoDevolucao = new JPanel();
		panelConteudoDevolucao.setLayout(null);
		panelConteudoDevolucao.setBorder(new TitledBorder(null, "Dados do Cliente", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelConteudoDevolucao.setBounds(34, 63, 328, 414);
		panelDevolucao.add(panelConteudoDevolucao);
		
		JLabel label_13 = new JLabel("Cliente:");
		label_13.setBounds(9, 21, 37, 14);
		panelConteudoDevolucao.add(label_13);
		
		JComboBox cbClienteDevolucao = new JComboBox();
		cbClienteDevolucao.setBounds(9, 35, 294, 20);
		panelConteudoDevolucao.add(cbClienteDevolucao);
		
		JLabel label_14 = new JLabel("Ve\u00EDculo Locado:");
		label_14.setBounds(9, 66, 78, 14);
		panelConteudoDevolucao.add(label_14);
		
		JLabel label_15 = new JLabel("Ocorr\u00EAncias:");
		label_15.setBounds(10, 189, 90, 14);
		panelConteudoDevolucao.add(label_15);
		
		JRadioButton radioButton = new JRadioButton("Sim");
		radioButton.setBounds(56, 210, 52, 23);
		panelConteudoDevolucao.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("N\u00E3o");
		radioButton_1.setBounds(9, 210, 109, 23);
		panelConteudoDevolucao.add(radioButton_1);
		
		JLabel label_16 = new JLabel("Qual?");
		label_16.setBounds(9, 237, 46, 14);
		panelConteudoDevolucao.add(label_16);
		
		JComboBox cbOcorrencias = new JComboBox();
		cbOcorrencias.setBounds(9, 255, 238, 20);
		panelConteudoDevolucao.add(cbOcorrencias);
		
		JButton btnAdicionarOcorrencias = new JButton("+");
		btnAdicionarOcorrencias.setBounds(257, 254, 46, 23);
		panelConteudoDevolucao.add(btnAdicionarOcorrencias);
		
		JLabel label_28 = new JLabel("Valor Cobrado:");
		label_28.setBounds(9, 112, 91, 14);
		panelConteudoDevolucao.add(label_28);
		
		txtValorCobrado = new JTextField();
		txtValorCobrado.setColumns(10);
		txtValorCobrado.setBounds(9, 130, 132, 20);
		panelConteudoDevolucao.add(txtValorCobrado);
		
		JLabel label_29 = new JLabel("Valor Cau\u00E7\u00E3o");
		label_29.setBounds(169, 112, 90, 14);
		panelConteudoDevolucao.add(label_29);
		
		JLabel label_30 = new JLabel("Valor Atualizado:");
		label_30.setBounds(9, 300, 99, 14);
		panelConteudoDevolucao.add(label_30);
		
		txtValorAtualizado = new JTextField();
		txtValorAtualizado.setColumns(10);
		txtValorAtualizado.setBounds(9, 317, 132, 20);
		panelConteudoDevolucao.add(txtValorAtualizado);
		
		JLabel label_31 = new JLabel("Valor a rever:");
		label_31.setBounds(169, 300, 78, 14);
		panelConteudoDevolucao.add(label_31);
		
		txtValorArever = new JTextField();
		txtValorArever.setColumns(10);
		txtValorArever.setBounds(161, 317, 142, 20);
		panelConteudoDevolucao.add(txtValorArever);
		
		JButton btnEfetuarEstorno = new JButton("Efetuar Estorno");
		btnEfetuarEstorno.setBounds(35, 369, 121, 23);
		panelConteudoDevolucao.add(btnEfetuarEstorno);
		
		JComboBox cbVeiculoLocado = new JComboBox();
		cbVeiculoLocado.setBounds(9, 80, 294, 20);
		panelConteudoDevolucao.add(cbVeiculoLocado);
		
		JButton btnEfetuarPagamento_1 = new JButton("Efetuar Pagamento");
		btnEfetuarPagamento_1.setBounds(171, 369, 132, 23);
		panelConteudoDevolucao.add(btnEfetuarPagamento_1);
		
		txtValorcaucao = new JTextField();
		txtValorcaucao.setBounds(169, 130, 134, 20);
		panelConteudoDevolucao.add(txtValorcaucao);
		txtValorcaucao.setColumns(10);
		
		JButton btnPesquisarDevoluo = new JButton("Pesquisar Devolu\u00E7\u00E3o");
		btnPesquisarDevoluo.setBounds(609, 11, 131, 23);
		panelDevolucao.add(btnPesquisarDevoluo);
		
		JButton btnVoltarDevolucao = new JButton("<");
		btnVoltarDevolucao.setBounds(539, 11, 65, 23);
		panelDevolucao.add(btnVoltarDevolucao);
		
		JPanel panelCaixa = new JPanel();
		panelCardLayout.add(panelCaixa, "name_23041535683618");
		panelCaixa.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Caixa", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(49, 25, 673, 308);
		panelCaixa.add(panel);
		panel.setLayout(null);
		
		txtDataatual = new JTextField();
		txtDataatual.setBounds(31, 43, 94, 20);
		panel.add(txtDataatual);
		txtDataatual.setColumns(10);
		
		JLabel lblData = new JLabel("Data:");
		lblData.setBounds(32, 28, 46, 14);
		panel.add(lblData);
		
		JLabel lblSaldoDoDia = new JLabel("Saldo do dia:");
		lblSaldoDoDia.setBounds(156, 28, 78, 14);
		panel.add(lblSaldoDoDia);
		
		txtSaldo = new JTextField();
		txtSaldo.setBounds(156, 43, 102, 20);
		panel.add(txtSaldo);
		txtSaldo.setColumns(10);
		
		JLabel lblPedidos = new JLabel("Pedidos:");
		lblPedidos.setBounds(31, 76, 46, 14);
		panel.add(lblPedidos);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
			},
			new String[] {
				"Status", "Cliente:", "Valor:"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				true, false, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.setBounds(31, 114, 319, 147);
		panel.add(table);
		
		JPanel panelVeiculos = new JPanel();
		panelCardLayout.add(panelVeiculos, "name_23041571384341");
		panelVeiculos.setLayout(null);
		
		JButton btnPesquisarVeiculo = new JButton("Pesquisar Veiculo");
		btnPesquisarVeiculo.setBounds(577, 11, 126, 23);
		panelVeiculos.add(btnPesquisarVeiculo);
		
		JButton button = new JButton(">");
		button.setBounds(713, 11, 61, 23);
		panelVeiculos.add(button);
		
		JButton button_1 = new JButton("<");
		button_1.setBounds(478, 11, 89, 23);
		panelVeiculos.add(button_1);
		
		JPanel panelConteudoVeiculos = new JPanel();
		panelConteudoVeiculos.setBorder(new TitledBorder(null, "Cadastrar Ve\u00EDculo", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelConteudoVeiculos.setBounds(10, 48, 764, 264);
		panelVeiculos.add(panelConteudoVeiculos);
		panelConteudoVeiculos.setLayout(null);
		
		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setBounds(139, 27, 46, 14);
		panelConteudoVeiculos.add(lblModelo);
		
		JComboBox cbModeloVeiculo = new JComboBox();
		cbModeloVeiculo.setBounds(139, 45, 180, 20);
		panelConteudoVeiculos.add(cbModeloVeiculo);
		
		JComboBox cbMarcaVeiculo = new JComboBox();
		cbMarcaVeiculo.setBounds(362, 45, 196, 20);
		panelConteudoVeiculos.add(cbMarcaVeiculo);
		
		JLabel lblMarca = new JLabel("Marca:");
		lblMarca.setBounds(362, 27, 46, 14);
		panelConteudoVeiculos.add(lblMarca);
		
		JLabel lblAnoDeFabricao = new JLabel("Ano de Fabrica\u00E7\u00E3o:");
		lblAnoDeFabricao.setBounds(10, 27, 109, 14);
		panelConteudoVeiculos.add(lblAnoDeFabricao);
		
		JComboBox cbAnoFabricacao = new JComboBox();
		cbAnoFabricacao.setBounds(10, 45, 69, 20);
		panelConteudoVeiculos.add(cbAnoFabricacao);
		
		JLabel lblPlaca = new JLabel("Placa:");
		lblPlaca.setBounds(139, 78, 46, 14);
		panelConteudoVeiculos.add(lblPlaca);
		
		txtPlaca = new JTextField();
		txtPlaca.setBounds(139, 93, 180, 20);
		panelConteudoVeiculos.add(txtPlaca);
		txtPlaca.setColumns(10);
		
		JLabel lblChassi = new JLabel("Chassi:");
		lblChassi.setBounds(362, 76, 46, 14);
		panelConteudoVeiculos.add(lblChassi);
		
		txtChassi = new JTextField();
		txtChassi.setBounds(362, 93, 196, 20);
		panelConteudoVeiculos.add(txtChassi);
		txtChassi.setColumns(10);
		
		JLabel lblCor = new JLabel("Cor:");
		lblCor.setBounds(10, 78, 46, 14);
		panelConteudoVeiculos.add(lblCor);
		
		txtCor = new JTextField();
		txtCor.setBounds(10, 93, 86, 20);
		panelConteudoVeiculos.add(txtCor);
		txtCor.setColumns(10);
		
		JCheckBox checkBox_6 = new JCheckBox("DVD Player");
		checkBox_6.setBounds(139, 164, 97, 23);
		panelConteudoVeiculos.add(checkBox_6);
		
		JCheckBox checkBox_7 = new JCheckBox("C\u00E2mbio Autom\u00E1tico");
		checkBox_7.setBounds(6, 164, 129, 23);
		panelConteudoVeiculos.add(checkBox_7);
		
		JCheckBox checkBox_8 = new JCheckBox("Ar Condicionado");
		checkBox_8.setBounds(6, 138, 129, 23);
		panelConteudoVeiculos.add(checkBox_8);
		
		JCheckBox checkBox_9 = new JCheckBox("Dire\u00E7\u00E3o El\u00E9trica");
		checkBox_9.setBounds(140, 138, 125, 23);
		panelConteudoVeiculos.add(checkBox_9);
		
		JCheckBox checkBox_10 = new JCheckBox("Dire\u00E7\u00E3o Assistida");
		checkBox_10.setBounds(362, 138, 125, 23);
		panelConteudoVeiculos.add(checkBox_10);
		
		JCheckBox checkBox_11 = new JCheckBox("Flex");
		checkBox_11.setBounds(362, 164, 125, 23);
		panelConteudoVeiculos.add(checkBox_11);
		
		JLabel lblAcessorios = new JLabel("Acess\u00F3rios:\r\n");
		lblAcessorios.setBounds(10, 124, 86, 14);
		panelConteudoVeiculos.add(lblAcessorios);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(531, 217, 89, 23);
		panelConteudoVeiculos.add(btnSalvar);
		
		JButton btnLimpar_1 = new JButton("Limpar");
		btnLimpar_1.setBounds(432, 217, 89, 23);
		panelConteudoVeiculos.add(btnLimpar_1);
		
		JButton btnNovoVeiculo = new JButton("Novo Veiculo");
		btnNovoVeiculo.setBounds(319, 217, 103, 23);
		panelConteudoVeiculos.add(btnNovoVeiculo);
		
				
				
				JPanel panelLocacao = new JPanel();
				panelCardLayout.add(panelLocacao, "name_23041588410507");
				panelLocacao.setLayout(null);
				
				JPanel panelConteudoLocacao = new JPanel();
				panelConteudoLocacao.setLayout(null);
				panelConteudoLocacao.setBorder(new EmptyBorder(5, 5, 5, 5));
				panelConteudoLocacao.setBounds(10, 41, 754, 486);
				panelLocacao.add(panelConteudoLocacao);
				
				JPanel panelDadosCliente = new JPanel();
				panelDadosCliente.setLayout(null);
				panelDadosCliente.setBorder(new TitledBorder(null, "Dados do Cliente", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				panelDadosCliente.setBounds(10, 11, 355, 124);
				panelConteudoLocacao.add(panelDadosCliente);
				
				JLabel lblCliente = new JLabel("Cliente:");
				lblCliente.setBounds(9, 21, 37, 14);
				panelDadosCliente.add(lblCliente);
				
				JComboBox cbCliente = new JComboBox();
				cbCliente.setBounds(9, 35, 336, 20);
				panelDadosCliente.add(cbCliente);
				
				JLabel lbnCnh = new JLabel("N\u00FAmero de Registro CNH:");
				lbnCnh.setBounds(9, 66, 128, 14);
				panelDadosCliente.add(lbnCnh);
				
				txtRegistroCnhLocacao = new JTextField();
				txtRegistroCnhLocacao.setColumns(10);
				txtRegistroCnhLocacao.setBounds(9, 79, 146, 20);
				panelDadosCliente.add(txtRegistroCnhLocacao);
				
				JLabel lblCpf = new JLabel("CPF:");
				lblCpf.setBounds(180, 66, 86, 14);
				panelDadosCliente.add(lblCpf);
				
				txtCpfLocacao = new JTextField();
				txtCpfLocacao.setColumns(10);
				txtCpfLocacao.setBounds(180, 79, 165, 20);
				panelDadosCliente.add(txtCpfLocacao);
				
				JPanel panel_3 = new JPanel();
				panel_3.setLayout(null);
				panel_3.setBorder(new TitledBorder(null, "Selecionar Ve\u00EDculos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				panel_3.setBounds(10, 146, 355, 371);
				panelConteudoLocacao.add(panel_3);
				
				JLabel label_17 = new JLabel("Modelo:");
				label_17.setBounds(183, 23, 46, 14);
				panel_3.add(label_17);
				
				JComboBox cbMarca = new JComboBox();
				cbMarca.setBounds(10, 38, 147, 20);
				panel_3.add(cbMarca);
				
				JLabel label_18 = new JLabel("Marca:");
				label_18.setBounds(10, 23, 46, 14);
				panel_3.add(label_18);
				
				JComboBox cbModelo = new JComboBox();
				cbModelo.setBounds(182, 38, 163, 20);
				panel_3.add(cbModelo);
				
				JCheckBox checkBox = new JCheckBox("Ar Condicionado");
				checkBox.setBounds(6, 69, 129, 23);
				panel_3.add(checkBox);
				
				JCheckBox checkBox_1 = new JCheckBox("C\u00E2mbio Autom\u00E1tico");
				checkBox_1.setBounds(6, 95, 129, 23);
				panel_3.add(checkBox_1);
				
				JCheckBox checkBox_2 = new JCheckBox("DVD Player");
				checkBox_2.setBounds(6, 121, 97, 23);
				panel_3.add(checkBox_2);
				
				JCheckBox checkBox_3 = new JCheckBox("Dire\u00E7\u00E3o El\u00E9trica");
				checkBox_3.setBounds(182, 69, 125, 23);
				panel_3.add(checkBox_3);
				
				JCheckBox checkBox_4 = new JCheckBox("Dire\u00E7\u00E3o Assistida");
				checkBox_4.setBounds(182, 95, 125, 23);
				panel_3.add(checkBox_4);
				
				JCheckBox checkBox_5 = new JCheckBox("Flex");
				checkBox_5.setBounds(182, 121, 125, 23);
				panel_3.add(checkBox_5);
				
				JButton btnFiltrarVeiculos = new JButton("Filtrar Ve\u00EDculos");
				btnFiltrarVeiculos.setBounds(220, 151, 125, 23);
				panel_3.add(btnFiltrarVeiculos);
				
				tbListarVeiculos = new JTable();
				tbListarVeiculos.setBorder(new LineBorder(new Color(0, 0, 0)));
				tbListarVeiculos.setBounds(10, 185, 335, 147);
				panel_3.add(tbListarVeiculos);
				
				JPanel panel_4 = new JPanel();
				panel_4.setLayout(null);
				panel_4.setBorder(new TitledBorder(null, "Dados da Loca\u00E7\u00E3o", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				panel_4.setBounds(395, 11, 349, 258);
				panelConteudoLocacao.add(panel_4);
				
				JLabel label_19 = new JLabel("Data Loca\u00E7\u00E3o:");
				label_19.setBounds(21, 22, 77, 14);
				panel_4.add(label_19);
				
				txtDtLocacao = new JTextField();
				txtDtLocacao.setColumns(10);
				txtDtLocacao.setBounds(21, 40, 128, 20);
				panel_4.add(txtDtLocacao);
				
				JLabel label_20 = new JLabel("Data Devolu\u00E7\u00E3o:");
				label_20.setBounds(172, 22, 86, 14);
				panel_4.add(label_20);
				
				txtDtDevolucao = new JTextField();
				txtDtDevolucao.setColumns(10);
				txtDtDevolucao.setBounds(172, 40, 123, 20);
				panel_4.add(txtDtDevolucao);
				
				JLabel label_21 = new JLabel("Quantidade de dias:");
				label_21.setBounds(21, 163, 113, 14);
				panel_4.add(label_21);
				
				txtQuantidadeDiasLocado = new JTextField();
				txtQuantidadeDiasLocado.setText("qtdDiasLoc");
				txtQuantidadeDiasLocado.setColumns(10);
				txtQuantidadeDiasLocado.setBounds(21, 180, 128, 20);
				panel_4.add(txtQuantidadeDiasLocado);
				
				txtQuantidadeKm = new JTextField();
				txtQuantidadeKm.setColumns(10);
				txtQuantidadeKm.setBounds(172, 180, 128, 20);
				panel_4.add(txtQuantidadeKm);
				
				JLabel label_22 = new JLabel("Local de origem:");
				label_22.setBounds(21, 71, 86, 14);
				panel_4.add(label_22);
				
				JComboBox cbUfOrigem = new JComboBox();
				cbUfOrigem.setBounds(21, 86, 46, 20);
				panel_4.add(cbUfOrigem);
				
				JComboBox cbCidadeOrigem = new JComboBox();
				cbCidadeOrigem.setBounds(77, 86, 218, 20);
				panel_4.add(cbCidadeOrigem);
				
				JLabel label_23 = new JLabel("Local de destino:");
				label_23.setBounds(21, 117, 86, 14);
				panel_4.add(label_23);
				
				JComboBox cbUfDestino = new JComboBox();
				cbUfDestino.setBounds(21, 132, 46, 20);
				panel_4.add(cbUfDestino);
				
				JComboBox cbCidadeDestino = new JComboBox();
				cbCidadeDestino.setBounds(77, 132, 218, 20);
				panel_4.add(cbCidadeDestino);
				
				JLabel label_24 = new JLabel("Quantidade de km:");
				label_24.setBounds(172, 162, 113, 14);
				panel_4.add(label_24);
				
				JLabel label_25 = new JLabel("Valor a pagar:");
				label_25.setBounds(21, 210, 76, 14);
				panel_4.add(label_25);
				
				txtValorApagar = new JTextField();
				txtValorApagar.setColumns(10);
				txtValorApagar.setBounds(21, 227, 128, 20);
				panel_4.add(txtValorApagar);
				
				JLabel label_26 = new JLabel("Valor Cau\u00E7\u00E3o:");
				label_26.setBounds(172, 211, 67, 14);
				panel_4.add(label_26);
				
				txtValorCaucao = new JTextField();
				txtValorCaucao.setColumns(10);
				txtValorCaucao.setBounds(172, 227, 128, 20);
				panel_4.add(txtValorCaucao);
				
				JPanel panel_5 = new JPanel();
				panel_5.setLayout(null);
				panel_5.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Pagamento Cau\u00E7\u00E3o", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				panel_5.setBounds(395, 280, 349, 133);
				panelConteudoLocacao.add(panel_5);
				
				JRadioButton rdbtnDinheiro = new JRadioButton("Dinheiro");
				rdbtnDinheiro.setBounds(6, 37, 65, 23);
				panel_5.add(rdbtnDinheiro);
				
				JRadioButton rdbtnCartaoDeCredito = new JRadioButton("Cart\u00E3o de Cr\u00E9dito");
				rdbtnCartaoDeCredito.setBounds(81, 37, 125, 23);
				panel_5.add(rdbtnCartaoDeCredito);
				
				JButton btnEfetuarPagamento = new JButton("Efetuar Pagamento");
				btnEfetuarPagamento.setBounds(181, 95, 125, 23);
				panel_5.add(btnEfetuarPagamento);
				
				JLabel label_27 = new JLabel("Forma de Pagamento:");
				label_27.setBounds(10, 21, 106, 14);
				panel_5.add(label_27);
				
				JButton btnImprimirLocacao = new JButton("Imprimir");
				btnImprimirLocacao.setBounds(457, 455, 89, 23);
				panelConteudoLocacao.add(btnImprimirLocacao);
				
				JButton btnNovaLocacao = new JButton("Nova Loca\u00E7\u00E3o");
				btnNovaLocacao.setBounds(558, 455, 109, 23);
				panelConteudoLocacao.add(btnNovaLocacao);
				
				JButton btnSair = new JButton("Sair");
				btnSair.setBounds(677, 455, 65, 23);
				panelConteudoLocacao.add(btnSair);
				
				JSeparator separator = new JSeparator();
				separator.setOrientation(SwingConstants.VERTICAL);
				separator.setBounds(375, 0, 4, 517);
				panelConteudoLocacao.add(separator);
				
				JButton btnPesquisarLocacao = new JButton("Pesquisar Loca\u00E7\u00E3o");
				btnPesquisarLocacao.setBounds(564, 7, 132, 23);
				panelLocacao.add(btnPesquisarLocacao);
				
				JButton btnVoltar = new JButton("<");
				btnVoltar.setBounds(480, 7, 74, 23);
				panelLocacao.add(btnVoltar);
				
				JButton btnAvancar = new JButton(">");
				btnAvancar.setBounds(700, 7, 74, 23);
				panelLocacao.add(btnAvancar);
				
				txtStatusdopedido = new JTextField();
				txtStatusdopedido.setBounds(130, 8, 86, 20);
				panelLocacao.add(txtStatusdopedido);
				txtStatusdopedido.setColumns(10);
				
				JPanel panelPagamento = new JPanel();
				panelCardLayout.add(panelPagamento, "name_27592815355536");
				panelPagamento.setLayout(null);
				
				JPanel panelConteudoPagamento = new JPanel();
				panelConteudoPagamento.setBorder(new TitledBorder(null, "Realizar Pagamento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				panelConteudoPagamento.setBounds(194, 76, 380, 363);
				panelPagamento.add(panelConteudoPagamento);
				panelConteudoPagamento.setLayout(null);
				
				JComboBox cbClientePagamento = new JComboBox();
				cbClientePagamento.setBounds(27, 94, 294, 20);
				panelConteudoPagamento.add(cbClientePagamento);
				
				JLabel label_32 = new JLabel("Cliente:");
				label_32.setBounds(27, 80, 37, 14);
				panelConteudoPagamento.add(label_32);
				
				JLabel lblFormaDePagamento = new JLabel("Forma de pagamento:");
				lblFormaDePagamento.setBounds(27, 185, 106, 14);
				panelConteudoPagamento.add(lblFormaDePagamento);
				
				JComboBox cbTipoPagamento = new JComboBox();
				cbTipoPagamento.setBounds(27, 145, 173, 20);
				panelConteudoPagamento.add(cbTipoPagamento);
				
				JRadioButton rdbtnAVista = new JRadioButton("A vista");
				rdbtnAVista.setBounds(23, 201, 66, 23);
				panelConteudoPagamento.add(rdbtnAVista);
				
				JRadioButton rdbtnParcelado = new JRadioButton("Parcelado");
				rdbtnParcelado.setBounds(114, 201, 109, 23);
				panelConteudoPagamento.add(rdbtnParcelado);
				
				JLabel lblValorRecebido = new JLabel("Valor Recebido:\r\n\r\n");
				lblValorRecebido.setBounds(27, 242, 81, 14);
				panelConteudoPagamento.add(lblValorRecebido);
				
				JLabel lblValorTotal = new JLabel("Valor Total:");
				lblValorTotal.setBounds(124, 240, 61, 14);
				panelConteudoPagamento.add(lblValorTotal);
				
				JLabel lblTipoDePagamento = new JLabel("Tipo de Pagamento:");
				lblTipoDePagamento.setBounds(27, 125, 106, 14);
				panelConteudoPagamento.add(lblTipoDePagamento);
				
				txtValortotal = new JTextField();
				txtValortotal.setBounds(123, 257, 100, 20);
				panelConteudoPagamento.add(txtValortotal);
				txtValortotal.setColumns(10);
				
				JLabel lblTroco = new JLabel("Troco:");
				lblTroco.setBounds(235, 242, 38, 14);
				panelConteudoPagamento.add(lblTroco);
				
				JLabel lblDataDoPagamento = new JLabel("Data do Pagamento:");
				lblDataDoPagamento.setBounds(27, 35, 115, 14);
				panelConteudoPagamento.add(lblDataDoPagamento);
				
				txtDatapagamento = new JTextField();
				txtDatapagamento.setBounds(27, 49, 115, 20);
				panelConteudoPagamento.add(txtDatapagamento);
				txtDatapagamento.setColumns(10);
				
				txtValorrecebido = new JTextField();
				txtValorrecebido.setBounds(27, 257, 86, 20);
				panelConteudoPagamento.add(txtValorrecebido);
				txtValorrecebido.setColumns(10);
				
				txtTroco = new JTextField();
				txtTroco.setText("troco");
				txtTroco.setBounds(235, 257, 86, 20);
				panelConteudoPagamento.add(txtTroco);
				txtTroco.setColumns(10);
				
				JButton btnEfetuarPagamento_2 = new JButton("Efetuar Pagamento");
				btnEfetuarPagamento_2.setBounds(188, 303, 133, 23);
				panelConteudoPagamento.add(btnEfetuarPagamento_2);
				
				JButton btnCancelarPagamento = new JButton("Cancelar Pagamento");
				btnCancelarPagamento.setBounds(27, 303, 151, 23);
				panelConteudoPagamento.add(btnCancelarPagamento);
				
				JButton button_2 = new JButton("<");
				button_2.setBounds(705, 11, 69, 23);
				panelPagamento.add(button_2);
		
		setTitle("LoCAR Express - Locadora de Ve\u00EDculos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 605);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnCadastro = new JMenu("Cadastro");
		menuBar.add(mnCadastro);

		JMenuItem mntmCliente = new JMenuItem("Cliente");
		mntmCliente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ClientesView  novaInstancia = new ClientesView();
				novaInstancia.setVisible(true);
			}
		});
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
		
		JMenu mnFinanceiro = new JMenu("Financeiro");
		menuBar.add(mnFinanceiro);
		
		JMenuItem mntmCaixa = new JMenuItem("Caixa");
		mnFinanceiro.add(mntmCaixa);
		
		JMenuItem mntmPagamento = new JMenuItem("Pagamento");
		mnFinanceiro.add(mntmPagamento);

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

	}
}
