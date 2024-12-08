package viewer;//PARA O BOTÃO FUNCIONAR TEM QUE SER DEPOIS DO JLABEL

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Mapa extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int personagem = 0;
	private CavernaDiabolica caverna = new CavernaDiabolica();
	private RedemoinhoMorte redemoinho = new RedemoinhoMorte();
	private IlhaDaMorte ilha = new IlhaDaMorte();
	private TempestadeEterna tempestade = new TempestadeEterna();
	private CovilSerpente serpente = new CovilSerpente();
	private Castelo castelo = new Castelo();
	private Igreja igreja = new Igreja();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mapa frame = new Mapa();
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
	public Mapa() {
		setResizable(false);
		setTitle("Uma aventura assustadora!");
		setBounds(0, 0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(161, 11, 40, 40);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				personagem= 1;
			}
		});
		contentPane.setLayout(null);
		btnNewButton.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/Sonic.gif")));
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(211, 11, 40, 40);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				personagem = 2;
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(Mapa.class.getResource("/Imagens/GhostFace.gif")));
		contentPane.add(btnNewButton_1);
		
		JButton botao1 = new JButton("");
		botao1.setBounds(398, 436, 40, 40);
		botao1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(personagem==1)
					botao1.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/Sonic.gif")));
				else if(personagem==2)
					botao1.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/GhostFace.gif")));
				else if(personagem==3)
					botao1.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/madruga.gif")));
				else if(personagem==4)
					botao1.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/mario.gif")));
				else
					botao1.setIcon(new ImageIcon(Mapa.class.getResource("")));
			}
		});
		contentPane.add(botao1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBounds(261, 11, 40, 40);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				personagem = 0; 
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
		
		JButton botao1_4 = new JButton("");
		botao1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(personagem==1)
					botao1_4.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/Sonic.gif")));
				else if(personagem==2)
					botao1_4.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/GhostFace.gif")));
				else if(personagem==3)
					botao1_4.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/madruga.gif")));
				else if(personagem==4)
					botao1_4.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/mario.gif")));
				else
					botao1_4.setIcon(new ImageIcon(Mapa.class.getResource("")));
			}
		});
		botao1_4.setBounds(1139, 567, 40, 40);
		contentPane.add(botao1_4);
		
		JLabel lblNewLabel_2 = new JLabel("Caverna Diabólica");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("MV Boli", Font.BOLD, 28));
		lblNewLabel_2.setBounds(304, 362, 240, 26);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_5 = new JLabel("Covil da Serpente");
		lblNewLabel_2_5.setForeground(Color.WHITE);
		lblNewLabel_2_5.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_2_5.setBounds(1073, 499, 205, 26);
		contentPane.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_3 = new JLabel("Dominador:");
		lblNewLabel_2_3.setForeground(new Color(255, 204, 102));
		lblNewLabel_2_3.setFont(new Font("Unispace", Font.BOLD, 21));
		lblNewLabel_2_3.setBounds(364, 399, 205, 26);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_2 = new JLabel("Redemoinho da morte");
		lblNewLabel_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_2_2.setBounds(1457, 692, 240, 26);
		contentPane.add(lblNewLabel_2_2);
		
		JButton botao1_3 = new JButton("");
		botao1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(personagem==1)
					botao1_3.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/Sonic.gif")));
				else if(personagem==2)
					botao1_3.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/GhostFace.gif")));
				else if(personagem==3)
					botao1_3.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/madruga.gif")));
				else if(personagem==4)
					botao1_3.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/mario.gif")));
				else
					botao1_3.setIcon(new ImageIcon(Mapa.class.getResource("")));
			}
		});
		botao1_3.setBounds(1548, 758, 40, 40);
		contentPane.add(botao1_3);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("Dominador:");
		lblNewLabel_2_3_1.setForeground(new Color(255, 204, 102));
		lblNewLabel_2_3_1.setFont(new Font("Unispace", Font.BOLD, 21));
		lblNewLabel_2_3_1.setBounds(1510, 721, 205, 26);
		contentPane.add(lblNewLabel_2_3_1);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Igreja Diabólica");
		lblNewLabel_2_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_2_2_1.setBounds(797, 863, 240, 26);
		contentPane.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_2_3_1_1 = new JLabel("Dominador:");
		lblNewLabel_2_3_1_1.setForeground(new Color(255, 204, 102));
		lblNewLabel_2_3_1_1.setFont(new Font("Unispace", Font.BOLD, 21));
		lblNewLabel_2_3_1_1.setBounds(818, 892, 205, 26);
		contentPane.add(lblNewLabel_2_3_1_1);
		
		JButton botao1_2 = new JButton("");
		botao1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(personagem==1)
					botao1_2.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/Sonic.gif")));
				else if(personagem==2)
					botao1_2.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/GhostFace.gif")));
				else if(personagem==3)
					botao1_2.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/madruga.gif")));
				else if(personagem==4)
					botao1_2.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/mario.gif")));
				else
					botao1_2.setIcon(new ImageIcon(Mapa.class.getResource("")));
			}
		});
		botao1_2.setBounds(856, 929, 40, 40);
		contentPane.add(botao1_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Tempestade Eterna");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_2_1.setBounds(962, 46, 205, 26);
		contentPane.add(lblNewLabel_2_1);
		
		JButton botao1_6 = new JButton("");
		botao1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(personagem==1)
					botao1_6.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/Sonic.gif")));
				else if(personagem==2)
					botao1_6.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/GhostFace.gif")));
				else if(personagem==3)
					botao1_6.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/madruga.gif")));
				else if(personagem==4)
					botao1_6.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/mario.gif")));
				else
					botao1_6.setIcon(new ImageIcon(Mapa.class.getResource("")));
			}
		});
		botao1_6.setBounds(1043, 110, 40, 40);
		contentPane.add(botao1_6);
		
		JLabel lblNewLabel_2_3_2 = new JLabel("Dominador:");
		lblNewLabel_2_3_2.setForeground(new Color(255, 204, 102));
		lblNewLabel_2_3_2.setFont(new Font("Unispace", Font.BOLD, 21));
		lblNewLabel_2_3_2.setBounds(1007, 75, 205, 26);
		contentPane.add(lblNewLabel_2_3_2);
		
		JLabel lblNewLabel_2_4 = new JLabel("Castelo de Beelzebu");
		lblNewLabel_2_4.setForeground(Color.WHITE);
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_2_4.setBounds(211, 761, 240, 26);
		contentPane.add(lblNewLabel_2_4);
		
		JButton botao1_1 = new JButton("");
		botao1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(personagem==1)
					botao1_1.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/Sonic.gif")));
				else if(personagem==2)
					botao1_1.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/GhostFace.gif")));
				else if(personagem==3)
					botao1_1.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/madruga.gif")));
				else if(personagem==4)
					botao1_1.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/mario.gif")));
				else
					botao1_1.setIcon(new ImageIcon(Mapa.class.getResource("")));
			}
		});
		botao1_1.setBounds(293, 829, 40, 40);
		contentPane.add(botao1_1);
		
		JLabel lblNewLabel_2_3_1_1_1 = new JLabel("Dominador:");
		lblNewLabel_2_3_1_1_1.setForeground(new Color(255, 204, 102));
		lblNewLabel_2_3_1_1_1.setFont(new Font("Unispace", Font.BOLD, 21));
		lblNewLabel_2_3_1_1_1.setBounds(258, 792, 205, 26);
		contentPane.add(lblNewLabel_2_3_1_1_1);
		
		JLabel lblNewLabel_2_3_3 = new JLabel("Dominador:");
		lblNewLabel_2_3_3.setForeground(new Color(255, 204, 102));
		lblNewLabel_2_3_3.setFont(new Font("Unispace", Font.BOLD, 21));
		lblNewLabel_2_3_3.setBounds(1103, 530, 205, 26);
		contentPane.add(lblNewLabel_2_3_3);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Ilha da morte");
		lblNewLabel_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_2_1_1_1.setBounds(1510, 399, 205, 26);
		contentPane.add(lblNewLabel_2_1_1_1);
		
		JButton botao1_5_1 = new JButton("");
		botao1_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(personagem==1)
					botao1_5_1.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/Sonic.gif")));
				else if(personagem==2)
					botao1_5_1.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/GhostFace.gif")));
				else if(personagem==3)
					botao1_5_1.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/madruga.gif")));
				else if(personagem==4)
					botao1_5_1.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/mario.gif")));
				else
					botao1_5_1.setIcon(new ImageIcon(Mapa.class.getResource("")));
			}
		});
		botao1_5_1.setBounds(1560, 461, 40, 40);
		contentPane.add(botao1_5_1);
		
		JLabel lblNewLabel_2_3_2_1 = new JLabel("Dominador:");
		lblNewLabel_2_3_2_1.setForeground(new Color(255, 204, 102));
		lblNewLabel_2_3_2_1.setFont(new Font("Unispace", Font.BOLD, 21));
		lblNewLabel_2_3_2_1.setBounds(1524, 425, 205, 26);
		contentPane.add(lblNewLabel_2_3_2_1);
		
		JButton btnNewButton_3 = new JButton("Teleportar!");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tempestade.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(1016, 162, 96, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Teleportar!");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caverna.setVisible(true);
			}
		});
		btnNewButton_4.setBounds(374, 487, 96, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Teleportar!");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				castelo.setVisible(true);
			}
		});
		btnNewButton_5.setBounds(267, 881, 96, 23);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Teleportar!");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				igreja.setVisible(true);
			}
		});
		btnNewButton_6.setBounds(828, 980, 96, 23);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Teleportar!");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				redemoinho.setVisible(true);
			}
		});
		btnNewButton_7.setBounds(1522, 809, 96, 23);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("Teleportar!");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				serpente.setVisible(true);
			}
		});
		btnNewButton_8.setBounds(1114, 620, 96, 23);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("Teleportar!");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ilha.setVisible(true);
			}
		});
		btnNewButton_9.setBounds(1535, 516, 96, 23);
		contentPane.add(btnNewButton_9);
		
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 1947, 1080);
		lblNewLabel.setIcon(new ImageIcon(Mapa.class.getResource("/Imagens/mapa.gif")));
		contentPane.add(lblNewLabel);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
