package br.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ListDevolucao extends JInternalFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListDevolucao frame = new ListDevolucao();
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
	public ListDevolucao() {
		setBounds(100, 100, 743, 533);
		getContentPane().setLayout(null);

		JPanel panelPesquisarCliente = new JPanel();
		panelPesquisarCliente.setLayout(null);
		panelPesquisarCliente.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Pesquisar Devolucao", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelPesquisarCliente.setBounds(10, 11, 676, 469);
		getContentPane().add(panelPesquisarCliente);

		JLabel label = new JLabel("Consultar:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label.setBounds(10, 33, 60, 14);
		panelPesquisarCliente.add(label);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(80, 31, 176, 20);
		panelPesquisarCliente.add(textField);

		JButton button = new JButton("Listar");
		button.setBounds(371, 30, 97, 23);
		panelPesquisarCliente.add(button);

		JButton button_1 = new JButton("Pesquisar");
		button_1.setBounds(266, 30, 95, 23);
		panelPesquisarCliente.add(button_1);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 63, 656, 322);
		panelPesquisarCliente.add(panel_1);
		panel_1.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 656, 322);
		panel_1.add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "CODIGO" }));
		table.setBounds(10, 11, 636, 300);
		panel_1.add(table);

	}
}
