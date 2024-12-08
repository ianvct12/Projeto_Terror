package viewer;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pergunta extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pergunta frame = new Pergunta();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 * @param opcao4 
	 */
	public Pergunta(String enunciado, String opcao1, String opcao2, String opcao3, String opcao4, char gabarito) {
		setTitle("Pergunta");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 250, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea(enunciado);
		textArea.setFont(new Font("Arial", Font.BOLD, 14));
		textArea.setLineWrap(true);
		textArea.setBounds(10, 11, 414, 88);
		contentPane.add(textArea);
		
		JRadioButton rdOpcao1 = new JRadioButton(opcao1);
		rdOpcao1.setBounds(10, 118, 414, 23);
		contentPane.add(rdOpcao1);
		
		JRadioButton rdOpcao2 = new JRadioButton(opcao2);
		rdOpcao2.setBounds(10, 144, 414, 23);
		contentPane.add(rdOpcao2);
		
		JRadioButton rdOpcao3 = new JRadioButton(opcao3);
		rdOpcao3.setBounds(10, 170, 414, 23);
		contentPane.add(rdOpcao3);
		
		JRadioButton rdOpcao4 = new JRadioButton(opcao4);
		rdOpcao4.setBounds(10, 196, 414, 23);
		contentPane.add(rdOpcao4);
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(rdOpcao1);
		grupo.add(rdOpcao2);
		grupo.add(rdOpcao3);
		grupo.add(rdOpcao4);
		
		JButton btnNewButton = new JButton("CONFERIR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdOpcao1.isSelected() == true && gabarito == 'A')
					JOptionPane.showMessageDialog(null, "PARABÉNS!!! RESPOSTA CORRETA!!!");
				else if(rdOpcao2.isSelected() == true && gabarito == 'B')
					JOptionPane.showMessageDialog(null, "PARABÉNS!!! RESPOSTA CORRETA!!!");
				else if(rdOpcao3.isSelected() == true && gabarito == 'C')
					JOptionPane.showMessageDialog(null, "PARABÉNS!!! RESPOSTA CORRETA!!!");
				else if(rdOpcao4.isSelected() == true && gabarito == 'D')
					JOptionPane.showMessageDialog(null, "PARABÉNS!!! RESPOSTA CORRETA!!!");
				else
					JOptionPane.showMessageDialog(null, "PUXA VIDA!!! RESPOSTA ERRADA!!!");
			}
		});
		btnNewButton.setBounds(10, 227, 105, 23);
		contentPane.add(btnNewButton);
	}
}
