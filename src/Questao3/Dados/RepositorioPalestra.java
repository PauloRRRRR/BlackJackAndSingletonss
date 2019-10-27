package Questao3.Dados;

import Questao3.Beans.Avaliacao;
import Questao3.Beans.Palestra;

import java.util.ArrayList;
import java.util.List;

public class RepositorioPalestra {
	private static RepositorioPalestra palestras;
	private ArrayList<Palestra> palestrasArray;
	private Palestra palestra;

	private RepositorioPalestra(){
		this.palestra = new Palestra();
		this.palestrasArray = new ArrayList<>();
	}

	public static RepositorioPalestra getInstance(){
		if(palestras==null){
			palestras = new RepositorioPalestra();
		}
		return palestras;
	}
	
	public void inserirPalestra(Palestra p) {
		if(p!=null) {
				for(Palestra f: palestrasArray) {
					if(p.getId().equals(f.getId())) {
						System.out.println("Palestra ja cadastrada");
					}
					else {
						palestrasArray.add(p);
						System.out.println("Palestra cadastrada com sucesso");
					}
				}//for
		}//if
	}
	
	public boolean buscarPalestraPorId(int id) {
		boolean retorno = false;
		if(palestrasArray.isEmpty()) {
			palestrasArray = new ArrayList<Palestra>();
		}
		for(Palestra f: palestrasArray) {
			if(f.id.intValue() == id) {
				retorno = true;
			}
		}
		return retorno;
	}
	
	public List<Palestra> listarPalestras(){
		List<Palestra> palestrasCadastradas = new ArrayList<Palestra>();
		if(palestrasArray.isEmpty()) {
			palestrasArray = new ArrayList<Palestra>();
		}
		for(Palestra f: palestrasArray) {
			if(f!=null) {
				palestrasCadastradas.add(f);
			}
		}
		return palestrasCadastradas;
	}

	public List<Palestra> listarPalestrasNessaMedia(double media){
		List<Palestra> palestrasNaMedia = new ArrayList<>();
		for(Palestra f: palestrasArray){
			if(palestra.mediaNotas(f.getAvaliacoes())>=media){
				palestrasNaMedia.add(f);
			}
		}
		return palestrasNaMedia;
	}

	List<Avaliacao> listarTodasAvaliacoes(){
		List<Avaliacao> avaliacoesCadastradas = new ArrayList<Avaliacao>();
		if(palestrasArray.isEmpty()) {
			palestrasArray = new ArrayList<Palestra>();
		}
		
		for(Palestra f: palestrasArray) {
			avaliacoesCadastradas.addAll(f.avaliacoes);
		}

		return avaliacoesCadastradas;
	}
}
