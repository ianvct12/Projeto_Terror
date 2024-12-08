package model;

public class Pergunta {
	private String enunciado, opcaoa,opcaob, opcaoc, opcaod;
	private char gabarito;
	
	public Pergunta() {
		
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public String getOpcaoa() {
		return opcaoa;
	}

	public void setOpcaoa(String opcaoa) {
		this.opcaoa = opcaoa;
	}

	public String getOpcaob() {
		return opcaob;
	}

	public void setOpcaob(String opcaob) {
		this.opcaob = opcaob;
	}

	public String getOpcaoc() {
		return opcaoc;
	}

	public void setOpcaoc(String opcaoc) {
		this.opcaoc = opcaoc;
	}
	
	public String getOpcaod() {
		return opcaod;
	}

	public void setOpcaod(String opcaod) {
		this.opcaod = opcaod;
	}

	public char getGabarito() {
		return gabarito;
	}

	public void setGabarito(char gabarito) {
		this.gabarito = gabarito;
	}
	
	

}
