package br.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.Font;

public class VeiculosView extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VeiculosView frame = new VeiculosView();
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
	public VeiculosView() {
		setTitle("Manter Ve\u00EDculos");
		setBounds(100, 100, 661, 517);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), "Corpo", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 86, 629, 391);
		getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Inserir Contato",							TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(10, 21, 514, 208);
		panel.add(panel_1);
		
		JLabel label = new JLabel("Nome:");
		label.setBounds(27, 30, 48, 14);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("Telefone:");
		label_1.setBounds(275, 96, 48, 14);
		panel_1.add(label_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(101, 27, 379, 20);
		panel_1.add(textField);
		
		JButton button = new JButton("Salvar");
		button.setBounds(407, 166, 73, 20);
		panel_1.add(button);
		
		JButton button_1 = new JButton("Limpar");
		button_1.setBounds(322, 166, 75, 20);
		panel_1.add(button_1);
		
		JLabel label_2 = new JLabel("CPF:");
		label_2.setBounds(37, 61, 31, 14);
		panel_1.add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(101, 58, 163, 20);
		panel_1.add(textField_1);
		
		JLabel label_3 = new JLabel("RG:");
		label_3.setBounds(302, 61, 46, 14);
		panel_1.add(label_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(333, 58, 147, 20);
		panel_1.add(textField_2);
		
		JLabel label_4 = new JLabel("CNH:");
		label_4.setBounds(37, 96, 31, 14);
		panel_1.add(label_4);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(101, 93, 164, 20);
		panel_1.add(textField_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(null, "Pesquisar Contato", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(46, 240, 418, 221);
		panel.add(panel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 62, 394, 159);
		panel_2.add(scrollPane);
		
		JLabel label_5 = new JLabel("Consultar:");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_5.setBounds(10, 33, 60, 14);
		panel_2.add(label_5);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(65, 31, 128, 20);
		panel_2.add(textField_4);
		
		JButton button_2 = new JButton("Listar");
		button_2.setBounds(308, 30, 97, 23);
		panel_2.add(button_2);
		
		JButton button_3 = new JButton("Pesquisar");
		button_3.setBounds(203, 30, 95, 23);
		panel_2.add(button_3);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new TitledBorder(null, "Menu", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(10, 13, 554, 62);
		getContentPane().add(panel_3);
		
		JButton button_4 = new JButton("Editar");
		button_4.setBounds(83, 17, 76, 23);
		panel_3.add(button_4);
		
		JButton button_5 = new JButton("Novo");
		button_5.setBounds(10, 17, 66, 23);
		panel_3.add(button_5);
		
		JButton button_6 = new JButton("Excluir");
		button_6.setBounds(169, 17, 76, 23);
		panel_3.add(button_6);
		
		JButton button_7 = new JButton("Imprimir");
		button_7.setBounds(255, 17, 82, 23);
		panel_3.add(button_7);
		
		JButton button_8 = new JButton("Sair");
		button_8.setBounds(347, 17, 61, 23);
		panel_3.add(button_8);

	}

}
