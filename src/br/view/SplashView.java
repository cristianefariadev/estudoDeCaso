package br.view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.Timer;
import javax.swing.border.EtchedBorder;



public class SplashView extends JWindow {

	private static final long serialVersionUID = 1L;
	private Container container;
	private JPanel header;
	private JPanel footer;
	private ImageIcon imagem;
	private JLabel logo;
	private static JProgressBar progressBar;
	private static Timer timer;
	private static int DURATION = 25, percentMin = 1, percentMax = 100;
	private Frame principal;
	
	ActionListener actionListener = new ActionListener() {
		//Principal principal = new Principal();

		@Override
		public void actionPerformed(ActionEvent e) {

			progressBar.setValue(percentMin);
			if (percentMax == percentMin) {
				timer.stop();
				SplashView.this.setVisible(false);
				dispose();
				principal.setVisible(true);
				dispose();
				
			}
			percentMin++;
		}
	};

	// *************************
	// CONSTRUTOR
	public SplashView() {
		createGUI();
		pack(); //ajusta o tamanho
		setLocationRelativeTo(null);
		setVisible(true);
		startProgressBar();
		this.principal = new Frame();

	}

	// cria�ao do tempo de dura�ao
	public void startProgressBar() {
		SplashView.timer = new Timer(SplashView.DURATION, actionListener);
		SplashView.timer.start();
	}
// cria�ao da tela
	public void createGUI() {
		this.container = getContentPane();
		this.header = new JPanel();
		this.footer = new JPanel();
		this.imagem = new ImageIcon(getClass().getResource("/image/splashView2.png"));
		this.logo = new JLabel(imagem);
		this.progressBar = new JProgressBar();

		this.header.setBorder(new EtchedBorder());
		this.header.add(logo, BorderLayout.CENTER);

		this.footer.setBorder(new EtchedBorder());
		this.footer.setLayout(new BoxLayout(footer, BoxLayout.PAGE_AXIS));
		this.footer.add(progressBar);

		this.container.setLayout(new BorderLayout());
		this.container.add(header, new BorderLayout().CENTER);
		this.container.add(footer, new BorderLayout().SOUTH);
	}

}
