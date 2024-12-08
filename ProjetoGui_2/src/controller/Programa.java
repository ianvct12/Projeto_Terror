package controller;

import dao.Inicializacao;
import viewer.Login;
import viewer.Mapa;

public class Programa {

	public static void main(String[] args) {//É o método main que vai abrir a janela.
		Inicializacao inicializacao = new Inicializacao();
		Login login = new Login();//criou uma instância de login
		Mapa mapa = new Mapa();
		
		//inicializacao.criarBanco();
		//inicializacao.criarTabela();
		//inicializacao.inserir();
		//login.setVisible(true);//vai tornar o Jframe verdadeiro.Criamos uma especialização do Jframe.
		mapa.setVisible(true);
		
	}

}
