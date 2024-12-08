package viewer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextArea;

public class Instrucoes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtOJogadorRecebe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Instrucoes frame = new Instrucoes();
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
	public Instrucoes() {
		setBounds(0, 0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtOJogadorRecebe = new JTextField();
		txtOJogadorRecebe.setForeground(new Color(255, 255, 255));
		txtOJogadorRecebe.setBackground(new Color(0, 0, 0));
		txtOJogadorRecebe.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 11));
		txtOJogadorRecebe.setHorizontalAlignment(SwingConstants.CENTER);
		txtOJogadorRecebe.setText("O jogador recebe uma pergunta para disputar uma das casas no mundo escolhido por ele. Se acertar a pergunta, uma das casas será preenchida com o ícone do jogador. Se errar nada acontece e é a vez do próximo jogador. O mundo é conquistado caso o jogador acerte 3 das 5 perguntas do mundo. Ganha quem tiver mais mundos conquistados.");
		txtOJogadorRecebe.setBounds(42, 403, 1832, 159);
		contentPane.add(txtOJogadorRecebe);
		txtOJogadorRecebe.setColumns(50);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Instrucoes.class.getResource("/Imagens/menujogo.gif")));
		lblNewLabel.setBounds(0, 0, 1920, 1080);
		contentPane.add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(306, 619, 5, 22);
		contentPane.add(textArea);
	}
}
