package Questao3.Beans;

import java.time.LocalDate;

public class Participante extends Pessoa {
	private String interesses;

	public Participante(Long codigo, String email, String nome, LocalDate dataNasc, String cidade, String interesses) {
		super(codigo, email, nome, dataNasc, cidade);
		this.interesses = interesses;
	}

	public String getInteresses() {
		return interesses;
	}

	public void setInteresses(String interesses) {
		this.interesses = interesses;
	}
}
