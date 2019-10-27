package Questao2.Beans;

import java.time.LocalDate;
import java.util.ArrayList;

public class Produtor extends Usuario {
	public String nomeCanal;
	public ArrayList<String> categoria;
	
	public Produtor(String nomeCanal, ArrayList<String> categorias, String nome, String email,LocalDate datanasc) {
		super(email, nome, datanasc);
		this.nomeCanal = nomeCanal;
		this.categoria = categorias;
	}
	
	public Produtor() {
		super();
	}
	
	public String getNomeCanal() {
		return nomeCanal;
	}
	public void setNomeCanal(String nomeCanal) {
		this.nomeCanal = nomeCanal;
	}
	public ArrayList<String> getCategorias() {
		return categoria;
	}
	public void setCategorias(ArrayList<String> categorias) {
		categoria = categorias;
	}
	
	
}
