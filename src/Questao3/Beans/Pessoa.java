package Questao3.Beans;

import java.time.LocalDate;

public abstract class Pessoa {
	private Long codigo;
	private String email;
	private String nome;
	private LocalDate dataNasc;
	private String cidade;

	public Pessoa(Long codigo, String email, String nome, LocalDate dataNasc, String cidade) {
		this.codigo = codigo;
		this.email = email;
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.cidade = cidade;
	}

	public Pessoa(){

	}

	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

}
