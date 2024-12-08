package viewer;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.ControlePergunta;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class CavernaDiabolica extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int personagem=0;
	private ControlePergunta controlePergunta = new ControlePergunta();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CavernaDiabolica frame = new CavernaDiabolica();
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
	public CavernaDiabolica() {
		setBounds(0, 0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton p1 = new JButton("Pergunta 1");
		p1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.Pergunta p = controlePergunta.consultarPergunta(26);
				
				String enunciado = p.getEnunciado();
				String opcao1 = p.getOpcaoa();
				String opcao2 = p.getOpcaob();
				String opcao3 = p.getOpcaoc();
				String opcao4 = p.getOpcaod();
				char gabarito = p.getGabarito();
				
				Pergunta pergunta = new Pergunta(enunciado, opcao1, opcao2, opcao3, opcao4, gabarito);
				
				pergunta.setVisible(true);
			}
		});
		p1.setBounds(78, 934, 107, 23);
		getContentPane().add(p1);
		
		JButton p3 = new JButton("Pergunta 3");
		p3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.Pergunta p = controlePergunta.consultarPergunta(28);
				
				String enunciado = p.getEnunciado();
				String opcao1 = p.getOpcaoa();
				String opcao2 = p.getOpcaob();
				String opcao3 = p.getOpcaoc();
				String opcao4 = p.getOpcaod();
				char gabarito = p.getGabarito();
				
				Pergunta pergunta = new Pergunta(enunciado, opcao1, opcao2, opcao3, opcao4, gabarito);
				
				pergunta.setVisible(true);
			}
		});
		p3.setBounds(332, 934, 107, 23);
		getContentPane().add(p3);
		
		JButton p5 = new JButton("Pergunta 5");
		p5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.Pergunta p = controlePergunta.consultarPergunta(30);
				
				String enunciado = p.getEnunciado();
				String opcao1 = p.getOpcaoa();
				String opcao2 = p.getOpcaob();
				String opcao3 = p.getOpcaoc();
				String opcao4 = p.getOpcaod();
				char gabarito = p.getGabarito();
				
				Pergunta pergunta = new Pergunta(enunciado, opcao1, opcao2, opcao3, opcao4, gabarito);
				
				pergunta.setVisible(true);
			}
		});
		p5.setBounds(582, 934, 107, 23);
		getContentPane().add(p5);
		
		JButton p4 = new JButton("Pergunta 4");
		p4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.Pergunta p = controlePergunta.consultarPergunta(29);
				
				String enunciado = p.getEnunciado();
				String opcao1 = p.getOpcaoa();
				String opcao2 = p.getOpcaob();
				String opcao3 = p.getOpcaoc();
				String opcao4 = p.getOpcaod();
				char gabarito = p.getGabarito();
				
				Pergunta pergunta = new Pergunta(enunciado, opcao1, opcao2, opcao3, opcao4, gabarito);
				
				pergunta.setVisible(true);
			}
		});
		p4.setBounds(462, 934, 107, 23);
		getContentPane().add(p4);
		
		JButton p2 = new JButton("Pergunta 2");
		p2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.Pergunta p = controlePergunta.consultarPergunta(27);
				
				String enunciado = p.getEnunciado();
				String opcao1 = p.getOpcaoa();
				String opcao2 = p.getOpcaob();
				String opcao3 = p.getOpcaoc();
				String opcao4 = p.getOpcaod();
				char gabarito = p.getGabarito();
				
				Pergunta pergunta = new Pergunta(enunciado, opcao1, opcao2, opcao3, opcao4, gabarito);
				
				pergunta.setVisible(true);
			}
		});
		p2.setBounds(202, 934, 107, 23);
		getContentPane().add(p2);
		
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(161, 11, 40, 40);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				personagem= 1;//Toda vez que o usuário clicar no sonic, vira o personagem 1.
			}
		});
		contentPane.setLayout(null);
		btnNewButton.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/Sonic.gif")));
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(211, 11, 40, 40);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				personagem = 2;//Toda vez que o usuário clicar no sonic, vira o personagem 2.
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/GhostFace.gif")));
		contentPane.add(btnNewButton_1);
		
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBounds(261, 11, 40, 40);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				personagem = 0; //Toda vez que o usuário clicar no vazio, volta a ser personagem 0.
			}
		});
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				personagem=3;
			}
		});
		btnNewButton_1_1.setBounds(111, 11, 40, 40);
		btnNewButton_1_1.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/madruga.gif")));
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				personagem=4;
			}
		});
		btnNewButton_1_1_1.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/mario.gif")));
		btnNewButton_1_1_1.setBounds(61, 11, 40, 40);
		contentPane.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(personagem==1)
					btnNewButton_3.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/Sonic.gif")));
				else if(personagem==2)
					btnNewButton_3.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/GhostFace.gif")));
				else if(personagem==3)
					btnNewButton_3.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/madruga.gif")));
				else if(personagem==4)
					btnNewButton_3.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/mario.gif")));
				else
					btnNewButton_3.setIcon(new ImageIcon(Mapa.class.getResource("")));
			}
		});
		btnNewButton_3.setBounds(825, 765, 40, 40);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(personagem==1)
					btnNewButton_4.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/Sonic.gif")));
				else if(personagem==2)
					btnNewButton_4.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/GhostFace.gif")));
				else if(personagem==3)
					btnNewButton_4.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/madruga.gif")));
				else if(personagem==4)
					btnNewButton_4.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/mario.gif")));
				else
					btnNewButton_4.setIcon(new ImageIcon(Mapa.class.getResource("")));
			}
			
		});
		btnNewButton_4.setBounds(875, 765, 40, 40);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(personagem==1)
					btnNewButton_5.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/Sonic.gif")));
				else if(personagem==2)
					btnNewButton_5.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/GhostFace.gif")));
				else if(personagem==3)
					btnNewButton_5.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/madruga.gif")));
				else if(personagem==4)
					btnNewButton_5.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/mario.gif")));
				else
					btnNewButton_5.setIcon(new ImageIcon(Mapa.class.getResource("")));
			}
		});
		btnNewButton_5.setBounds(925, 765, 40, 40);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(personagem==1)
					btnNewButton_6.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/Sonic.gif")));
				else if(personagem==2)
					btnNewButton_6.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/GhostFace.gif")));
				else if(personagem==3)
					btnNewButton_6.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/madruga.gif")));
				else if(personagem==4)
					btnNewButton_6.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/mario.gif")));
				else
					btnNewButton_6.setIcon(new ImageIcon(Mapa.class.getResource("")));
			}
		});
		btnNewButton_6.setBounds(975, 765, 40, 40);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(personagem==1)
					btnNewButton_7.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/Sonic.gif")));
				else if(personagem==2)
					btnNewButton_7.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/GhostFace.gif")));
				else if(personagem==3)
					btnNewButton_7.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/madruga.gif")));
				else if(personagem==4)
					btnNewButton_7.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/mario.gif")));
				else
					btnNewButton_7.setIcon(new ImageIcon(Mapa.class.getResource("")));
			}
		});
		btnNewButton_7.setBounds(1025, 765, 40, 40);
		contentPane.add(btnNewButton_7);
		
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(CavernaDiabolica.class.getResource("/Imagens/caverna.gif")));
		lblNewLabel.setBounds(0, 0, 1920, 1080);
		contentPane.add(lblNewLabel);
		
		
		
	}

}
