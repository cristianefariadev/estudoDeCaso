package br.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class ClientesView extends JInternalFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtRegistro;
	private JTextField txtRg;
	private JTextField txtNumRegistroCNH;
	private JTextField txtNome;
	private JTextField txtTelefone;
	private JTextField txtCpf;
	private JTextField txtEndereco;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtEmail;

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
		setTitle("Cadastro Cliente");
		setBounds(100, 100, 521, 399);
		getContentPane().setLayout(null);
		
		JPanel panelConteiner = new JPanel();
		panelConteiner.setBounds(0, 0, 507, 365);
		getContentPane().add(panelConteiner);
		panelConteiner.setLayout(null);
		
		JPanel panelInserir = new JPanel();
		panelInserir.setBounds(10, 44, 489, 310);
		panelConteiner.add(panelInserir);
		panelInserir.setLayout(null);
		panelInserir.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Inserir Cliente", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JLabel lblNomeCompleto = new JLabel("Nome Completo:");
		lblNomeCompleto.setBounds(10, 74, 94, 14);
		panelInserir.add(lblNomeCompleto);
		
		JLabel label_1 = new JLabel("Telefone:");
		label_1.setBounds(177, 120, 48, 14);
		panelInserir.add(label_1);
		
		txtRegistro = new JTextField();
		txtRegistro.setEnabled(false);
		txtRegistro.setColumns(10);
		txtRegistro.setBounds(10, 43, 128, 20);
		panelInserir.add(txtRegistro);
		
		JButton button = new JButton("Salvar");
		button.setBounds(378, 279, 73, 20);
		panelInserir.add(button);
		
		JButton button_1 = new JButton("Limpar");
		button_1.setBounds(301, 279, 75, 20);
		panelInserir.add(button_1);
		
		JLabel label_3 = new JLabel("RG:");
		label_3.setBounds(10, 120, 46, 14);
		panelInserir.add(label_3);
		
		txtRg = new JTextField();
		txtRg.setColumns(10);
		txtRg.setBounds(10, 134, 137, 20);
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
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(330, 74, 46, 14);
		panelInserir.add(lblCpf);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(177, 134, 124, 20);
		panelInserir.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(330, 28, 46, 14);
		panelInserir.add(lblSexo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(330, 43, 124, 20);
		panelInserir.add(comboBox);
		
		txtCpf = new JTextField();
		txtCpf.setBounds(330, 88, 128, 20);
		panelInserir.add(txtCpf);
		txtCpf.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setBounds(10, 208, 60, 14);
		panelInserir.add(lblEndereo);
		
		txtEndereco = new JTextField();
		txtEndereco.setBounds(10, 225, 294, 20);
		panelInserir.add(txtEndereco);
		txtEndereco.setColumns(10);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setBounds(10, 165, 46, 14);
		panelInserir.add(lblCep);
		
		textField = new JTextField();
		textField.setBounds(10, 177, 100, 20);
		panelInserir.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(164, 177, 86, 20);
		panelInserir.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(330, 177, 124, 20);
		panelInserir.add(comboBox_2);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(164, 165, 46, 14);
		panelInserir.add(lblEstado);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(330, 165, 46, 14);
		panelInserir.add(lblCidade);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setBounds(330, 208, 46, 14);
		panelInserir.add(lblBairro);
		
		textField_1 = new JTextField();
		textField_1.setBounds(330, 225, 124, 20);
		panelInserir.add(textField_1);
		textField_1.setColumns(10);
		
		JButton button_5 = new JButton("");
		button_5.setIcon(new ImageIcon(ClientesView.class.getResource("/image/icons/zoom.png")));
		button_5.setBounds(113, 174, 25, 23);
		panelInserir.add(button_5);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setBounds(330, 120, 46, 14);
		panelInserir.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setText("\r\n");
		txtEmail.setBounds(330, 134, 124, 20);
		panelInserir.add(txtEmail);
		txtEmail.setColumns(10);
		
		JButton btnPesquisarCliente = new JButton("Pesquisar Cliente");
		btnPesquisarCliente.setBounds(370, 10, 129, 23);
		panelConteiner.add(btnPesquisarCliente);

	}
}
