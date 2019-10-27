package Questao3.Beans;

import java.time.LocalDate;

public class Palestrante extends Pessoa {
	private String empresa;

	public Palestrante(Long codigo, String email, String nome, LocalDate dataNasc, String cidade, String empresa) {
		super(codigo, email, nome, dataNasc, cidade);
		this.empresa = empresa;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

}
