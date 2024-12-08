package viewer;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.ControlePergunta;

public class TempestadeEterna extends JFrame {

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
					TempestadeEterna frame = new TempestadeEterna();
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
	public TempestadeEterna() {
		setBounds(0, 0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				personagem=4;
			}
		});
		
		JButton p1 = new JButton("Pergunta 1");
		p1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.Pergunta p = controlePergunta.consultarPergunta(1);
				
				String enunciado = p.getEnunciado();
				String opcao1 = p.getOpcaoa();
				String opcao2 = p.getOpcaob();
				String opcao3 = p.getOpcaoc();
				String opcao4 = p.getOpcaod();
				char gabarito = p.getGabarito();
				
				Pergunta pergunta = new Pergunta(enunciado, opcao1, opcao2, opcao3, opcao4, gabarito);
				
				pergunta.setVisible(true);			}
		});
		p1.setBounds(46, 888, 107, 23);
		contentPane.add(p1);
		
		JButton p2 = new JButton("Pergunta 2");
		p2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.Pergunta p = controlePergunta.consultarPergunta(2);
				
				String enunciado = p.getEnunciado();
				String opcao1 = p.getOpcaoa();
				String opcao2 = p.getOpcaob();
				String opcao3 = p.getOpcaoc();
				String opcao4 = p.getOpcaod();
				char gabarito = p.getGabarito();
				
				Pergunta pergunta = new Pergunta(enunciado, opcao1, opcao2, opcao3, opcao4, gabarito);
				
				pergunta.setVisible(true);			}
		});
		p2.setBounds(170, 888, 107, 23);
		contentPane.add(p2);
		
		JButton p3 = new JButton("Pergunta 3");
		p3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.Pergunta p = controlePergunta.consultarPergunta(3);
				
				String enunciado = p.getEnunciado();
				String opcao1 = p.getOpcaoa();
				String opcao2 = p.getOpcaob();
				String opcao3 = p.getOpcaoc();
				String opcao4 = p.getOpcaod();
				char gabarito = p.getGabarito();
				
				Pergunta pergunta = new Pergunta(enunciado, opcao1, opcao2, opcao3, opcao4, gabarito);
				
				pergunta.setVisible(true);			}
		});
		p3.setBounds(300, 888, 107, 23);
		contentPane.add(p3);
		
		JButton p4 = new JButton("Pergunta 4");
		p4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.Pergunta p = controlePergunta.consultarPergunta(4);
				
				String enunciado = p.getEnunciado();
				String opcao1 = p.getOpcaoa();
				String opcao2 = p.getOpcaob();
				String opcao3 = p.getOpcaoc();
				String opcao4 = p.getOpcaod();
				char gabarito = p.getGabarito();
				
				Pergunta pergunta = new Pergunta(enunciado, opcao1, opcao2, opcao3, opcao4, gabarito);
				
				pergunta.setVisible(true);			}
		});
		p4.setBounds(430, 888, 107, 23);
		contentPane.add(p4);
		
		JButton p5 = new JButton("Pergunta 5");
		p5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.Pergunta p = controlePergunta.consultarPergunta(5);
				
				String enunciado = p.getEnunciado();
				String opcao1 = p.getOpcaoa();
				String opcao2 = p.getOpcaob();
				String opcao3 = p.getOpcaoc();
				String opcao4 = p.getOpcaod();
				char gabarito = p.getGabarito();
				
				Pergunta pergunta = new Pergunta(enunciado, opcao1, opcao2, opcao3, opcao4, gabarito);
				
				pergunta.setVisible(true);			}
		});
		p5.setBounds(550, 888, 107, 23);
		contentPane.add(p5);
		
		btnNewButton.setIcon(new ImageIcon(TempestadeEterna.class.getResource("/Imagens/mario.gif")));
		btnNewButton.setBounds(61, 11, 40, 40);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				personagem=3;
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(TempestadeEterna.class.getResource("/Imagens/madruga.gif")));
		btnNewButton_1.setBounds(111, 11, 40, 40);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				personagem=1;
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(TempestadeEterna.class.getResource("/Imagens/Sonic.gif")));
		btnNewButton_2.setBounds(161, 11, 40, 40);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				personagem=2;
			}
		});
		btnNewButton_3.setIcon(new ImageIcon(TempestadeEterna.class.getResource("/Imagens/GhostFace.gif")));
		btnNewButton_3.setBounds(211, 11, 40, 40);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				personagem=0;
			}
		});
		btnNewButton_4.setBounds(261, 11, 40, 40);
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
		btnNewButton_5.setBounds(871, 883, 40, 40);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_5_1 = new JButton("");
		btnNewButton_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(personagem==1)
					btnNewButton_5_1.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/Sonic.gif")));
				else if(personagem==2)
					btnNewButton_5_1.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/GhostFace.gif")));
				else if(personagem==3)
					btnNewButton_5_1.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/madruga.gif")));
				else if(personagem==4)
					btnNewButton_5_1.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/mario.gif")));
				else
					btnNewButton_5_1.setIcon(new ImageIcon(Mapa.class.getResource("")));
			}
		});
		btnNewButton_5_1.setBounds(921, 883, 40, 40);
		contentPane.add(btnNewButton_5_1);
		
		JButton btnNewButton_5_2 = new JButton("");
		btnNewButton_5_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(personagem==1)
					btnNewButton_5_2.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/Sonic.gif")));
				else if(personagem==2)
					btnNewButton_5_2.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/GhostFace.gif")));
				else if(personagem==3)
					btnNewButton_5_2.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/madruga.gif")));
				else if(personagem==4)
					btnNewButton_5_2.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/mario.gif")));
				else
					btnNewButton_5_2.setIcon(new ImageIcon(Mapa.class.getResource("")));
			}
		});
		btnNewButton_5_2.setBounds(971, 883, 40, 40);
		contentPane.add(btnNewButton_5_2);
		
		JButton btnNewButton_5_3 = new JButton("");
		btnNewButton_5_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(personagem==1)
					btnNewButton_5_3.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/Sonic.gif")));
				else if(personagem==2)
					btnNewButton_5_3.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/GhostFace.gif")));
				else if(personagem==3)
					btnNewButton_5_3.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/madruga.gif")));
				else if(personagem==4)
					btnNewButton_5_3.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/mario.gif")));
				else
					btnNewButton_5_3.setIcon(new ImageIcon(Mapa.class.getResource("")));
			}
		});
		btnNewButton_5_3.setBounds(1021, 883, 40, 40);
		contentPane.add(btnNewButton_5_3);
		
		JButton btnNewButton_5_4 = new JButton("");
		btnNewButton_5_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(personagem==1)
					btnNewButton_5_4.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/Sonic.gif")));
				else if(personagem==2)
					btnNewButton_5_4.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/GhostFace.gif")));
				else if(personagem==3)
					btnNewButton_5_4.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/madruga.gif")));
				else if(personagem==4)
					btnNewButton_5_4.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/mario.gif")));
				else
					btnNewButton_5_4.setIcon(new ImageIcon(Mapa.class.getResource("")));
			}
		});
		btnNewButton_5_4.setBounds(1071, 883, 40, 40);
		contentPane.add(btnNewButton_5_4);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TempestadeEterna.class.getResource("/Imagens/martrovao.gif")));
		lblNewLabel.setBounds(0, 0, 1920, 1080);
		contentPane.add(lblNewLabel);
	}

}
