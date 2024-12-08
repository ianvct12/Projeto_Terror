package dao;

import java.sql.*;

public class Inicializacao {
	private static final String URL1 = "jdbc:mysql://localhost"; /*conecta ao banco de dados mysql*/
	private static final String URL2 = "jdbc:mysql://localhost/terror";

	public void criarBanco() {
		String sql = "CREATE DATABASE terror";
		
		try {
			Connection conexao = DriverManager.getConnection(URL1, "root", "");
			PreparedStatement operacao = conexao.prepareStatement(sql); //transforma uma string em operação sql
			operacao.execute();
			
			System.out.println("Banco de Dados criado com sucesso!");
			conexao.close();
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void criarTabela() {
		String sql = "CREATE TABLE pergunta(id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, enunciado VARCHAR(300), opcaoa VARCHAR(200), opcaob VARCHAR(200), opcaoc VARCHAR(200), opcaod VARCHAR(200), gabarito CHAR(1))";
			
		try {
			Connection  conexao = DriverManager.getConnection(URL2,"root","");
			PreparedStatement operacao = conexao.prepareStatement(sql);//vai associar o sql ao banco de dados
			operacao.execute();//agora ele vai executar o sql naquela conexão ali em cima. O driverManager é para criar a conexão, e essa linha é para executar a operação.
			System.out.println("Tabela criada com sucesso!");
			conexao.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void inserir() {
		String sql = "INSERT INTO pergunta(enunciado, opcaoa, opcaob, opcaoc, opcaod, gabarito) VALUES ('Qual é o nome do vilão principal da franquia de filmes Sexta-Feira 13?', 'Freddy Krueger', 'Jason Voorhees', 'Michael Myers', 'Chucky', 'B'), ('Em qual filme aparece o boneco assassino Chucky?', 'Pânico', 'Brinquedo Assassino', 'It: A Coisa', 'O Exorcista', 'B'), ('Qual é a principal característica de Freddy Krueger?', 'Mãos com lâminas', 'Máscara de hóquei', 'Boneca maldita', 'Ser um palhaço', 'A'), ('Quem é o assassino de Halloween?', 'Freddy Krueger', 'Jason Voorhees', 'Michael Myers', 'Annabelle', 'C'), ('Qual é o objeto amaldiçoado do filme Annabelle?', 'Boneca', 'Espelho', 'Livro', 'Amuleto', 'A'), ('Como é chamado o demônio que possui Regan no filme O Exorcista?', 'Beelzebub', 'Pazuzu', 'Azazel', 'Valak', 'B'), ('Qual é a principal habilidade de Pennywise em It: A Coisa?', 'Transformar-se em medos', 'Hipnotizar', 'Criar ilusões', 'Invocar mortos', 'A'), ('De onde vem o espírito no filme O Chamado?', 'Poço', 'Espelho', 'Árvore', 'Caverna', 'A'), ('Qual é o nome do hotel em O Iluminado?', 'Overlook', 'Bates', 'Hill House', 'Norman', 'A'), ('Quem é o antagonista do filme Psicose?', 'Norman Bates', 'Michael Myers', 'Jason Voorhees', 'Freddy Krueger', 'A'), ('Qual é o nome do espírito em Invocação do Mal 2?', 'Valak', 'Annabelle', 'Pazuzu', 'Crooked Man', 'A'), ('O que acontece quando você assiste à fita de vídeo em O Chamado?', 'Você desaparece', 'Você morre em 7 dias', 'Você é possuído', 'Você vê o futuro', 'B'), ('Quem é o espírito vingativo em A Morte do Demônio?', 'Samara', 'Kandarian', 'Valak', 'Annabelle', 'B'), ('Qual é o nome da lenda urbana da mulher com tesoura no Japão?', 'Kuchisake-Onna', 'Sadako', 'Kayako', 'Yuki-Onna', 'A'), ('Em qual filme um grupo de amigos é perseguido após roubar um artefato?', 'Jogos Mortais', 'Pânico na Floresta', 'Espíritos: A Morte está ao seu Lado', 'Hereditário', 'C'), ('Qual é o espírito que amaldiçoa a casa em O Grito?', 'Sadako', 'Kayako', 'Annabelle', 'Pazuzu', 'B'), ('Quem é o assassino mascarado de Pânico?', 'Ghostface', 'Michael Myers', 'Jason Voorhees', 'Freddy Krueger', 'A'), ('Qual é o nome do filme em que pessoas ficam presas em um jogo mortal?', 'Jogos Mortais', 'O Iluminado', 'Hereditário', 'It: A Coisa', 'A'), ('Qual é o título do filme sobre uma câmera amaldiçoada?', 'O Chamado', 'Polaroid', 'Annabelle', 'Sobrenatural', 'B'), ('Qual é a criatura no filme A Bruxa de Blair?', 'Uma bruxa', 'Um demônio', 'Um espírito', 'Um vampiro', 'A'), ('Como se chama o demônio de Hereditário?', 'Paimon', 'Pazuzu', 'Azazel', 'Valak', 'A'), ('Em Sobrenatural, como é chamado o plano espiritual?', 'O Limbo', 'O Além', 'O Vazio', 'O Outro Mundo', 'B'), ('Qual é o objetivo principal do Jigsaw em Jogos Mortais?', 'Matar pessoas', 'Ensinar lições', 'Se vingar', 'Causar terror', 'B'), ('Qual é o nome do espírito que aparece em Poltergeist?', 'Beelzebub', 'Carol Anne', 'Valak', 'Kane', 'D'), ('Qual é o filme onde crianças desaparecem em um campo de milho?', 'Colheita Maldita', 'O Chamado', 'Pânico na Floresta', 'Jogos Mortais', 'A'), ('O que atrai a criatura em Um Lugar Silencioso?', 'Sons', 'Cheiros', 'Movimento', 'Luzes', 'A'), ('Quem é o diretor do filme Psicose?', 'Steven Spielberg', 'Alfred Hitchcock', 'James Wan', 'John Carpenter', 'B'), ('Qual é o destino dos personagens que veem a criatura em Bird Box?', 'Eles morrem', 'Ficam cegos', 'Se suicidam', 'Se tornam violentos', 'C'), ('Qual é o nome da bruxa que aparece em A Bruxa?', 'Thomasin', 'Black Phillip', 'Katherine', 'Ela não tem nome', 'D'), ('Em qual filme um espírito possui um quadro?', 'O Quadro do Diabo', 'Invocação do Mal', 'Sobrenatural', 'Hereditário', 'B'), ('Qual é o nome da boneca no universo de Invocação do Mal?', 'Chucky', 'Annabelle', 'Valak', 'Crooked Man', 'B'), ('Qual é o filme sobre pessoas sendo perseguidas por uma entidade após relações sexuais?', 'It Follows', 'Hereditário', 'O Chamado', 'Sobrenatural', 'A'), ('Qual é a principal ameaça no filme Nós?', 'Zumbis', 'Clones', 'Demônios', 'Vampiros', 'B'), ('Qual é o segredo da mãe em O Orfanato?', 'Ela matou o filho', 'Ela escondeu um crime', 'Ela era adotada', 'Ela era um fantasma', 'A'), ('Qual é o nome do espírito que assombra a vila no filme Midsommar?', 'Hårga', 'Sigrid', 'Ymir', 'Aslaug', 'A')";

		
				try {
					Connection  conexao = DriverManager.getConnection(URL2,"root","");
					PreparedStatement operacao = conexao.prepareStatement(sql);//vai associar o sql ao banco de dados
					operacao.execute();//agora ele vai executar o sql naquela conexão ali em cima. O driverManager é para criar a conexão, e essa linha é para executar a operação.
					System.out.println("Inserido com sucesso!");
					conexao.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
	
	}
}
