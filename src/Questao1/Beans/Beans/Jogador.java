package Questao1.Beans.Beans;

import java.util.ArrayList;

public class Jogador {
	private static boolean vitoria;
	private int fichas;
	private ArrayList<Carta> cartas;

	public Jogador() {
		this.cartas = new ArrayList<>();
		this.fichas = 100;
		vitoria = false;
	}

	public ArrayList<Carta> getCartas() {
		return cartas;
	}

	public void setCartas(ArrayList<Carta> cartas) {
		this.cartas = cartas;
	}

	public int getFichas() {
		return fichas;
	}

	public void setFichas(int fichas) {
		this.fichas = fichas;
	}

	public void hit(Carta carta){
		cartas.add(carta);
	}

	public int verificarValorCartas(){
		int valor = 0;
		for(Carta f: cartas){
			valor = valor+f.getValor().getNumero();
		}
		return valor;
	}

	public boolean getVitoria(){
		return vitoria;
	}

	public void setVitoria(boolean v){
		vitoria = v;
	}

	public void stay(){
		int valores = 0;
		for(Carta f: cartas){
			valores = valores+f.getValor().getNumero();
		}
		if(valores==21){
			vitoria = true;
		}
	}

}
