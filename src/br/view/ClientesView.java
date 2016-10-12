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
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JComboBox;

public class ClientesView extends JInternalFrame {
	private JTextField txtRegistro;
	private JTextField txtRg;
	private JTextField txtNumRegistroCNH;
	private JTextField textField_4;
	private JTextField txtNome;
	private JTextField txtCatcnh;
	private JTextField txtTelefone;
	private JTextField txtCpf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientesView frame = new ClientesView();
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
	public ClientesView() {
		setBounds(100, 100, 523, 652);
		getContentPane().setLayout(null);
		
		JPanel panelConteiner = new JPanel();
		panelConteiner.setBounds(0, 0, 507, 623);
		getContentPane().add(panelConteiner);
		panelConteiner.setLayout(null);
		
		JPanel panelMenu = new JPanel();
		panelMenu.setBounds(10, 11, 489, 61);
		panelConteiner.add(panelMenu);
		panelMenu.setLayout(null);
		panelMenu.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JButton btnEditar = new JButton("");
		btnEditar.setIcon(new ImageIcon(ClientesView.class.getResource("/image/icons/user_edit.png")));
		btnEditar.setBounds(97, 11, 61, 34);
		panelMenu.add(btnEditar);
		
		JButton btnNovo = new JButton("");
		btnNovo.setIcon(new ImageIcon(ClientesView.class.getResource("/image/icons/user_add.png")));
		btnNovo.setBounds(26, 11, 61, 34);
		panelMenu.add(btnNovo);
		
		JButton btnExcluir = new JButton("");
		btnExcluir.setIcon(new ImageIcon(ClientesView.class.getResource("/image/icons/user_delete.png")));
		btnExcluir.setBounds(168, 11, 61, 34);
		panelMenu.add(btnExcluir);
		
		JButton button_7 = new JButton("");
		button_7.setIcon(new ImageIcon(ClientesView.class.getResource("/image/icons/printer.png")));
		button_7.setBounds(307, 11, 61, 34);
		panelMenu.add(button_7);
		
		JButton button_8 = new JButton("");
		button_8.setIcon(new ImageIcon(ClientesView.class.getResource("/image/icons/cancel.png")));
		button_8.setBounds(378, 11, 61, 34);
		panelMenu.add(button_8);
		
		JButton button_4 = new JButton("");
		button_4.setIcon(new ImageIcon(ClientesView.class.getResource("/image/icons/user_go.png")));
		button_4.setBounds(236, 11, 61, 34);
		panelMenu.add(button_4);
		
		JPanel panelInserir = new JPanel();
		panelInserir.setBounds(10, 83, 489, 249);
		panelConteiner.add(panelInserir);
		panelInserir.setLayout(null);
		panelInserir.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Inserir Cliente", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JLabel lblNomeCompleto = new JLabel("Nome Completo:");
		lblNomeCompleto.setBounds(10, 74, 94, 14);
		panelInserir.add(lblNomeCompleto);
		
		JLabel label_1 = new JLabel("Telefone:");
		label_1.setBounds(330, 120, 48, 14);
		panelInserir.add(label_1);
		
		txtRegistro = new JTextField();
		txtRegistro.setColumns(10);
		txtRegistro.setBounds(10, 43, 128, 20);
		panelInserir.add(txtRegistro);
		
		JButton button = new JButton("Salvar");
		button.setBounds(381, 210, 73, 20);
		panelInserir.add(button);
		
		JButton button_1 = new JButton("Limpar");
		button_1.setBounds(296, 210, 75, 20);
		panelInserir.add(button_1);
		
		JLabel label_3 = new JLabel("RG:");
		label_3.setBounds(164, 120, 46, 14);
		panelInserir.add(label_3);
		
		txtRg = new JTextField();
		txtRg.setColumns(10);
		txtRg.setBounds(164, 134, 137, 20);
		panelInserir.add(txtRg);
		
		JLabel lblNmeroDeRegistro = new JLabel("N\u00FAmero de Registro CNH:");
		lblNmeroDeRegistro.setHorizontalAlignment(SwingConstants.LEFT);
		lblNmeroDeRegistro.setBounds(164, 28, 164, 14);
		panelInserir.add(lblNmeroDeRegistro);
		
		txtNumRegistroCNH = new JTextField();
		txtNumRegistroCNH.setColumns(10);
		txtNumRegistroCNH.setBounds(164, 43, 137, 20);
		panelInserir.add(txtNumRegistroCNH);
		
		JLabel lblCdigoDeRegistro = new JLabel("C\u00F3digo de Registro");
		lblCdigoDeRegistro.setBounds(10, 28, 100, 14);
		panelInserir.add(lblCdigoDeRegistro);
		
		txtNome = new JTextField();
		txtNome.setBounds(10, 89, 294, 20);
		panelInserir.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblCategoriaCnh = new JLabel("Categoria CNH:");
		lblCategoriaCnh.setBounds(330, 28, 86, 14);
		panelInserir.add(lblCategoriaCnh);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(10, 120, 46, 14);
		panelInserir.add(lblCpf);
		
		txtCatcnh = new JTextField();
		txtCatcnh.setText("CatCNH");
		txtCatcnh.setBounds(330, 43, 124, 20);
		panelInserir.add(txtCatcnh);
		txtCatcnh.setColumns(10);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(330, 134, 124, 20);
		panelInserir.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(330, 74, 46, 14);
		panelInserir.add(lblSexo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(330, 89, 124, 20);
		panelInserir.add(comboBox);
		
		txtCpf = new JTextField();
		txtCpf.setBounds(10, 134, 128, 20);
		panelInserir.add(txtCpf);
		txtCpf.setColumns(10);
		
		JPanel panelPesquisar = new JPanel();
		panelPesquisar.setBounds(10, 343, 489, 267);
		panelConteiner.add(panelPesquisar);
		panelPesquisar.setLayout(null);
		panelPesquisar.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Pesquisar Cliente", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 72, 448, 180);
		panelPesquisar.add(scrollPane);
		
		JLabel label_5 = new JLabel("Consultar:");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_5.setBounds(10, 33, 60, 14);
		panelPesquisar.add(label_5);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(80, 31, 176, 20);
		panelPesquisar.add(textField_4);
		
		JButton button_2 = new JButton("Listar");
		button_2.setBounds(371, 30, 97, 23);
		panelPesquisar.add(button_2);
		
		JButton button_3 = new JButton("Pesquisar");
		button_3.setBounds(266, 30, 95, 23);
		panelPesquisar.add(button_3);

	}
}
