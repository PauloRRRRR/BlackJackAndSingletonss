package Questao2.Beans;

import java.time.LocalDate;

public class Usuario {
	private String email;
	private String nomeCompleto;
	private LocalDate datanasc;
	
	public Usuario(String email, String nomeCompleto, LocalDate datanasc) {
		super();
		this.email = email;
		this.nomeCompleto = nomeCompleto;
		this.datanasc = datanasc;
	}

	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public LocalDate getDatanasc() {
		return datanasc;
	}
	public void setDatanasc(LocalDate datanasc) {
		this.datanasc = datanasc;
	}
	
	
}
