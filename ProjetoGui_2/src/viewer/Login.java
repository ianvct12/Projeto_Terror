package viewer;

//import javax.swing.JFrame;
import javax.swing.*;//Porque você vai importar outros componentes, aí com * ele importa tudo.
//A pasta de imagens tem que estar dentro do SRC!!
public class Login extends JFrame{
	private JPanel contentPane = new JPanel();
	private JLabel rotulo1 = new JLabel("AUTENTICAÇÃO DE USUÁRIO");//cria um novo objeto de Label.
	private JLabel rotulo2 = new JLabel("USUÁRIO:");
	private JLabel rotulo3 = new JLabel("SENHA:");
	private JTextField campo1 = new JTextField();
	private JPasswordField campo2 = new JPasswordField();
	private JButton botao = new JButton("ACESSAR");
	
	public Login(){//método construtor 
		super("POO Sys 1.0");//Por meio do super nós passamos uma String com parâmetro para superclasse.
		this.setBounds(100,50,270,200);//(posX, pos Y, largura, altura) serve para alterar as dimensões da janela.
		getContentPane().setLayout(null);//Seta o layout para a gente colocar onde quiser os componentes, ele é livre.
		
		rotulo1.setBounds(40,20,180,20);//Aqui decidimos onde colocarmos o rotulo1 no construtor. O BOUND É EM RELAÇÃO À JANELA E NÃO AO COMPUTADOR!!;
		this.add(rotulo1);//Agora estamos adicionando o componenente gráfico do rotulo1;
		rotulo2.setBounds(20,60,100,20);
		this.add(rotulo2);
		rotulo3.setBounds(20,90,100,20);
		this.add(rotulo3);//Logo são dois passos. Criar fora do método construtor o atributo que você quer inserir. No método construtor você vai colocar o setBound para definir o tamanho e depois o add para adicioná-lo à interface gráfica.
	
		campo1.setBounds(80,60,150,20);
		campo1.setToolTipText("Digite aqui o seu usário!");
		this.add(campo1);
		
		campo2.setBounds(80,90,100,20);
		campo2.setToolTipText("Digite aqui a sua senha!");
		this.add(campo2);
		
		botao.setBounds(80,120,100,20);
		this.add(botao);
	}
}
