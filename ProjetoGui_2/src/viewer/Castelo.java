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

public class Castelo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int personagem = 0;
	private ControlePergunta controlePergunta = new ControlePergunta();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Castelo frame = new Castelo();
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
	public Castelo() {
		setBounds(0, 0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton p1 = new JButton("Pergunta 1");
		p1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.Pergunta p = controlePergunta.consultarPergunta(31);
				
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
		p1.setBounds(78, 909, 107, 23);
		getContentPane().add(p1);
		
		JButton p3 = new JButton("Pergunta 3");
		p3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.Pergunta p = controlePergunta.consultarPergunta(33);
				
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
		p3.setBounds(332, 909, 107, 23);
		getContentPane().add(p3);
		
		JButton p5 = new JButton("Pergunta 5");
		p5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.Pergunta p = controlePergunta.consultarPergunta(35);
				
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
		p5.setBounds(582, 909, 107, 23);
		getContentPane().add(p5);
		
		JButton p4 = new JButton("Pergunta 4");
		p4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.Pergunta p = controlePergunta.consultarPergunta(34);
				
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
		p4.setBounds(462, 909, 107, 23);
		getContentPane().add(p4);
		
		JButton p2 = new JButton("Pergunta 2");
		p2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.Pergunta p = controlePergunta.consultarPergunta(32);
				
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
		p2.setBounds(202, 909, 107, 23);
		getContentPane().add(p2);

		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(personagem==1)
					btnNewButton.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/Sonic.gif")));
				else if(personagem==2)
					btnNewButton.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/GhostFace.gif")));
				else if(personagem==3)
					btnNewButton.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/madruga.gif")));
				else if(personagem==4)
					btnNewButton.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/mario.gif")));
				else
					btnNewButton.setIcon(new ImageIcon(Mapa.class.getResource("")));
			}
		});
		btnNewButton.setBounds(1028, 898, 40, 40);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(personagem==1)
					btnNewButton_1.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/Sonic.gif")));
				else if(personagem==2)
					btnNewButton_1.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/GhostFace.gif")));
				else if(personagem==3)
					btnNewButton_1.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/madruga.gif")));
				else if(personagem==4)
					btnNewButton_1.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/mario.gif")));
				else
					btnNewButton_1.setIcon(new ImageIcon(Mapa.class.getResource("")));
			}
		});
		btnNewButton_1.setBounds(828, 898, 40, 40);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(personagem==1)
					btnNewButton_2.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/Sonic.gif")));
				else if(personagem==2)
					btnNewButton_2.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/GhostFace.gif")));
				else if(personagem==3)
					btnNewButton_2.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/madruga.gif")));
				else if(personagem==4)
					btnNewButton_2.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/mario.gif")));
				else
					btnNewButton_2.setIcon(new ImageIcon(Mapa.class.getResource("")));
			}
		});
		btnNewButton_2.setBounds(878, 898, 40, 40);
		getContentPane().add(btnNewButton_2);
		
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
		btnNewButton_3.setBounds(928, 898, 40, 40);
		getContentPane().add(btnNewButton_3);
		
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
		btnNewButton_4.setBounds(978, 898, 40, 40);
		getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				personagem=4;
			}
		});
		btnNewButton_5.setIcon(new ImageIcon(RedemoinhoMorte.class.getResource("/Imagens/mario.gif")));
		btnNewButton_5.setBounds(61, 11, 40, 40);
		getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_5_1 = new JButton("");
		btnNewButton_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				personagem=3;
			}
		});
		btnNewButton_5_1.setIcon(new ImageIcon(RedemoinhoMorte.class.getResource("/Imagens/madruga.gif")));
		btnNewButton_5_1.setBounds(111, 11, 40, 40);
		getContentPane().add(btnNewButton_5_1);
		
		JButton btnNewButton_5_2 = new JButton("");
		btnNewButton_5_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				personagem=1;
			}
		});
		btnNewButton_5_2.setIcon(new ImageIcon(RedemoinhoMorte.class.getResource("/Imagens/Sonic.gif")));
		btnNewButton_5_2.setBounds(161, 11, 40, 40);
		getContentPane().add(btnNewButton_5_2);
		
		JButton btnNewButton_5_3 = new JButton("");
		btnNewButton_5_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				personagem=2;
			}
		});
		btnNewButton_5_3.setIcon(new ImageIcon(RedemoinhoMorte.class.getResource("/Imagens/GhostFace.gif")));
		btnNewButton_5_3.setBounds(211, 11, 40, 40);
		getContentPane().add(btnNewButton_5_3);
		
		JButton btnNewButton_5_4 = new JButton("");
		btnNewButton_5_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				personagem=0;
			}
		});
		btnNewButton_5_4.setBounds(261, 11, 40, 40);
		getContentPane().add(btnNewButton_5_4);
		
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Castelo.class.getResource("/Imagens/castelo.gif")));
		lblNewLabel.setBounds(0, 0, 1920, 1080);
		contentPane.add(lblNewLabel);
	}

}
