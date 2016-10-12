package br.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JComboBox;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.BoxLayout;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.Box;
import java.awt.Component;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import java.awt.Panel;
import javax.swing.JRadioButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class LocacaoView extends JFrame {

	private JPanel contentPane;
	private JTextField txtCnh;
	private JTextField txtCategoria;
	private JTable table;
	private JTextField txtDtLocacao;
	private JTextField txtDtDevolucao;
	private JTextField txtQtddiasloc;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LocacaoView frame = new LocacaoView();
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
	public LocacaoView() {
		setTitle("Pedido de Loca\u00E7\u00E3o");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 555);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelDadosCliente = new JPanel();
		panelDadosCliente.setBorder(new TitledBorder(null, "Dados do Cliente", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelDadosCliente.setBounds(10, 11, 304, 124);
		contentPane.add(panelDadosCliente);
		panelDadosCliente.setLayout(null);
		
		JLabel lblCliente = new JLabel("Cliente:");
		lblCliente.setBounds(9, 21, 37, 14);
		panelDadosCliente.add(lblCliente);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(9, 35, 274, 20);
		panelDadosCliente.add(comboBox);
		
		JLabel lblCnh = new JLabel("N\u00FAmero de Registro CNH:");
		lblCnh.setBounds(9, 66, 128, 14);
		panelDadosCliente.add(lblCnh);
		
		txtCnh = new JTextField();
		txtCnh.setBounds(9, 79, 107, 20);
		panelDadosCliente.add(txtCnh);
		txtCnh.setColumns(10);
		
		JLabel lblCategoria = new JLabel("Categoria CNH:");
		lblCategoria.setBounds(157, 66, 86, 14);
		panelDadosCliente.add(lblCategoria);
		
		txtCategoria = new JTextField();
		txtCategoria.setBounds(157, 79, 102, 20);
		panelDadosCliente.add(txtCategoria);
		txtCategoria.setColumns(10);
		
		JPanel panelSelecVeiculos = new JPanel();
		panelSelecVeiculos.setBorder(new TitledBorder(null, "Selecionar Ve\u00EDculos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelSelecVeiculos.setBounds(10, 146, 304, 371);
		contentPane.add(panelSelecVeiculos);
		panelSelecVeiculos.setLayout(null);
		
		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setBounds(155, 23, 46, 14);
		panelSelecVeiculos.add(lblModelo);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(10, 38, 125, 20);
		panelSelecVeiculos.add(comboBox_1);
		
		JLabel lblMarca = new JLabel("Marca:");
		lblMarca.setBounds(10, 23, 46, 14);
		panelSelecVeiculos.add(lblMarca);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(155, 38, 125, 20);
		panelSelecVeiculos.add(comboBox_2);
		
		JCheckBox chckbxArCondicionado = new JCheckBox("Ar Condicionado");
		chckbxArCondicionado.setBounds(6, 69, 129, 23);
		panelSelecVeiculos.add(chckbxArCondicionado);
		
		JCheckBox chckbxCmbioAutomtico = new JCheckBox("C\u00E2mbio Autom\u00E1tico");
		chckbxCmbioAutomtico.setBounds(6, 95, 129, 23);
		panelSelecVeiculos.add(chckbxCmbioAutomtico);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("DVD Player");
		chckbxNewCheckBox.setBounds(6, 121, 97, 23);
		panelSelecVeiculos.add(chckbxNewCheckBox);
		
		JCheckBox chckbxDireoEltrica = new JCheckBox("Dire\u00E7\u00E3o El\u00E9trica");
		chckbxDireoEltrica.setBounds(155, 69, 125, 23);
		panelSelecVeiculos.add(chckbxDireoEltrica);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Dire\u00E7\u00E3o Assistida");
		chckbxNewCheckBox_1.setBounds(155, 95, 125, 23);
		panelSelecVeiculos.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Flex");
		chckbxNewCheckBox_2.setBounds(155, 121, 125, 23);
		panelSelecVeiculos.add(chckbxNewCheckBox_2);
		
		JButton btnFiltrarVeculos = new JButton("Filtrar Ve\u00EDculos");
		btnFiltrarVeculos.setBounds(155, 151, 125, 23);
		panelSelecVeiculos.add(btnFiltrarVeculos);
		
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBounds(10, 185, 284, 159);
		panelSelecVeiculos.add(table);
		
		JPanel panelDadosLocacao = new JPanel();
		panelDadosLocacao.setBorder(new TitledBorder(null, "Dados da Loca\u00E7\u00E3o", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelDadosLocacao.setBounds(342, 11, 288, 258);
		contentPane.add(panelDadosLocacao);
		panelDadosLocacao.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Data Loca\u00E7\u00E3o:");
		lblNewLabel.setBounds(10, 22, 77, 14);
		panelDadosLocacao.add(lblNewLabel);
		
		txtDtLocacao = new JTextField();
		txtDtLocacao.setBounds(10, 40, 113, 20);
		panelDadosLocacao.add(txtDtLocacao);
		txtDtLocacao.setColumns(10);
		
		JLabel lblSada = new JLabel("Data Devolu\u00E7\u00E3o:");
		lblSada.setBounds(152, 22, 86, 14);
		panelDadosLocacao.add(lblSada);
		
		txtDtDevolucao = new JTextField();
		txtDtDevolucao.setBounds(152, 40, 113, 20);
		panelDadosLocacao.add(txtDtDevolucao);
		txtDtDevolucao.setColumns(10);
		
		JLabel lblQuantidadeDeDias = new JLabel("Quantidade de dias:");
		lblQuantidadeDeDias.setBounds(10, 162, 113, 14);
		panelDadosLocacao.add(lblQuantidadeDeDias);
		
		txtQtddiasloc = new JTextField();
		txtQtddiasloc.setText("qtdDiasLoc");
		txtQtddiasloc.setBounds(10, 179, 113, 20);
		panelDadosLocacao.add(txtQtddiasloc);
		txtQtddiasloc.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(152, 180, 113, 20);
		panelDadosLocacao.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblLocalDeOrigem = new JLabel("Local de origem:");
		lblLocalDeOrigem.setBounds(10, 71, 86, 14);
		panelDadosLocacao.add(lblLocalDeOrigem);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(10, 86, 46, 20);
		panelDadosLocacao.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(66, 86, 199, 20);
		panelDadosLocacao.add(comboBox_4);
		
		JLabel lblLocalDeDestino = new JLabel("Local de destino:");
		lblLocalDeDestino.setBounds(10, 116, 86, 14);
		panelDadosLocacao.add(lblLocalDeDestino);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(10, 131, 46, 20);
		panelDadosLocacao.add(comboBox_5);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setBounds(66, 131, 199, 20);
		panelDadosLocacao.add(comboBox_6);
		
		JLabel lblQuantidadeDeKm = new JLabel("Quantidade de km:");
		lblQuantidadeDeKm.setBounds(152, 162, 113, 14);
		panelDadosLocacao.add(lblQuantidadeDeKm);
		
		JLabel lblValorAPagar = new JLabel("Valor a pagar:");
		lblValorAPagar.setBounds(10, 210, 76, 14);
		panelDadosLocacao.add(lblValorAPagar);
		
		textField_3 = new JTextField();
		textField_3.setBounds(10, 227, 113, 20);
		panelDadosLocacao.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblValorCauo = new JLabel("Valor Cau\u00E7\u00E3o:");
		lblValorCauo.setBounds(152, 211, 67, 14);
		panelDadosLocacao.add(lblValorCauo);
		
		textField = new JTextField();
		textField.setBounds(152, 227, 113, 20);
		panelDadosLocacao.add(textField);
		textField.setColumns(10);
		
		JPanel panelPagamento = new JPanel();
		panelPagamento.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Pagamento Cau\u00E7\u00E3o", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelPagamento.setBounds(342, 280, 288, 186);
		contentPane.add(panelPagamento);
		panelPagamento.setLayout(null);
		
		JRadioButton rdbtnDinheiro = new JRadioButton("Dinheiro");
		rdbtnDinheiro.setBounds(6, 37, 65, 23);
		panelPagamento.add(rdbtnDinheiro);
		
		JRadioButton rdbtnCartoDeCrdito = new JRadioButton("Cart\u00E3o de Cr\u00E9dito");
		rdbtnCartoDeCrdito.setBounds(81, 37, 137, 23);
		panelPagamento.add(rdbtnCartoDeCrdito);
		
		JButton btnPagar = new JButton("Efetuar Pagamento");
		btnPagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnPagar.setBounds(93, 115, 125, 23);
		panelPagamento.add(btnPagar);
		
		JLabel lblFormaDePagamento = new JLabel("Forma de Pagamento:");
		lblFormaDePagamento.setBounds(10, 21, 106, 14);
		panelPagamento.add(lblFormaDePagamento);
		
		JButton btnImprimirLocao = new JButton("Imprimir");
		btnImprimirLocao.setBounds(345, 477, 89, 23);
		contentPane.add(btnImprimirLocao);
		
		JButton btnNovaLocao = new JButton("Nova Loca\u00E7\u00E3o");
		btnNovaLocao.setBounds(444, 477, 109, 23);
		contentPane.add(btnNovaLocao);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(563, 477, 65, 23);
		contentPane.add(btnSair);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(326, 0, 4, 517);
		contentPane.add(separator);
	}
}
