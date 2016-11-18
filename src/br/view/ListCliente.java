package br.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;


public class ListCliente extends JInternalFrame {
	/** Atributo serialVersionUID. */
	private static final long serialVersionUID = 1L;
	private JTextField txtPesquisarCliente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			public void run() {

				try {
					ListCliente frame = new ListCliente();
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
	public ListCliente() {
		setEnabled(false);
		setTitle("PESQUISAR CLIENTE");
		setMaximizable(true);
		setBounds(100, 100, 625, 427);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 609, 397);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblConsultarPor = new JLabel("Consultar por:");
		lblConsultarPor.setBounds(23, 11, 90, 14);
		panel.add(lblConsultarPor);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"C\u00D3DIGO", "NOME"}));
		comboBox.setBounds(99, 8, 72, 20);
		panel.add(comboBox);
		
		txtPesquisarCliente = new JTextField();
		txtPesquisarCliente.setBounds(181, 8, 298, 20);
		panel.add(txtPesquisarCliente);
		txtPesquisarCliente.setColumns(10);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon(ListCliente.class.getResource("/image/icons/zoom.png")));
		button.setBounds(489, 7, 60, 23);
		panel.add(button);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(23, 47, 546, 278);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblTabelaPopulada = new JLabel("Tabela populada");
		lblTabelaPopulada.setBounds(213, 132, 119, 14);
		panel_1.add(lblTabelaPopulada);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setIcon(new ImageIcon(ListCliente.class.getResource("/image/icons/pencil.png")));
		btnAlterar.setBounds(219, 349, 104, 23);
		panel.add(btnAlterar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setIcon(new ImageIcon(ListCliente.class.getResource("/image/icons/delete.png")));
		btnExcluir.setBounds(333, 349, 113, 23);
		panel.add(btnExcluir);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setIcon(new ImageIcon(ListCliente.class.getResource("/image/icons/cancel.png")));
		btnCancelar.setBounds(456, 349, 113, 23);
		panel.add(btnCancelar);

	}
}
