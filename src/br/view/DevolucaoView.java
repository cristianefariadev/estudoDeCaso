package br.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;

public class DevolucaoView extends JFrame {

	private JPanel contentPane;
	private JTextField textField_4;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DevolucaoView frame = new DevolucaoView();
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
	public DevolucaoView() {
		setTitle("Pedido de Devolu\u00E7\u00E3o");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 385, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(null, "Dados do Cliente", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(10, 11, 328, 414);
		contentPane.add(panel_2);
		
		JLabel label_5 = new JLabel("Cliente:");
		label_5.setBounds(9, 21, 37, 14);
		panel_2.add(label_5);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(9, 35, 294, 20);
		panel_2.add(comboBox_3);
		
		JLabel lblVeculo = new JLabel("Ve\u00EDculo Locado:");
		lblVeculo.setBounds(9, 66, 78, 14);
		panel_2.add(lblVeculo);
		
		textField_4 = new JTextField();
		textField_4.setBounds(9, 81, 294, 20);
		panel_2.add(textField_4);
		textField_4.setText("");
		textField_4.setColumns(10);
		
		JLabel lblOcorrncias = new JLabel("Ocorr\u00EAncias:");
		lblOcorrncias.setBounds(10, 189, 90, 14);
		panel_2.add(lblOcorrncias);
		
		JRadioButton rdbtnSim = new JRadioButton("Sim");
		rdbtnSim.setBounds(56, 210, 52, 23);
		panel_2.add(rdbtnSim);
		
		JRadioButton rdbtnNo = new JRadioButton("N\u00E3o");
		rdbtnNo.setBounds(9, 210, 109, 23);
		panel_2.add(rdbtnNo);
		
		JLabel lblQuais = new JLabel("Qual?");
		lblQuais.setBounds(9, 237, 46, 14);
		panel_2.add(lblQuais);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(9, 255, 238, 20);
		panel_2.add(comboBox);
		
		JButton button = new JButton("+");
		button.setBounds(257, 254, 46, 23);
		panel_2.add(button);
		
		JLabel lblValorCobrado = new JLabel("Valor Cobrado:");
		lblValorCobrado.setBounds(9, 112, 91, 14);
		panel_2.add(lblValorCobrado);
		
		textField = new JTextField();
		textField.setBounds(9, 130, 132, 20);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel lblValorCauo = new JLabel("Valor Cau\u00E7\u00E3o");
		lblValorCauo.setBounds(169, 112, 90, 14);
		panel_2.add(lblValorCauo);
		
		textField_1 = new JTextField();
		textField_1.setBounds(169, 130, 134, 20);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblValorAtualizado = new JLabel("Valor Atualizado:");
		lblValorAtualizado.setBounds(9, 300, 99, 14);
		panel_2.add(lblValorAtualizado);
		
		textField_2 = new JTextField();
		textField_2.setBounds(9, 317, 132, 20);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblValorARever = new JLabel("Valor a rever:");
		lblValorARever.setBounds(169, 300, 78, 14);
		panel_2.add(lblValorARever);
		
		textField_3 = new JTextField();
		textField_3.setBounds(161, 317, 142, 20);
		panel_2.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnEfetuarPagamentoestorno = new JButton("efetuar pagamento/estorno");
		btnEfetuarPagamentoestorno.setBounds(102, 369, 201, 23);
		panel_2.add(btnEfetuarPagamentoestorno);
		
		JButton button_1 = new JButton("Imprimir");
		button_1.setBounds(35, 448, 85, 23);
		contentPane.add(button_1);
		
		JButton btnNovaDevoluo = new JButton("Nova Devolu\u00E7\u00E3o");
		btnNovaDevoluo.setBounds(130, 448, 133, 23);
		contentPane.add(btnNovaDevoluo);
		
		JButton button_3 = new JButton("Sair");
		button_3.setBounds(273, 448, 65, 23);
		contentPane.add(button_3);
	}
}
