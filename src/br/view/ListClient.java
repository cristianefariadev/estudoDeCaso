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

public class ListClient extends JInternalFrame {
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
					ListClient frame = new ListClient();
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
	public ListClient() {
		setBounds(100, 100, 743, 533);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Pesquisar Cliente", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		panel.setBounds(10, 97, 676, 396);
		getContentPane().add(panel);

		JLabel label = new JLabel("Consultar:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label.setBounds(10, 33, 60, 14);
		panel.add(label);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(80, 31, 176, 20);
		panel.add(textField);

		JButton button = new JButton("Listar");
		button.setBounds(371, 30, 97, 23);
		panel.add(button);

		JButton button_1 = new JButton("Pesquisar");
		button_1.setBounds(266, 30, 95, 23);
		panel.add(button_1);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 63, 656, 322);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 656, 322);
		panel_1.add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "CODIGO" }));
		table.setBounds(10, 11, 636, 300);
		panel_1.add(table);

		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(119, 25, 489, 61);
		getContentPane().add(panel_2);

		JButton btnNovo = new JButton("");
		btnNovo.setIcon(new ImageIcon(ClientesView.class.getResource("/image/icons/user_add.png")));
		btnNovo.setBounds(26, 11, 61, 34);
		panel_2.add(btnNovo);

		JButton btnEditar = new JButton("");
		btnEditar.setIcon(new ImageIcon(ClientesView.class.getResource("/image/icons/user_edit.png")));
		btnEditar.setBounds(97, 11, 61, 34);
		panel_2.add(btnEditar);

		JButton buttonListar = new JButton("");
		buttonListar.setIcon(new ImageIcon(ClientesView.class.getResource("/image/icons/user_go.png")));
		buttonListar.setBounds(168, 11, 61, 34);
		panel_2.add(buttonListar);

		JButton btnExcluir = new JButton("");
		btnExcluir.setIcon(new ImageIcon(ClientesView.class.getResource("/image/icons/user_delete.png")));
		btnExcluir.setBounds(239, 11, 61, 34);
		panel_2.add(btnExcluir);

		JButton btnImprimir = new JButton("");
		btnImprimir.setIcon(new ImageIcon(ClientesView.class.getResource("/image/icons/printer.png")));
		btnImprimir.setBounds(307, 11, 61, 34);
		panel_2.add(btnImprimir);

		JButton btnSair = new JButton("");
		btnSair.setIcon(new ImageIcon(ClientesView.class.getResource("/image/icons/cancel.png")));
		btnSair.setBounds(378, 11, 61, 34);
		panel_2.add(btnSair);

	}
}
