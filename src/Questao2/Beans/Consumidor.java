package Questao2.Beans;

import java.time.LocalDate;
import java.util.ArrayList;

public class Consumidor extends Usuario {
	private ArrayList<String> interesseCategorias;

	public Consumidor(ArrayList<String> interesseCategorias,String email, String nome, LocalDate datanasc) {
		super(email, nome, datanasc);
		this.interesseCategorias = interesseCategorias;
	}

	public ArrayList<String> getInteresseCategorias() {
		return interesseCategorias;
	}

	public void setInteresseCategorias(ArrayList<String> interesseCategorias) {
		this.interesseCategorias = interesseCategorias;
	}
	
}
