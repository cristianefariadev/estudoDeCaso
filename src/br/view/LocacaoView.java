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

public class LocacaoView extends JFrame {

	private JPanel contentPane;
	private JTextField txtCnh;
	private JTextField txtCategoria;
	private JTable table;
	private JTextField textField;
	private JTextField txtDtlocacao;
	private JTextField textField_1;
	private JTextField txtQtddiasloc;
	private JTextField textField_2;

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
		setBounds(100, 100, 672, 514);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Dados do Cliente", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(342, 11, 304, 124);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblCliente = new JLabel("Cliente:");
		lblCliente.setBounds(9, 21, 37, 14);
		panel.add(lblCliente);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(9, 35, 274, 20);
		panel.add(comboBox);
		
		JLabel lblCnh = new JLabel("N\u00FAmero de Registro CNH:");
		lblCnh.setBounds(9, 66, 128, 14);
		panel.add(lblCnh);
		
		txtCnh = new JTextField();
		txtCnh.setBounds(9, 79, 107, 20);
		panel.add(txtCnh);
		txtCnh.setColumns(10);
		
		JLabel lblCategoria = new JLabel("Categoria CNH:");
		lblCategoria.setBounds(157, 66, 86, 14);
		panel.add(lblCategoria);
		
		txtCategoria = new JTextField();
		txtCategoria.setBounds(157, 79, 102, 20);
		panel.add(txtCategoria);
		txtCategoria.setColumns(10);
		
		Box verticalBox = Box.createVerticalBox();
		verticalBox.setBounds(324, 0, 8, 476);
		contentPane.add(verticalBox);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Selecionar Ve\u00EDculos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 11, 304, 423);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setBounds(155, 23, 46, 14);
		panel_1.add(lblModelo);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(10, 38, 125, 20);
		panel_1.add(comboBox_1);
		
		JLabel lblMarca = new JLabel("Marca:");
		lblMarca.setBounds(10, 23, 46, 14);
		panel_1.add(lblMarca);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(155, 38, 125, 20);
		panel_1.add(comboBox_2);
		
		JCheckBox chckbxArCondicionado = new JCheckBox("Ar Condicionado");
		chckbxArCondicionado.setBounds(6, 69, 129, 23);
		panel_1.add(chckbxArCondicionado);
		
		JCheckBox chckbxCmbioAutomtico = new JCheckBox("C\u00E2mbio Autom\u00E1tico");
		chckbxCmbioAutomtico.setBounds(6, 95, 129, 23);
		panel_1.add(chckbxCmbioAutomtico);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("DVD Player");
		chckbxNewCheckBox.setBounds(6, 121, 97, 23);
		panel_1.add(chckbxNewCheckBox);
		
		JCheckBox chckbxDireoEltrica = new JCheckBox("Dire\u00E7\u00E3o El\u00E9trica");
		chckbxDireoEltrica.setBounds(155, 69, 125, 23);
		panel_1.add(chckbxDireoEltrica);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Dire\u00E7\u00E3o Assistida");
		chckbxNewCheckBox_1.setBounds(155, 95, 125, 23);
		panel_1.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Flex");
		chckbxNewCheckBox_2.setBounds(155, 121, 125, 23);
		panel_1.add(chckbxNewCheckBox_2);
		
		JButton btnFiltrarVeculos = new JButton("Filtrar Ve\u00EDculos");
		btnFiltrarVeculos.setBounds(155, 162, 125, 23);
		panel_1.add(btnFiltrarVeculos);
		
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBounds(10, 196, 284, 185);
		panel_1.add(table);
		
		JLabel lblSubtotal = new JLabel("SubTotal:");
		lblSubtotal.setBounds(148, 398, 53, 14);
		panel_1.add(lblSubtotal);
		
		textField = new JTextField();
		textField.setBounds(208, 395, 86, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Dados da Loca\u00E7\u00E3o", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(342, 146, 304, 221);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Data Loca\u00E7\u00E3o:");
		lblNewLabel.setBounds(10, 22, 77, 14);
		panel_2.add(lblNewLabel);
		
		txtDtlocacao = new JTextField();
		txtDtlocacao.setText("dtLocacao");
		txtDtlocacao.setBounds(10, 40, 113, 20);
		panel_2.add(txtDtlocacao);
		txtDtlocacao.setColumns(10);
		
		JLabel lblSada = new JLabel("Data Devolu\u00E7\u00E3o:");
		lblSada.setBounds(10, 70, 86, 14);
		panel_2.add(lblSada);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 88, 113, 20);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblQuantidadeDeDias = new JLabel("Quantidade de dias:");
		lblQuantidadeDeDias.setBounds(160, 22, 113, 14);
		panel_2.add(lblQuantidadeDeDias);
		
		txtQtddiasloc = new JTextField();
		txtQtddiasloc.setText("qtdDiasLoc");
		txtQtddiasloc.setBounds(160, 40, 86, 20);
		panel_2.add(txtQtddiasloc);
		txtQtddiasloc.setColumns(10);
		
		JLabel lblSubtotal_1 = new JLabel("SubTotal:");
		lblSubtotal_1.setBounds(160, 70, 46, 14);
		panel_2.add(lblSubtotal_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(160, 88, 86, 20);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblLocalDeOrigem = new JLabel("Local de origem:");
		lblLocalDeOrigem.setBounds(10, 119, 86, 14);
		panel_2.add(lblLocalDeOrigem);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(10, 134, 46, 20);
		panel_2.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(66, 134, 180, 20);
		panel_2.add(comboBox_4);
		
		JLabel lblLocalDeDestino = new JLabel("Local de destino:");
		lblLocalDeDestino.setBounds(10, 164, 86, 14);
		panel_2.add(lblLocalDeDestino);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(10, 179, 46, 20);
		panel_2.add(comboBox_5);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setBounds(66, 179, 180, 20);
		panel_2.add(comboBox_6);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Pagamento Cau\u00E7\u00E3o", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_3.setBounds(342, 377, 304, 88);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JRadioButton rdbtnDinheiro = new JRadioButton("Dinheiro");
		rdbtnDinheiro.setBounds(6, 19, 65, 23);
		panel_3.add(rdbtnDinheiro);
		
		JRadioButton rdbtnCartoDeCrdito = new JRadioButton("Cart\u00E3o de Cr\u00E9dito");
		rdbtnCartoDeCrdito.setBounds(81, 19, 137, 23);
		panel_3.add(rdbtnCartoDeCrdito);
		
		JButton btnPagar = new JButton("Pagar");
		btnPagar.setBounds(186, 49, 89, 23);
		panel_3.add(btnPagar);
	}
}
