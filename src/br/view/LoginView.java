package br.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPasswordField;

public class LoginView extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField pwdSenha;
	private static LoginView frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new LoginView();
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
					frame.setLocation((tela.width - frame.getSize().width) /2,(tela.height - frame.getSize().height/2));
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
	public LoginView() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(LoginView.class.getResource("/image/icons/application_key.png")));
		setTitle("Tela de Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 465, 366);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelLogin = new JPanel();
		panelLogin.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelLogin.setBounds(0, 0, 449, 328);
		contentPane.add(panelLogin);
		panelLogin.setLayout(null);
		
		JLabel lblUs = new JLabel("Usu\u00E1rio:");
		lblUs.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUs.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblUs.setBounds(198, 175, 45, 14);
		panelLogin.add(lblUs);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(253, 173, 112, 20);
		panelLogin.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSenha.setBounds(198, 203, 45, 14);
		panelLogin.add(lblSenha);
		
		JButton btnLogar = new JButton("Logar");
		btnLogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String senha = String.valueOf(pwdSenha.getPassword());
				JOptionPane.showMessageDialog(null, txtUsuario);
				if (txtUsuario.getText().equals("admin") && senha.equals("admin")){
					frame.setVisible(false);
					//GuiMenuPrincipal.abrir();
				}else{
					JOptionPane.showMessageDialog(null, "Login ou senha incorretas!");
				}
				
			}
		});
		btnLogar.setBounds(300, 242, 69, 23);
		panelLogin.add(btnLogar);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(LoginView.class.getResource("/image/logo.png")));
		lblLogo.setBounds(92, 24, 264, 85);
		panelLogin.add(lblLogo);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(LoginView.class.getResource("/image/login.png")));
		label.setBounds(23, 147, 155, 125);
		panelLogin.add(label);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnCancelar.setBounds(198, 242, 92, 23);
		panelLogin.add(btnCancelar);
		
		pwdSenha = new JPasswordField();
		pwdSenha.setBounds(253, 204, 112, 20);
		panelLogin.add(pwdSenha);
	}
	
	public void definirEventos(){
		
	}
}
