package controller;

import dao.DaoPergunta;
import model.Pergunta;

public class ControlePergunta {
	private Pergunta pergunta = new Pergunta();
	private DaoPergunta daoPergunta = new DaoPergunta();
	
	public Pergunta consultarPergunta(int id) {//quando eu clicar no botão, ele vai chamar o consultar pergunta. Aí o consultar pergunta vai por meio do DaoPerguntar, vai 
		pergunta = daoPergunta.consultar(id);
		return pergunta;
	}
}

//Tudo começa com o usuário que faz o input na janela gráfico, que manda mensagem para o controle, e depois para o modelo, modelo retorna para o controle e depois output para o usuário. 
//O mapa é a janela, aí o botão do mapa tá mandando mensagem para o consultar pergunta que tá no controle, passando o id da pergunta que ele quer.
//Aí no controle ele recebe a mensagem com o id, aí ele manda mensagem para o consultar do DAO, e passa o ID para o consultar do DAO.
//Aí o Consultar do DAO recebe o ID, consulta o ID no banco de dados, pega o resultado da consulta, bota no objeto da pergunta e retorna essa pergunta para o controle.
//Aí voltamos para o controle, aí o controle recebe do DAO o objeto de pergunta, pega esse objeto de pergunta e retorna para a Janela(MAPA).
//Aí o MAPA retorna o output para o monitor do usuário.
